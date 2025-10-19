package swcs.dp.dip.notification.after;

class NotificationService {

  private final MessageSender sender;

  NotificationService(MessageSender sender) {
    this.sender = sender;
  }

  public void notify(String msg) {
    this.sender.send(msg);
  }
}