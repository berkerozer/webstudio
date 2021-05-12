package webstudio.elements;

import webstudio.html.Element;

public class title extends Element {

    private int size = 6;
    private String content = "";

    public title(int size, String content) {
        super("h" + size);
        this.size = size;
        this.content = content;
    }

    @Override
    public String toString() {
        return "<h" + size + ">" + content + "</h" + size + ">";
    }
}
