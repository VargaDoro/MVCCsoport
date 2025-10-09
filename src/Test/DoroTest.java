package test;

import modell.LadaModell;
import vezerlo.GUIVezerlo;
import nezet.GUINezet; // <- használd a konkrét GUI osztályt, ha van ilyen

public class DoroTest {

    private LadaModell modell;
    private GUINezet nezet; // konkrét GUI osztály
    private GUIVezerlo vezerlo;

    public static void main(String[] args) {
        new DoroTest();
    }

    public DoroTest() {
        this.modell = new LadaModell();
        this.nezet = new GUINezet(); // csak ha ez egy valós GUI osztály
        this.vezerlo = new GUIVezerlo(modell, nezet);

        testJoFelirat("Arany", "én rejtem a kincset");
        testJoFelirat("Bronz", "hazudik az arany");
    }

    private void testJoFelirat(String ladaNev, String vartFelirat) {
        System.out.println(">>> Teszt: " + ladaNev);

        modell.setLada(ladaNev);              // beállítjuk a ládát
        vezerlo.ladaSzovegek();               // meghívjuk a vezérlő logikát
        String kapottFelirat = modell.getSzoveg(); // lekérjük az eredményt

        assert vartFelirat.equals(kapottFelirat) 
            : "❌ HIBA: Várt: \"" + vartFelirat + "\", de kaptuk: \"" + kapottFelirat + "\"";

        System.out.println("✅ OK: " + ladaNev + " felirat megfelelő");
    }
}
