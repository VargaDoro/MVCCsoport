// Teszt fájl
package test;

import modell.LadaModell;
import vezerlo.GUIVezerlo;

public class DoroTest {

    private LadaModell modell;
    private MockGUINezet nezet;
    private GUIVezerlo vezerlo;

    public static void main(String[] args) {
        new DoroTest();
    }

    public DoroTest() {
        this.modell = new LadaModell();
        this.nezet = new MockGUINezet();
        this.vezerlo = new GUIVezerlo(modell, nezet);
        
        testJoFelirat();
        testHibasFelirat();
    }

    private void testJoFelirat() {
        System.out.println(">>> Jó felirat teszt (Arany)");

        nezet.setLada("Arany"); // Ez a teszt input
        vezerloTesztHivas(); // Meghívja a megfelelő metódust
        
        String vartFelirat = "én rejtem a kincset";
        String kapottFelirat = modell.getSzoveg();

        assert vartFelirat.equals(kapottFelirat) : "❌ HIBA: Nem jó a felirat (Arany)";
        System.out.println("✅ OK: Arany felirat megfelelő");
    }

    private void testHibasFelirat() {
        System.out.println(">>> Hibás felirat teszt (Bronz)");

        nezet.setLada("Bronz");
        vezerloTesztHivas();

        String vartFelirat = "hazudik az arany";
        String kapottFelirat = modell.getSzoveg();

        assert vartFelirat.equals(kapottFelirat) : "❌ HIBA: Nem jó a felirat (Bronz)";
        System.out.println("✅ OK: Bronz felirat megfelelő");
    }

    private void vezerloTesztHivas() {
        // Közvetlenül meghívjuk a vezérlő privát metódusát, de ehhez refaktorálni kell nyilvánosra
        // Ideiglenesen tegyük láthatóvá a vezérlőben:
        String szoveg = vezerlo.ladaSzovegek();
    }
}
