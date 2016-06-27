package FactoryPattern.DecoratorPattern;

import FactoryPattern.Shape;

/**
 * Created by Bogust on 27-6-2016.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shapeDecorated;

    public ShapeDecorator(Shape shapeDecorated) {
        this.shapeDecorated = shapeDecorated;
    }

    @Override
    public void draw() {
        shapeDecorated.draw();
    }

}
