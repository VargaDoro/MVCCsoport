package Test;

import modell.LadaModell;
import nezet.GUINezet;
import vezerlo.GUIVezerlo;

public class VikiTest {
    //vezérlő 2:
    //a visszajelzés szövege megfelelő ("Gratulálunk...", "Sajnos  nem nyert...")
    
    public static void main(String[] args) {
        void testFeladat(){
            GUIVezerlo obj = new GUIVezerlo( modell,  nezet);
        }
        obj.feladat();
    }
}
