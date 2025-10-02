package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
                String helyesLada = "Ezüst";
                nezet.mutat(lada + " láda kiválasztva");
                if (lada == helyesLada) {
                    nezet.mutat("A nem hazudozó ládát választottad");
                }else{
                    nezet.mutat(lada + " láda hazudik, ez a jó láda: " + helyesLada);
                }
               
            }
        });
    }
}
