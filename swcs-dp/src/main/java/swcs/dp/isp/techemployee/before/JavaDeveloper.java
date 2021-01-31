package swcs.dp.isp.techemployee.before;

public class JavaDeveloper implements TechEmployee {

    @Override
    public void develop() {
        System.out.println("Yes, I love it!");
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void design() {
        throw new UnsupportedOperationException();
    }
}
