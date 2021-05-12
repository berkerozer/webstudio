import webstudio.elements.title;
import webstudio.html.*;
import webstudio.utils.Pretier;

public class Main {
    public static void main(String[] args) {

        Head head = new Head("Berker Özer Personal Blog", "Developers Blog");
        Body body = new Body(new HtmlElement[]{
                new HtmlElement("div", new Element[] {
                        new title(1,"test başlık")
                }),
                new HtmlElement("div", new Element[] {
                        new title(6,"Test Başlık")
                })
        });

        Html html = new Html();
        html.setHead(head);
        html.setBody(body);

        System.out.println(Pretier.formatHtml(html.toString()));


    }
}
