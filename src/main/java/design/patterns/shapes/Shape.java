package design.patterns.shapes;

import design.patterns.visitor.Visitor;

// Element
public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
