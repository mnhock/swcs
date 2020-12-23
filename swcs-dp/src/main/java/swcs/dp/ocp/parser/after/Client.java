package swcs.dp.ocp.parser.after;

public class Client {

    public static void main(String[] args) {
        FileParser parser = FileParserFactory.newInstance("xml");
        System.out.println(parser.parse("test.xml"));
    }

}
