package swcs.dp.lsp.coupon.before;

import java.math.BigDecimal;

public class Client {

    private static final BigDecimal REGULAR_PRICE = BigDecimal.valueOf(8.99);

    public static void main(String[] args) {
        testCoupon(new Coupon(REGULAR_PRICE), null);
        testCoupon(new PromotionCoupon(REGULAR_PRICE), null);

        testCoupon(new Coupon(REGULAR_PRICE), BigDecimal.valueOf(5));
        testCoupon(new PromotionCoupon(REGULAR_PRICE), BigDecimal.valueOf(5));

        testCoupon(new Coupon(REGULAR_PRICE), BigDecimal.valueOf(10));
        testCoupon(new PromotionCoupon(REGULAR_PRICE), BigDecimal.valueOf(10));
    }

    private static void testCoupon(Coupon coupon, BigDecimal discount) {
        BigDecimal price = coupon.afterDiscount(discount);

        // Client code relies on Coupon implementation
        if (BigDecimal.ZERO.compareTo(price) == 0) {
            System.out.println("You get it for free!");
        } else {
            System.out.printf("Pay %f%n", price);
        }
    }
}
