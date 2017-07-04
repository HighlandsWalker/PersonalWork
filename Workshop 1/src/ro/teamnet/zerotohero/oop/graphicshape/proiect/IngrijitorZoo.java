package ro.teamnet.zerotohero.oop.graphicshape.proiect;

import ro.teamnet.zerotohero.oop.graphicshape.proiect.claseabstracte.Animal;
import ro.teamnet.zerotohero.oop.graphicshape.proiect.exceptii.AnimalPeCaleDeDisparitieException;
import ro.teamnet.zerotohero.oop.graphicshape.proiect.interfete.AngajatZoo;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class IngrijitorZoo implements AngajatZoo {

    public void lucreaza(Animal animal, Object mancare) throws AnimalPeCaleDeDisparitieException {
        this.lucreaza(animal);
        animal.mananca(mancare);
        animal.faceBaie();
        animal.seJoaca();
        animal.doarme();
        if((animal instanceof AnimalZooRar) && mancare == null){
            throw new AnimalPeCaleDeDisparitieException("SHIT!");
        }
    }

    @Override
    public void lucreaza(Animal animal) {
        if(animal instanceof AnimalZooRar){
            AnimalZooRar aux = (AnimalZooRar) animal;
            System.out.println("Ingrijitorul intra in cusca aninalului " + aux.getNume() + "!");
        } else {
            if(animal instanceof AnimalZooFeroce){
                AnimalZooFeroce aux = (AnimalZooFeroce) animal;
                System.out.println("Ingrijitorul intra in cusca aninalului " + aux.getNume() + "!");
            }
        }
    }
}
