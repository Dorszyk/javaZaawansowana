package TypyGeneryczne.Ex4;

public class Newspaper extends MediaConten{

    private String editor;

    public Newspaper(String title, String editor) {
        super(title);
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
