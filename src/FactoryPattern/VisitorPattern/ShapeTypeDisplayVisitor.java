package FactoryPattern.VisitorPattern;

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Square;

/**
 * Created by Bogust on 27-6-2016.
 */
public class ShapeTypeDisplayVisitor implements ShapeTypeVisitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Display Circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Display Rectangle");

    }

    @Override
    public void visit(Square square) {
        System.out.println("Display Square");

    }

    @Override
    public void visit(ShapeForm shapeForm) {

    }

}
