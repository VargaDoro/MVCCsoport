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
    
    public String ladaSzovegek(){
        String lada = nezet.ladaKivalaszt();
        if (lada == "Arany") {
            modell.setSzoveg("én rejtem a kincset");
        }else if (lada == "Ezüst"){
            modell.setSzoveg("nem én rejtem a kincset");
        }else if (lada == "Bronz"){
            modell.setSzoveg("hazudik az arany");
        }else{
            modell.setSzoveg("nincs ilyen láda");
        }
        return modell.getSzoveg();
        /*String lada = nezet.ladaKivalaszt();
        switch (lada) {
            case "Arany":
                modell.setSzoveg("én rejtem a kincset");
                break;
            case "Ezüst":
                modell.setSzoveg("nem én rejtem a kincset");
                break;
            case "Bronz":
                modell.setSzoveg("hazudik az arany");
                break;
            default:
                modell.setSzoveg("nincs ilyen láda");
                break;
        }
        return modell.getSzoveg();*/
    }
    
    public void feladat() {
        JComboBox<String> ladak = nezet.getCmbLadak();
        ladak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               nezet.szovegMutat(ladaSzovegek());
            }
        });
        
        JButton btnValaszt = nezet.getbtnValaszt();
        String helyesLada = "Ezüst";
        btnValaszt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String lada = nezet.ladaKivalaszt();
                nezet.mutat(lada + " láda kiválasztva");

//                //if (lada == helyesLada) {
//                    nezet.mutat("JEJ megtaláltad");
//                }else{
//                    nezet.mutat(lada + " láda nem rejti a kincset");
//                }

                if (lada.equals(helyesLada)) {
                    nezet.mutat("JEJ megtaláltad");
                    nezet.konfettiIndit();
                } else {
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
