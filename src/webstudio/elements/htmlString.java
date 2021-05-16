package webstudio.elements;

import webstudio.html.Element;

public class htmlString extends Element {

    String htmlString;

    public htmlString(String content) {
        super();
        this.htmlString = content;
    }

    public htmlString(String tag, String content) {
        super(tag);
        this.htmlString = content;
    }

    @Override
    public String toString() {
        if (getTag() == null){
            return htmlString;
        }else {
            return "<" + getTag() + getHtmlId() + getHtmlClass() + ">" + htmlString + "</" + getTag() + ">";
        }
    }
}

