package swcs.dp.lsp.bird.after;

class Sparrow extends Bird {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name() + " is flying.");
    }
}
