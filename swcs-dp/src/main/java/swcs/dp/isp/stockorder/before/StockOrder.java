package swcs.dp.isp.stockorder.before;

public interface StockOrder {

    void sell(StockId id, double price, int quantity);

    void buy(StockId id, int quantity, double price);

    void buy(StockId id, int quantity, double price, double commission);

    void buy(StockId id, int quantity, double minPrice, double maxPrice, double commission);

}
