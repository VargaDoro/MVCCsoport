package Test;

import modell.LadaModell;
import vezerlo.GUIVezerlo;
import nezet.GUINezet;

public class LadaValasztasTest {

    public static void main(String[] args) {

        LadaModell modell = new LadaModell();
        GUINezet nezet = new GUINezet();
        GUIVezerlo vezerlo = new GUIVezerlo(modell, nezet);
        vezerlo.feladat();

        LadaValasztasTest teszt = new LadaValasztasTest();

        teszt.testMindenLadanVanFelirat();
        teszt.testFeliratokSzovege();
        teszt.testNemLetezoLadaraHivatkozunk();
        teszt.testBenneAKincsNincsBenne();
        teszt.testVisszajelzesSzovegeMegfelelo();
        teszt.testSzovegetAdunkMegASzamHelyett();

        System.out.println("Minden teszt sikeresen lefutott.");
    }

    public void testMindenLadanVanFelirat() {
        //Doro
    }

    public void testFeliratokSzovege() {
        //Doro
    }

    public void testCsakAzEgyikbenVanKincs() {
        //Eszter
    }

    public void testNemLetezoLadaraHivatkozunk() {
        //Viki
        
    }

    public void testBenneAKincsNincsBenne() {
        //Eszter
    }

    public void testVisszajelzesSzovegeMegfelelo() {
        //Viki
        
    }

    public void testSzovegetAdunkMegASzamHelyett() {
        //Doro
    }

}
