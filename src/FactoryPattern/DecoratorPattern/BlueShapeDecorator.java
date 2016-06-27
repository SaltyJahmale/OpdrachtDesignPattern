package FactoryPattern.DecoratorPattern;

import FactoryPattern.Shape;

/**
 * Created by Bogust on 27-6-2016.
 */
public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape shapeDecorated) {
        super(shapeDecorated);
    }

    @Override
    public void draw() {
        shapeDecorated.draw();
        setBlueColor(shapeDecorated);
    }

    private void setBlueColor(Shape shapeDecorated) {
        System.out.println("Set the color to: Blue");
    }
}
