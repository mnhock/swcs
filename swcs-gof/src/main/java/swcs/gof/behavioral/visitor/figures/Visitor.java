package swcs.gof.behavioral.visitor.figures;

interface Visitor<T> {

    T visit(Square square);

    T visit(Circle circle);

    T visit(Rectangle rectangle);
}