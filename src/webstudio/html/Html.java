package webstudio.html;

import java.util.ArrayList;

public class Html implements IElement {

    private Head head;
    private Body body;

    public Html() {

        this.head = new Head("test","test");
        this.body = new Body();

    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toHtml() {
        return head.toHtml();
    }

    @Override
    public String toString() {
        return "<html>\n"+ head.toString() + body.toString() + "\n</html>";
    }

    public void build() {
        return;
    }

}
