package swcs.dp.isp.techemployee.before;

public class Tester implements TechEmployee {

    @Override
    public void develop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void test() {
        System.out.println("Yes, I love it!");
    }

    @Override
    public void design() {
        throw new UnsupportedOperationException();
    }
}
