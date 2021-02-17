package swcs.dp.lsp.coupon.after;

import java.math.BigDecimal;

public class RegularCoupon implements Coupon {

    private final BigDecimal regularPrice;

    public RegularCoupon(BigDecimal regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public BigDecimal regularPrice() {
        return this.regularPrice;
    }

    @Override
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
