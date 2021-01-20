package swcs.gof.behavioral.chainofresponsibility.purchase;

public interface Employee extends PurchaseAuthorizeFlow {

    void authorize(Purchase purchase);

}
