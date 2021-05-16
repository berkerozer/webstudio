package webstudio.html;

import java.util.ArrayList;

public class Html implements IElement {

    private Head head;
    private Body body;

    public Html() {}

    public Html(Head head) {
        this.head = head;
    }

    public Html(Body body) {
        this.body = body;
    }

    public Html(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>" +
                "<html>" +
                (head==null ? "<head></head>" : head.toString()) +
                (body==null ? "<body></body>" : body.toString()) +
                "</html>";
    }

    public void build() {
        return;
    }

}
