package swcs.args.after;

public class ArgsTester {

    public static void main(String[] args) {
        Args arg = new Args("p#,h*", args);

        int port = arg.getInt('p');
        String host = arg.getString('h');

        System.out.println(String.format("port [%d] host [%s]", port, host));
    }
}
