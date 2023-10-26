package swcs.dp.lsp.bird.before;

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException(name() + " can't fly.");
    }
}
