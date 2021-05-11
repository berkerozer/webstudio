package webstudio.html;

import webstudio.utils.Pretier;

import java.util.ArrayList;

public abstract class Element implements IElement{
    String tag;
    ArrayList<String> classes = new ArrayList<String>();
    ArrayList<String> ids = new ArrayList<String>();
    ArrayList<Element> elements = new ArrayList<Element>();
    String content;

    public Element(String tag, ArrayList<String> classes, ArrayList<String> ids, ArrayList<Element> elements) {
        this.tag = tag;
        this.classes = classes;
        this.ids = ids;
        this.elements = elements;
    }

    public Element(String tag, ArrayList<String> classes, ArrayList<String> ids) {
        this.tag = tag;
        this.classes = classes;
        this.ids = ids;
    }

    public Element(String tag, ArrayList<String> classes) {
        this.tag = tag;
        this.classes = classes;
    }

    public Element(String tag) {
        this.tag = tag;
    }

    public Element() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    public void addClass(String classTag) {
        this.classes.add(classTag);
    }

    public ArrayList<String> getIds() {
        return ids;
    }

    public void setIds(ArrayList<String> ids) {
        this.ids = ids;
    }

    public ArrayList<Element> getelements() {
        return elements;
    }

    public void setelements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public void addelements(Element elements) {
        this.elements.add(elements);
    }

    @Override
    public String toHtml() {
        return "Element{" +
                "tag='" + tag + '\'' +
                ", classes=" + classes +
                ", ids=" + ids +
                ", elements=" + elements +
                '}';
    }

    @Override
    public String toString() {
        String start = String.format("\n<%s>\n", tag);

        if (content != null){
            //start += ("\n\t" + content);
        }

        for (int i = 0; i < elements.size(); i++){
            start += (Pretier.formatHtml(elements.get(i)));
        }

        return String.format(start + "\n</%s>", tag);




    }
}
