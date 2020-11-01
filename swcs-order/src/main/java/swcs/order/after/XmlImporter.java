package swcs.order.after;

import java.io.Reader;

public class XmlImporter implements Order.Importer {

    private final Reader in;

    public XmlImporter(Reader in) {
        this.in = in;
    }

    @Override
    public Order importOrder() {
        // ... logic implementation

        return new Order(123);
    }
}
