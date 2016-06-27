package com.company;

import AdapterPattern.AudioPlayer;
import FactoryPattern.DecoratorPattern.BlueShapeDecorator;
import FactoryPattern.Circle;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import FactoryPattern.VisitorPattern.ShapeForm;
import FactoryPattern.VisitorPattern.ShapeType;
import FactoryPattern.VisitorPattern.ShapeTypeDisplayVisitor;
import IteratorPattern.Iterator;
import IteratorPattern.NameRepository;


public class Main {

    public static void main(String[] args) {

        /**
         * Factory Pattern
         */

        ShapeFactory shapeFactory = new ShapeFactory();

        //Get an object of Circle and call its draw method.
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        //Call draw method of Circle
        shapeCircle.draw();

        //Get an object of Rectangle and call its draw method.
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        //Call draw method of Rectangle
        shapeRectangle.draw();

        //Get an object of Square and call its draw method.
        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        //Call draw method of Square
        shapeSquare.draw();


        System.out.println();


        /**
         * Decorator Pattern
         */

        Shape blueCircle = new BlueShapeDecorator(new Circle());
        System.out.println("Circle with a blue color");
        blueCircle.draw();


        System.out.println();

        /**
         * Visitor Pattern
         */

        ShapeType shapeType = new ShapeForm();
        shapeType.accept(new ShapeTypeDisplayVisitor());
//        ComputerPart computerPart = new Computer();
//        computerPart.accept(new ComputerPartDisplayVisitor());

        System.out.println();

        /**
         * Iterator Pattern
         */

        NameRepository nameRepository = new NameRepository();

        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Print : " + name);
        }

        System.out.println();

        /**
         * Adapter Pattern
         */
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

    }
}
