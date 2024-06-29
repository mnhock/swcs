package swcs.dp.lsp.bird.after;

class Bird {
    private final String name;

    Bird(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    public void move() {
        System.out.println(this.name + " is moving.");
    }
}
