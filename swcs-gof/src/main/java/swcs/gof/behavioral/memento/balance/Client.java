package swcs.gof.behavioral.memento.balance;

public class Client {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setBalance(40.11d);
        careTaker.push(originator.save());
        System.out.println(originator.getBalance());

        originator.setBalance(100.11d);
        careTaker.push(originator.save());
        System.out.println(originator.getBalance());

        originator.restore(careTaker.pop());
        System.out.println(originator.getBalance());

        originator.restore(careTaker.pop());
        System.out.println(originator.getBalance());
    }
}