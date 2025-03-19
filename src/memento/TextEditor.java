package memento;
// Originator
public class TextEditor {
    public StringBuilder text;

    public TextEditor() {
        this.text = new StringBuilder();
    }

    public void appendText(String newText) {
        text.append(newText);
    }

    public String getText() {
        return text.toString();
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(text.toString());
    }

    public void restore(TextEditorMemento memento) {
        text = new StringBuilder(memento.getText());
    }
}
