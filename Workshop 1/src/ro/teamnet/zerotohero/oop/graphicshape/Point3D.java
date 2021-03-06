package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class Point3D extends Point {

    private int zPos;

    public Point3D(int xPos, int yPos) {
        super(xPos, yPos);
    }

    public Point3D(int xPos, int yPos, int zPos) {
        super(xPos, yPos);
        this.zPos = zPos;
    }
}
