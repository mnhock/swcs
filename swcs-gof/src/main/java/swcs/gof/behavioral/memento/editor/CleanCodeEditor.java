package swcs.gof.behavioral.memento.editor;

public final class CleanCodeEditor implements Editor {

    private final History history = new History();

    private String content;
    private int fontSize;
    private String fontName;

    public CleanCodeEditor(String content, int fontSize, String fontName) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return this.content;
    }

    public int getFontSize() {
        return this.fontSize;
    }

    public String getFontName() {
        return this.fontName;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    @Override
    public void save() {
        EditorState state = new CleanCodeEditorState(this.content, this.fontSize, this.fontName);

        this.history.push(state);
    }

    @Override
    public void restore() {
        EditorState state = this.history.pop();

        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }
}