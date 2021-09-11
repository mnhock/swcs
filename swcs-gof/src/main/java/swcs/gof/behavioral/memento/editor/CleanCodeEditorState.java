package swcs.gof.behavioral.memento.editor;

public final class CleanCodeEditorState implements EditorState {

    private final String content;
    private final int fontSize;
    private final String fontName;

    public CleanCodeEditorState(String content, int fontSize, String fontName) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public int getFontSize() {
        return this.fontSize;
    }

    @Override
    public String getFontName() {
        return this.fontName;
    }
}