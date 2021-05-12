package webstudio.html;

import java.util.ArrayList;

public class HtmlElement extends Element {
    public HtmlElement(String tag, String[] classList, Element[] elements) {
        super(tag);
        super.setClassList(classList);
        super.setElementList(elements);
    }

    public HtmlElement(String tag, Element[] elements){
        super(tag);
        super.setElementList(elements);
    }

    public HtmlElement(String tag, String[] classList) {
        super(tag);
        super.setClassList(classList);
    }

    public HtmlElement(String tag) {
        super(tag);
    }
}
