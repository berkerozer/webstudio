package webstudio.html;

public class Body extends Element {

    private String template;

    public Body() {
        super("body");
    }

    public Body(Element[] elements) {
        super("body");
        super.setElementList(elements);
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String toString() {
        String start = String.format("<%s>", tag);

        for (int i = 0; i < elements.size(); i++){
            start += ("" + elements.get(i).toString());
        }

        return String.format(start + "</%s>", tag);


    }
}
