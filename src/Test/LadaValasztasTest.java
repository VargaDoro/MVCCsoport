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

        teszt.testMindenLadanVanFelirat(modell);
        teszt.testFeliratokSzovege(modell);
        teszt.testNemLetezoLadaraHivatkozunk(modell);
        teszt.testBenneAKincsNincsBenne(nezet, modell, vezerlo);
        teszt.testVisszajelzesSzovegeMegfelelo(nezet);
        teszt.testSzovegetAdunkMegASzamHelyett(nezet, vezerlo);

        System.out.println("Minden teszt sikeresen lefutott.");
    }

    public void testMindenLadanVanFelirat(LadaModell modell) {
        //Doro
    }

    public void testFeliratokSzovege(LadaModell modell) {
        //Doro
    }

    public void testCsakAzEgyikbenVanKincs(LadaModell modell) {
        //Eszter
    }

    public void testNemLetezoLadaraHivatkozunk(LadaModell modell) {
        //Viki
    }

    public void testBenneAKincsNincsBenne(GUINezet nezet, LadaModell modell, GUIVezerlo vezerlo) {
        //Eszter
    }

    public void testVisszajelzesSzovegeMegfelelo(GUINezet nezet) {
        //Viki
    }

    public void testSzovegetAdunkMegASzamHelyett(GUINezet nezet, GUIVezerlo vezerlo) {
        //Doro
    }

}
