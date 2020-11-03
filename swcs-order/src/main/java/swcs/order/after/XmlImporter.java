package swcs.order.after;

import java.io.Reader;

public class XmlImporter implements Order.Importer {

    private final Reader reader;

    public XmlImporter(Reader reader) {
        this.reader = reader;
    }

    @Override
    public Order importOrder() {
        // ... logic implementation

        return new Order(123);
    }
}
