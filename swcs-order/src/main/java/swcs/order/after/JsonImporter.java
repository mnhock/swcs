package swcs.order.after;

import java.io.Reader;

public class JsonImporter implements Order.Importer {

    private final Reader in;

    public JsonImporter(Reader in) {
        this.in = in;
    }

    @Override
    public Order importOrder() {
        // ... logic implementation

        return new Order(123);
    }
}
