package swcs.order.after;

import java.io.Writer;

public class JsonExporter implements Exporter {

    private final Writer writer;

    public JsonExporter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void exportOrder(Order order) {
        // ... logic implementation

        // this.writer.write("{ \"order.id\":\"" + order.id() + "\"");
    }
}
