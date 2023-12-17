package swcs.dp.lsp.coupon.after;

import java.math.BigDecimal;

class Client {

    private static final BigDecimal REGULAR_PRICE = BigDecimal.valueOf(8.99);

    public static void main(String[] args) {
        testCoupon(new RegularCoupon(REGULAR_PRICE), null);
        testCoupon(new PromotionCoupon(REGULAR_PRICE), null);

        testCoupon(new RegularCoupon(REGULAR_PRICE), BigDecimal.valueOf(5));
        testCoupon(new PromotionCoupon(REGULAR_PRICE), BigDecimal.valueOf(5));

        testCoupon(new RegularCoupon(REGULAR_PRICE), BigDecimal.valueOf(10));
        testCoupon(new PromotionCoupon(REGULAR_PRICE), BigDecimal.valueOf(10));
    }

    private static void testCoupon(Coupon coupon, BigDecimal discount) {
        BigDecimal price = coupon.afterDiscount(discount);

        if (BigDecimal.ZERO.compareTo(price) == 0) { // Client code relies on Coupon implementation
            System.out.println("You get it for free!");
        } else {
            System.out.printf("Pay %f%n", price);
        }
    }
}
