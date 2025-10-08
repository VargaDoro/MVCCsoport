//a kiválasztott ládára megfelelő visszajelzést kapunk (benne a kincs, nincs benne)
package Test;

import modell.LadaModell;
import nezet.GUINezet;
import vezerlo.GUIVezerlo;

public class EsztiTest {
    

    public static void main(String[] args) {
        // Tesztelés engedélyezése: java -ea GUIVezerloTest

        GUINezet nezet = new GUINezet(); // valódi nézet
        LadaModell modell = new LadaModell();
        GUIVezerlo vezerlo = new GUIVezerlo(modell, nezet);
        vezerlo.feladat();

}
