package swcs.dp.dip.notification.before;

class NotificationService {

  private final EmailSender emailSender = new EmailSender();

  public void notify(String msg) {
    this.emailSender.send(msg);
  }
}