package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.LadaModell;
import nezet.GUINezet;

public class GUIVezerlo {
    private LadaModell modell;
    private GUINezet nezet;
    
    public GUIVezerlo(LadaModell modell, GUINezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        nezet.setVisible(true);
    }
    
    public void feladat() {
        JButton btnValaszt = nezet.getbtnValaszt();
        btnValaszt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lada = nezet.ladaKivalaszt();
                modell.setLada(lada);
                nezet.mutat("láda kiválasztva");
            }
        });
    }
}
