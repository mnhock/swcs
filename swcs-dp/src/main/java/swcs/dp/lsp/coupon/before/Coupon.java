package swcs.dp.lsp.coupon.before;

import java.math.BigDecimal;

public class Coupon {

    private final BigDecimal regularPrice;

    public Coupon(BigDecimal regularPrice) {
        this.regularPrice = regularPrice;
    }

    public BigDecimal getRegularPrice() {
        return this.regularPrice;
    }

    public BigDecimal afterDiscount(BigDecimal discount) {
        if (discount == null) {
            return this.regularPrice;
        }
        
        if (this.regularPrice.compareTo(discount) > 0) {
            return this.regularPrice.subtract(discount);
        }

        return BigDecimal.ZERO;
    }
}
