package webstudio.html;

public class Head implements IElement{

    private String title;
    private String desc;

    public Head(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return String.format(
                "\t<head>\n" +
                "\t\t<meta charset='UTF-8'>\n" +
                "\t\t<meta name='description' content='%s'>\n" +
                "\t</head>"
                ,this.title );
    }

    @Override
    public String toHtml() {
        return null;
    }
}
