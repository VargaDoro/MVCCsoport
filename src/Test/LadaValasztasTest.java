package Test;

import modell.LadaModell;
import vezerlo.GUIVezerlo;
import nezet.GUINezet;

public class LadaValasztasTest {

    public static void main(String[] args) {
        LadaValasztasTest teszt = new LadaValasztasTest();

        LadaModell modell = new LadaModell();
        GUINezet nezet = new GUINezet();
        GUIVezerlo vezerlo = new GUIVezerlo(modell, nezet);
        vezerlo.feladat();

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

        modell.setLada("Ezüst");
        modell.setSzoveg("JEJ megtaláltad");
        String ezustValasz = modell.getSzoveg();

        modell.setLada("Arany");
        modell.setSzoveg("Arany láda nem rejti a kincset");
        String aranyValasz = modell.getSzoveg();

        modell.setLada("Bronz");
        modell.setSzoveg("Bronz láda nem rejti a kincset");
        String bronzValasz = modell.getSzoveg();

        assert ezustValasz.equals("JEJ megtaláltad");
        assert !aranyValasz.equals("JEJ megtaláltad");
        assert !bronzValasz.equals("JEJ megtaláltad");
        System.out.println(" testCsakAzEgyikbenVanKincs teszt sikeresen lefutott.");
    }

    public void testNemLetezoLadaraHivatkozunk(LadaModell modell) {
        //Viki
    }

    public void testBenneAKincsNincsBenne(GUINezet nezet, LadaModell modell, GUIVezerlo vezerlo) {
        //Eszter

// Ezüst láda kiválasztása
        nezet.getCmbLadak().setSelectedItem("Ezüst");
        nezet.getbtnValaszt().doClick();
        assert nezet.edpValasz.getText().equals("JEJ megtaláltad");

        // Arany láda kiválasztása
        nezet.getCmbLadak().setSelectedItem("Arany");
        nezet.getbtnValaszt().doClick();
        assert nezet.edpValasz.getText().equals("Arany láda nem rejti a kincset");

        // Bronz láda kiválasztása
        nezet.getCmbLadak().setSelectedItem("Bronz");
        nezet.getbtnValaszt().doClick();
        assert nezet.edpValasz.getText().equals("Bronz láda nem rejti a kincset");

    }

    public void testVisszajelzesSzovegeMegfelelo(GUINezet nezet) {
        //Viki
    }

    public void testSzovegetAdunkMegASzamHelyett(GUINezet nezet, GUIVezerlo vezerlo) {
        //Doro
    }

}
