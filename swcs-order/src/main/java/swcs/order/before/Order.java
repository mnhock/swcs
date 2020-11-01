package swcs.order.before;

import java.io.Writer;

public class Order {

    public enum Format {
        JSON, XML
    }

    private int id;

    public Order(int id) {
        this.id = id;
    }

    public Order(String source, Format inputFormat) {
        // ... logic implementation
    }

    public void exportAsJson(Writer out) {
        // ... logic implementation
    }

    public void exportAsXml(Writer out) {
        // ... logic implementation
    }
}
