package swcs.dp.lsp.coupon.before;

import java.math.BigDecimal;

public class PromotionCoupon extends Coupon {

    private static final double PERCENTAGE_DISCOUNT = 0.9;

    public PromotionCoupon(BigDecimal regularPrice) {
        super(regularPrice);
    }

    @Override
    public BigDecimal afterDiscount(BigDecimal discount) {
        // strengthened pre-conditions and no check for null
        if (getRegularPrice().compareTo(discount) < 0) {
            throw new IllegalArgumentException("Discount can not be greater than the price!");
        }

        return super.afterDiscount(discount)
                .multiply(BigDecimal.valueOf(PERCENTAGE_DISCOUNT));
    }
}
