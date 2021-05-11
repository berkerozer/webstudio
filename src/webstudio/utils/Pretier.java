package webstudio.utils;

import webstudio.html.Element;

public interface Pretier {
    public static String formatHtml(Element element){

        String[] splited = element.toString().split("\\r?\\n");
        String combined = "";
        for ( String i : splited){
            combined += i;
        }

        return combined;
    }
}
