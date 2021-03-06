package webstudio.html;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Element implements IElement{
    String tag;
    String id;
    ArrayList<String> classList = new ArrayList<String>();
    ArrayList<Element> elements = new ArrayList<Element>();

    public Element() {
    }

    public Element(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public Element setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public String getHtmlId() {
        return id == null ? "" : " id='" + id + "' ";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHtmlClass() {
        String htmlClass = "";
        if (classList.size() != 0){
            htmlClass += " class='";
            for (int i = 0; i < classList.size(); i++) {
                if (i == classList.size() - 1){
                    htmlClass += classList.get(i);
                }else {
                    htmlClass += classList.get(i) + " ";
                }
            }
            htmlClass += "' ";
        }
        return htmlClass;
    }

    public ArrayList<String> getClassList() {
        return classList;
    }

    public void setClassList(String[] classList) {
        this.classList.addAll(Arrays.asList(classList));
    }

    public void addClass(String htmlClass){
        this.classList.add(htmlClass);
    }

    public String getInsideHtml(){
        String content = "";
        for (Element element : elements){
            content += element.toString();
        }
        return content;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public void setElementList(Element[] elementList) {
        this.elements.addAll(Arrays.asList(elementList));
    }

    public Element addElement(Element element){
        this.elements.add(element);
        return this;
    }

    public void addElement(Element element,int index){
        this.elements.add(index,element);
    }

    public Element Padding(String value){
        addClass("p-"+value);
        return this;
    }

    public String cssString(){
        return "";
    }

    @Override
    public String toString() {

        return "<" + tag + getHtmlId() + getHtmlClass() + ">" + getInsideHtml() + "</" + tag + ">";

    }
}
