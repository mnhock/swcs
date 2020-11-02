package swcs.dp.ocp.parser.after;

public class Tester {

    public static void main(String[] args) {
        FileParser parser = FileParserFactory.newInstance("xml");
        System.out.println(parser.parse("test.xml"));
    }

}
