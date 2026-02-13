package swcs.dp.lsp.bird.before;

class Sparrow extends Bird {
    Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name() + " is pecking at seeds.");
    }
}
