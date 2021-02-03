package swcs.dp.lsp.coupon.after;

import java.math.BigDecimal;

public final class PromotionCoupon extends RegularCoupon {

    private static final double PERCENTAGE_DISCOUNT = 0.9;

    public PromotionCoupon(BigDecimal regularPrice) {
        super(regularPrice);
    }

    @Override
    public BigDecimal afterDiscount(BigDecimal discount) {
        return super.afterDiscount(discount)
                .multiply(BigDecimal.valueOf(PERCENTAGE_DISCOUNT));
    }
}
