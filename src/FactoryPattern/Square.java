package FactoryPattern;

import FactoryPattern.VisitorPattern.ShapeType;
import FactoryPattern.VisitorPattern.ShapeTypeVisitor;

/**
 * Created by Bogust on 26-6-2016.
 */
public class Square implements ShapeType, Shape {

    @Override
    public void draw() {

        System.out.println("Inside Square::draw() method.");
    }


    @Override
    public void accept(ShapeTypeVisitor shapeTypeVisitor) {
        shapeTypeVisitor.visit(this);
    }
}
