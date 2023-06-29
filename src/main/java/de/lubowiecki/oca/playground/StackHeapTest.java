package de.lubowiecki.oca.playground;

public class StackHeapTest {

    public static void main(String[] args) {

        String s;
        s = "Hi";
        s = "Hallo";

        Box box = new Box();
        box.setContent("12345...");
        box.setContent(null);
        box.setContent("ABC");

        box = null;


    }
}

class Box {

    private String content; // Standard null

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
