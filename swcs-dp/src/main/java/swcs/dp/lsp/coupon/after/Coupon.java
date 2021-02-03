package swcs.dp.lsp.coupon.after;

import java.math.BigDecimal;

public interface Coupon {

    BigDecimal getRegularPrice();

    /**
     * Returns a {@code BigDecimal} whose value is {@code (+this)},
     * minus the provided discount.
     *
     * @param discount the discount to use.
     * @return {@code this}, minus the discount. If the discount is
     *         greater than the regular price {@code BigDecimal.ZERO} will be returned.
     *         If the discount is {@code null} than this discount will not be subtracted.
     */
    BigDecimal afterDiscount(BigDecimal discount);
}