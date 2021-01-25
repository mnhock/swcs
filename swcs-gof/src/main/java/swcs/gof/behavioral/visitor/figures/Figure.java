package swcs.gof.behavioral.visitor.figures;

interface Figure {
    <T> T accept(Visitor<T> visitor);
}