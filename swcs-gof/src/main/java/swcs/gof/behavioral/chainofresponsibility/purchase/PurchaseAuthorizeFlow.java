package swcs.gof.behavioral.chainofresponsibility.purchase;

public interface PurchaseAuthorizeFlow {

    void next(Employee nextEmployee);

}
