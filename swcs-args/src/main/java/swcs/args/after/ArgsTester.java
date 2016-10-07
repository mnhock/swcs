package swcs.args.after;

public class ArgsTester {

    public static void main(String[] args) {
        try {
            Args arg = new Args("p#,d*", args);

            int port = arg.getInt('p');
            String directory = arg.getString('d');

            System.out.println(String.format("port [%d] directory [%s]", port, directory));
        } catch (ArgsException e) {
            System.out.printf("Argument error: %s%n", e.errorMessage());
        }
    }
}
