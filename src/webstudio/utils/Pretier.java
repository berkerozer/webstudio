package webstudio.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public interface Pretier {
    static String formatHtml(String element){

        Document doc = Jsoup.parse(element);   // pretty print HTML
        return doc.toString();

    }
}
