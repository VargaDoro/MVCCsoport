package Test;

import modell.LadaModell;
import nezet.GUINezet;
import vezerlo.GUIVezerlo;

public class VikiTest {
    //vezérlő 2:
    //a visszajelzés szövege megfelelő ("Gratulálunk...", "Sajnos  nem nyert...")
    private LadaModell modell;
    private GUINezet nezet;
    private GUIVezerlo vezerlo;
    
    public static void main(String[] args) {
        new VikiTest();
//        void testFeladat(){
//            GUIVezerlo obj = new GUIVezerlo( modell,  nezet);
//        }
//        obj.feladat();
    }
    
    public VikiTest() {
        this.modell = new LadaModell();
        this.nezet = new GUINezet();
        this.vezerlo = new GUIVezerlo(modell, nezet);
        
        testJoVisszaSzov();
        testHIBASvisszaSzov();
    }

    private void testJoVisszaSzov() {
        System.out.println("***Teszt: a visszajelzés szövege megfelelő");
        
        
    }

    private void testHIBASvisszaSzov() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
