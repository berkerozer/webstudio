package webstudio.html;

public class Head implements IElement{

    private String charset = "<meta charset='UTF-8'>";
    private String keywords;
    private String description;
    private String author;
    private String refresh;
    private String viewport = "<meta name='viewport' content='width=device-width, initial-scale=1.0'>";
    private String title;

    public Head() {
    }

    public Head(String title) {
        this.setTitle(title);
    }

    public Head(String title, String description) {
        this.setTitle(title);
        this.setDescription(description);
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = "<meta charset='" + charset + "'>";
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = "<meta name='keywords' content='" + keywords + "'>";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = "<meta name='description' content='" + description + "'>";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = "<meta name='author' content='" + author + "'>";
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = "<meta http-equiv='refresh' content='" + refresh + "'>";
    }

    public String getViewport() {
        return viewport;
    }

    public void setViewport() {
        this.viewport = "<meta name='viewport' content='width=device-width, initial-scale=1.0'>";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = "<title>" + title + "</title>";
    }

    @Override
    public String toString() {
        return "<head>" +
                (charset == null ? "" : charset) +
                (keywords == null ? "" : keywords) +
                (description == null ? "" : description) +
                (author == null ? "" : author) +
                (refresh == null ? "" : refresh) +
                (viewport == null ? "" : viewport) +
                (title == null ? "" : title) +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">"+
                "</head>";
    }


}
