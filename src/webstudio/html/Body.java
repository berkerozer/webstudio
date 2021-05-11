package webstudio.html;

public class Body extends Element {

    private String template;

    public Body() {
        super("body");
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public String toString() {
        String start = String.format("\n\t<%s>", tag);

        for (int i = 0; i < elements.size(); i++){
            start += ("\t\t" + elements.get(i).toString());
        }

        return String.format(start + "\n\t</%s>", tag);


    }
}
