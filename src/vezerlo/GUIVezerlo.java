package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
        String helyesLada = "Ezüst";
        btnValaszt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lada = nezet.ladaKivalaszt();
                nezet.mutat(lada + " láda kiválasztva");
                if (lada == helyesLada) {
                    nezet.mutat("JEJ megtaláltad");
                }else{
                    nezet.mutat(lada + " láda nem rejti a kincset");
                }
            }
        });
        
        JCheckBox chb = nezet.getChbHelyesValasz();
        chb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (chb.isSelected()) {
                    nezet.mutat("A helyes láda: "+helyesLada);
                }
            }
        });
    }
}
