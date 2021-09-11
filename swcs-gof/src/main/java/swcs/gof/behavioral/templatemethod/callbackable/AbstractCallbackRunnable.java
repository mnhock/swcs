package swcs.gof.behavioral.templatemethod.callbackable;

import java.time.LocalDateTime;

abstract class AbstractCallbackRunnable implements Callbackable {

    private final LocalDateTime submittedTime;

    private Status status = Status.UNKNOWN;
    private LocalDateTime startedTime;
    private LocalDateTime finishedTime;

    AbstractCallbackRunnable() {
        this.submittedTime = LocalDateTime.now();
        this.status = Status.WAITING;
    }

    @Override
    public void run() {
        try {
            beforeRunIntern();
            startRun();
            onSuccessIntern();
        } catch (Exception e) {
            onErrorIntern(e);
        } finally {
            afterRunIntern();
        }
    }

    public abstract void startRun() throws Exception;

    private void beforeRunIntern() {
        this.startedTime = LocalDateTime.now();
        this.status = Status.RUNNING;

        beforeRun();
    }

    private void afterRunIntern() {
        this.finishedTime = LocalDateTime.now();
        afterRun();
    }

    private void onErrorIntern(Exception e) {
        this.status = Status.FAILED;
        onError(e);
    }

    private void onSuccessIntern() {
        this.status = Status.COMPLETED;
        onSuccess();
    }

    public Status status() {
        return this.status;
    }

    public LocalDateTime submittedTime() {
        return this.submittedTime;
    }

    public LocalDateTime startedTime() {
        return this.startedTime;
    }

    public LocalDateTime finishedTime() {
        return this.finishedTime;
    }

}