package webstudio.elements;

import webstudio.html.Element;

public class text extends Element{

    String htmlString;

    public text(String content) {
        super();
        this.htmlString = content;
    }

    public text(String tag, String content) {
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



