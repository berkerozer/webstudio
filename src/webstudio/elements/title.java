package webstudio.elements;

import webstudio.html.Element;

public class title extends Element {

    private int size = 6;
    private String content = "";

    public title(int size, String content) {
        super("h" + size);
        this.content = content;
        if (size<7 && size>0){
            this.size = size;
            super.setTag("h"+size);
        }
        else {
            super.setTag("h"+this.size);
        }

    }

    @Override
    public String toString() {
        return "<h" + size + ">" + content + "</h" + size + ">";
    }
}
