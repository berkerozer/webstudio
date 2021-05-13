import webstudio.elements.title;
import webstudio.html.*;
import webstudio.utils.Pretier;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
        SWO_File(Pretier.formatHtml(html.toString()));

    }

    public static void SWO_File(String str){
        try {
            File file=new File("index.html");
            if (file.createNewFile()){
                System.out.println("File created");
            }
            FileWriter writer=new FileWriter("index.html");
            writer.write(str);
            writer.close();
            Desktop desktop=Desktop.getDesktop();
            if (file.exists()){
                desktop.open(file);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
