package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class Circle extends Shape{
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(){
        this.xPos = 2;
        this.yPos = 3;
        this.radius = 5;
    }

    public Circle(int radius){
        this.radius = radius;
    }
    public Circle(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public Circle(int xPos, int yPos, int radius){
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "center = (" + xPos + ", " + yPos + ") and radius = " + radius;
    }

    public void fillColor(){
        System.out.println(super.color);
    }
    public void fillColor(int a){
        super.setColor(a);
        System.out.println("The cirle color is now " + super.color);
    }
    public void fillColor(float a){
        super.setSaturation(a);
        System.out.println("The cirle saturation is now " + super.color);
    }
}
