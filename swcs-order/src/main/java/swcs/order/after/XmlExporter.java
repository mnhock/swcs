package swcs.order.after;

import java.io.Writer;

public class XmlExporter implements Order.Exporter {

    private final Writer writer;

    public XmlExporter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void exportOrder(Order order) {
        // ... logic implementation

        // this.writer.write("<order><id>" + order.getId() + "</id></order>");
    }

}
