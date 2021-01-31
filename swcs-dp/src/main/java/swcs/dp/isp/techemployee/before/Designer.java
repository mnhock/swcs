package swcs.dp.isp.techemployee.before;

public class Designer implements TechEmployee {

    @Override
    public void develop() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void design() {
        System.out.println("Yes, I love it!");
    }
}
