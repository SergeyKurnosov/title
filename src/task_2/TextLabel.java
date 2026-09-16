package task_2;

public class TextLabel implements Drawable {
    private String text;

    public TextLabel(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println(text);
    }
}
