package FactoryPattern.VisitorPattern;

/**
 * Created by Bogust on 27-6-2016.
 */
public interface ShapeType {

    void accept(ShapeTypeVisitor shapeTypeVisitor);
}
