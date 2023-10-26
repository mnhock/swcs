package swcs.dp.lsp.bird.before;

class Bird {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }
}
