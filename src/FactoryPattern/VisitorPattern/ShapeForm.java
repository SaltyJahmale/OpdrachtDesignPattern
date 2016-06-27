package FactoryPattern.VisitorPattern;

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Square;
import IteratorPattern.Container;
import IteratorPattern.Iterator;

/**
 * Created by Bogust on 27-6-2016.
 */
public class ShapeForm implements ShapeType {

    ShapeType[] shapes;

    public ShapeForm() {
        shapes = new ShapeType[] {new Circle(), new Rectangle(), new Square()};

    }

    @Override
    public void accept(ShapeTypeVisitor shapeTypeVisitor) {
        for(int i = 0; i < shapes.length; i++) {
            shapes[i].accept(shapeTypeVisitor);
        }
        shapeTypeVisitor.visit(this);
    }
}
