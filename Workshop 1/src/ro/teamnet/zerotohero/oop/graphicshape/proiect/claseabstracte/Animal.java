package ro.teamnet.zerotohero.oop.graphicshape.proiect.claseabstracte;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public abstract class Animal {
    public Animal(){
        System.out.println("Animal nou");
    }
    public abstract void mananca(Object o);
    public abstract void seJoaca();
    public abstract void faceBaie();
    public void doarme(){
        System.out.println("Animalul doarme!");
    }
}
