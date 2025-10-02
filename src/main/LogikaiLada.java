package main;

import modell.LadaModell;
import nezet.GUINezet;
import vezerlo.GUIVezerlo;

public class LogikaiLada {

    public LogikaiLada() {

        LadaModell modell = new LadaModell();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUINezet nezet = new GUINezet();
                GUIVezerlo vezerlo = new GUIVezerlo(modell, nezet);
                vezerlo.feladat();
            }
        });
    }

    public static void main(String[] args) {
        new LogikaiLada();
    }
    
}
