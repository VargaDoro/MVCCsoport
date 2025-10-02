package main;

public class LogikaiLada {

    public Mvc02KonzolEmber() {
        //CuiNezet nezet = new CuiNezet();
        //JopNezet nezet = new JopNezet();

        //EmberModell modell = new EmberModell(nezet.getNev(), nezet.getKor());
        EmberModell modell = new EmberModell();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //GuiNezet3 nezet = new GuiNezet3();
                /* itt is lehet, de inkább a vezérlő tegye*/
                //nezet.setVisible(true);
                //GuiVezerlo3 vezerlo = new GuiVezerlo3(modell, nezet);
                //vezerlo.feladat();
                
                GuiNezet4 nezet = new GuiNezet4();
                GuiVezerlo4 vezerlo = new GuiVezerlo4(modell, nezet);
                vezerlo.feladat();
            }
        });
        
        //CuiVezerlo vezerlo = new CuiVezerlo(modell, nezet);
        //JopVezerlo vezerlo = new JopVezerlo(modell, nezet);
        //vezerlo.feladat();
    }

    public static void main(String[] args) {
        new Mvc02KonzolEmber();
    }
    
}
