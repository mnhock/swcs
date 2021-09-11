package swcs.gof.behavioral.memento.editor;

public interface Editor {

    void setContent(String content);

    void setFontSize(int fontSize);

    void setFontName(String fontName);

    void save();

    void restore();
}