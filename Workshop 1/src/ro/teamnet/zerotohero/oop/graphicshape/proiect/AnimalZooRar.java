package ro.teamnet.zerotohero.oop.graphicshape.proiect;

import ro.teamnet.zerotohero.oop.graphicshape.proiect.claseabstracte.Animal;
import ro.teamnet.zerotohero.oop.graphicshape.proiect.exceptii.AnimalManancaOmException;
import ro.teamnet.zerotohero.oop.graphicshape.proiect.interfete.AngajatZoo;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class AnimalZooRar extends Animal {
    private String nume;
    private String numeTaraDeOrigine;

    public AnimalZooRar(){
        this.nume = null;
        this.numeTaraDeOrigine = null;
    }

    public AnimalZooRar(String nume, String numeTaraDeOrigine){
        this.nume = nume;
        this.numeTaraDeOrigine = numeTaraDeOrigine;
    }

    // FUNCTII SET SI GET

    public void setNume(String nume){
        this.nume = nume;
    }

    public void setNumeTaraDeOrigine(String numeTaraDeOrigine){
        this.numeTaraDeOrigine = numeTaraDeOrigine;
    }

    public String getNume(){
        return this.nume;
    }

    public String getNumeTaraDeOrigine(){
        return this.numeTaraDeOrigine;
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
        System.out.println("AnimalulZooRar " + nume + " se joaca.");
        super.doarme();
    }

    @Override
    public void faceBaie() {
        System.out.println("AnimalulZooRar " + nume + " face baie.");
    }
}
