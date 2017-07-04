package ro.teamnet.zerotohero.oop.graphicshape.runapp;

import ro.teamnet.zerotohero.oop.graphicshape.*;
import ro.teamnet.zerotohero.oop.graphicshape.canvas.Canvas;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class RunApp {
    public static void main(String[] args){
        Circles circles = new Circles();
        System.out.println("The default circle area is " + circles.getAreaPub() + ".");
        Canvas ca = new Canvas();
        // ca.paint();
        Shape s20 = new Circle(10);
        System.out.println(s20.area());
        ShapeBehaviour sb20 = new Square(10);
        System.out.println(sb20.area());

        Object p1 = new Point(10, 20);
        Object p2 = new Point(50, 100);
        Object p3 = new Point(10, 20);

        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));

        Object testIm = new TabusClass(2);
        System.out.println(testIm);
    }
}
