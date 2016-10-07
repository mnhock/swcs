package swcs.gof.behavioral.composite;

public interface Graphic {

    void add(Graphic g);

    void remove(Graphic g);

    Graphic get(int index);

    void paint();
}
