package webstudio.elements;

import webstudio.html.Element;

public class title extends Element {

    private int size = 6;
    private String content = "";

    /**
     * Constructs an empty list with the specified initial capacity.
     *
     * @param  size  head boyutu
     * @throws IllegalArgumentException if the specified initial capacity
     *         is negative
     */
    public title(int size, String content) {
        super("h" + size);
        this.content = content;
        if (size<7 && size>0){

            this.size = size;
            super.setTag("h"+size);
        }
        else {
            throw new IllegalArgumentException("Illegal boyut: "+
                    size);
            //super.setTag("h"+this.size);
        }
    }

    @Override
    public String toString() {
        return "<h" + size + ">" + content + "</h" + size + ">";
    }
}
