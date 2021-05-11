package webstudio.html;

import java.util.ArrayList;

public class HtmlElement extends Element {
    public HtmlElement(String tag, ArrayList<String> classes, ArrayList<String> ids) {
        super(tag, classes, ids);
    }

    public HtmlElement(String tag, ArrayList<String> classes) {
        super(tag, classes);
    }

    public HtmlElement(String tag) {
        super(tag);
    }
}
