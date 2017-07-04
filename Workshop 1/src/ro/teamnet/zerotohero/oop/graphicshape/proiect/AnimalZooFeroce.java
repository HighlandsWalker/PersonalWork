package ro.teamnet.zerotohero.oop.graphicshape.proiect;

import ro.teamnet.zerotohero.oop.graphicshape.proiect.claseabstracte.Animal;
import ro.teamnet.zerotohero.oop.graphicshape.proiect.exceptii.AnimalManancaOmException;
import ro.teamnet.zerotohero.oop.graphicshape.proiect.interfete.AngajatZoo;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class AnimalZooFeroce extends Animal {

    private String nume;

    public void doarme(){
        super.doarme();
        System.out.println("Animalul feroce vaneaza!");
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public String getNume(){
        return this.nume;
    }

    @Override
    public void mananca(Object o) {
        if(o instanceof AngajatZoo){
            throw new AnimalManancaOmException("SARITI!");
        } else {
            System.out.println("Animalul mananca!");
        }
    }

    @Override
    public void seJoaca() {
        System.out.println("AnimalZooFeroce " + nume + " se joaca.");
        super.doarme();
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalZooFeroce " + nume + " face baie.");
    }
}
