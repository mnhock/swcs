package swcs.gof.behavioral.memento.editor;

import java.util.Stack;

public final class History {

    private final Stack<EditorState> history;

    public History() {
        this.history = new Stack<>();
    }

    public void push(EditorState state) {
        this.history.push(state);
    }

    public EditorState pop() {
        return this.history.pop();
    }
}