package swcs.gof.structural.decorator.message;

class Client {

    public static void main(String[] args) {
        new DefaultMessage().print("DefaultMessage");
        new UpperCaseMessage(new DefaultMessage()).print("DefaultMessage");
        new TimeStampMessage(new DefaultMessage()).print("DefaultMessage");
        new UpperCaseMessage(new TimeStampMessage(new DefaultMessage())).print("DefaultMessage");
    }
}
