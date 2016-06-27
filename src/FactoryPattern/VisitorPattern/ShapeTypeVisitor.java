package FactoryPattern.VisitorPattern;

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Square;

/**
 * Created by Bogust on 27-6-2016.
 */
public interface ShapeTypeVisitor {

    public void visit(Circle circle);
    public void visit(Rectangle rectangle);
    public void visit(Square square);
    public void visit(ShapeForm shapeForm);

}
