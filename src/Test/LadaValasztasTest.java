package test;

import javax.swing.SwingUtilities;
import modell.LadaModell;
import vezerlo.GUIVezerlo;
import nezet.GUINezet;

public class LadaValasztasTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            LadaModell modell = new LadaModell();
            GUINezet nezet = new GUINezet(); // vagy konkrét implementáció pl. LadaGUI
            GUIVezerlo vezerlo = new GUIVezerlo(modell, nezet);

            vezerlo.feladat(); // ha ez valamit inicializál a GUI-n

            LadaValasztasTest teszt = new LadaValasztasTest();

            teszt.testMindenLadanVanFelirat(modell);
            teszt.testFeliratokSzovege(modell, vezerlo);
            teszt.testNemLetezoLadaraHivatkozunk(modell);
            teszt.testBenneAKincsNincsBenne(nezet, modell, vezerlo);
            teszt.testVisszajelzesSzovegeMegfelelo(nezet);
            teszt.testSzovegetAdunkMegASzamHelyett(nezet, vezerlo);
        });
    }

    public void testMindenLadanVanFelirat(LadaModell modell) {
        // TODO: Doro
    }

    public void testFeliratokSzovege(LadaModell modell, GUIVezerlo vezerlo) {
        //Doro
        System.out.println(">>> Teszt: Feliratok szövege");

        modell.setLada("Arany");
        vezerlo.ladaSzovegek();
        assert "én rejtem a kincset".equals(vezerlo.ladaSzovegek())
            : "❌ HIBA: Arany láda felirata hibás";

        modell.setLada("Ezüst");
        vezerlo.ladaSzovegek();
        assert "nem én rejtem a kincset".equals(vezerlo.ladaSzovegek())
            : "❌ HIBA: Ezüst láda felirata hibás";

        modell.setLada("Bronz");
        vezerlo.ladaSzovegek();
        assert "hazudik az arany".equals(vezerlo.ladaSzovegek())
            : "❌ HIBA: Bronz láda felirata hibás";

        System.out.println("✅ OK: Minden láda felirata megfelelő");
    }

    public void testCsakAzEgyikbenVanKincs(LadaModell modell) {
        // TODO: Eszter
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
        // TODO: Viki
    }

    public void testBenneAKincsNincsBenne(GUINezet nezet, LadaModell modell, GUIVezerlo vezerlo) {
        // TODO: Eszter
        //Eszter

    }

    public void testVisszajelzesSzovegeMegfelelo(GUINezet nezet) {
        // TODO: Viki
    }

    public void testSzovegetAdunkMegASzamHelyett(GUINezet nezet, GUIVezerlo vezerlo) {
        // TODO: Doro
    }
}
