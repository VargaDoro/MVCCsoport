// Tesztbarát nézet
package test;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import nezet.GUINezet;

public class MockGUINezet extends GUINezet {

    private String kivalasztottLada;
    private String mutatottUzenet;
    private String szovegUzenet;

    public void setLada(String lada) {
        this.kivalasztottLada = lada;
    }

    @Override
    public String ladaKivalaszt() {
        return this.kivalasztottLada;
    }

    @Override
    public void mutat(String uzenet) {
        this.mutatottUzenet = uzenet;
    }

    @Override
    public void szovegMutat(String szoveg) {
        this.szovegUzenet = szoveg;
    }

    public String getMutatottUzenet() {
        return mutatottUzenet;
    }

    public String getSzovegUzenet() {
        return szovegUzenet;
    }
}
