package design.patterns.visitor;

import design.patterns.shapes.Circle;
import design.patterns.shapes.CompoundShape;
import design.patterns.shapes.Dot;
import design.patterns.shapes.Rectangle;

// visitor
public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
