package swcs.dp.lsp.bird.after;

class Penguin extends Bird {
    Penguin(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name() + " is swimming gracefully.");
    }
}
