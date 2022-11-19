package swcs.dp.isp.stockorder.after;

import swcs.dp.isp.stockorder.before.StockId;

public interface StockOrder {

    void sell(StockId id, int quantity, Price price);

    void buy(StockId id, int quantity, Price price);

}
