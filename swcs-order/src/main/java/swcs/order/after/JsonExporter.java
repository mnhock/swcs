package swcs.order.after;

import java.io.Writer;

public class JsonExporter implements Order.Exporter {

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
