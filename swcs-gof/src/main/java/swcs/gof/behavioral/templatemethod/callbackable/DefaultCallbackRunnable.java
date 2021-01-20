package swcs.gof.behavioral.templatemethod.callbackable;

public class DefaultCallbackRunnable extends AbstractCallbackRunnable {

    @Override
    public void beforeRun() {
        System.out.println("beforeRun()");
    }

    @Override
    public void afterRun() {
        System.out.println("afterRun()");
    }

    @Override
    public void onError(Exception e) {
        System.out.println("onError()");
    }

    @Override
    public void onSuccess() {
        System.out.println("onSuccess()");
    }

    @Override
    public void startRun() throws Exception {
        System.out.println("startRun()");
    }

}
