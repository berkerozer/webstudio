import webstudio.html.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Html html = new Html();
        Body body = new Body();


        HtmlElement div1 = new HtmlElement("div");
        HtmlElement div2 = new HtmlElement("label");

        div1.setContent("berker özer");
        div1.addelements(div2);
        body.addelements(div1);




        //Head head = new Head("test", "test");

        //System.out.println(head);

        html.setBody(body);
        System.out.println(html);
    }

}
