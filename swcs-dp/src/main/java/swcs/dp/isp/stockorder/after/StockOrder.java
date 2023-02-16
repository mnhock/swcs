package swcs.dp.isp.stockorder.after;

public interface StockOrder {

    void sell(StockId id, int quantity, Price price);

    void buy(StockId id, int quantity, Price price);

}
