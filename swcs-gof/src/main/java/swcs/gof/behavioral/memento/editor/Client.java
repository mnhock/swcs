package swcs.gof.behavioral.memento.editor;

public class Client {

    public static void main(String[] args) {
        Editor editor = new CleanCodeEditor("Java Clean Code", 12, "Courier New");
        editor.save();

        editor.setContent("Java");
        editor.save();

        editor.restore();
        System.out.println(((CleanCodeEditor) editor).getContent());

        editor.restore();
        System.out.println(((CleanCodeEditor) editor).getContent());
    }
}