package swcs.gof.behavioral.templatemethod.callbackable;

interface Callbackable extends Runnable {

    void beforeRun();

    void afterRun();

    void onError(Exception e);

    void onSuccess();

}
