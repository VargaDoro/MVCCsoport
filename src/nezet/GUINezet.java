package nezet;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
/////////////////////////////////////////////////////////////////
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Graphics;
/////////////////////////////////////////////////////////////////

public class GUINezet extends javax.swing.JFrame {

    public GUINezet() {
        initComponents();
    }

    public JButton getbtnValaszt() {
        return btnValaszt;
    }
      
    public void mutat(String uzenet){
        edpValasz.setText(uzenet);
    }

    public String ladaKivalaszt() {
        return (String)cmbLadak.getSelectedItem();
    }

    public JComboBox<String> getCmbLadak() {
        return cmbLadak;
    }
    
    public JCheckBox getChbHelyesValasz() {
        return chbHelyesValasz;
    }
    

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Konfetti animációs panel
    private ConfettiPanel confettiPanel;

    public void konfettiIndit() {
        if (confettiPanel == null) {
            confettiPanel = new ConfettiPanel();
            getLayeredPane().add(confettiPanel, JLayeredPane.POPUP_LAYER);
            confettiPanel.setBounds(0, 0, getWidth(), getHeight());
        }
        confettiPanel.startConfetti();
    }

    // ===== Belső osztály: konfetti effekt =====
    class ConfettiPanel extends JPanel {
        private java.util.List<Particle> particles = new java.util.ArrayList<>();
        private javax.swing.Timer timer;
        private java.util.Random rand = new java.util.Random();

        public ConfettiPanel() {
            setOpaque(false);
        }

        public void startConfetti() {
            particles.clear();
            for (int i = 0; i < 100; i++) {
                particles.add(new Particle(
                        rand.nextInt(getWidth()),
                        rand.nextInt(50),
                        new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255))
                ));
            }

            if (timer != null && timer.isRunning()) timer.stop();

            timer = new javax.swing.Timer(30, e -> {
                for (Particle p : particles) p.update(getHeight());
                repaint();
            });
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Particle p : particles) p.draw(g);
        }
    }

    class Particle {
        int x, y, size;
        double dx, dy;
        Color color;

        public Particle(int x, int y, Color color) {
            this.x = x;
            this.y = y;
            this.color = color;
            this.dx = -1 + Math.random() * 2;
            this.dy = 2 + Math.random() * 3;
            this.size = 5 + (int)(Math.random() * 8);
        }

        public void update(int panelHeight) {
            y += dy;
            x += dx;
            if (y > panelHeight) y = 0; // újra hullik
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, size, size);
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void szovegMutat(String szoveg){
        edpSzovegMutat.setText(szoveg);
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cmbLadak = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        edpSzovegMutat = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edpValasz = new javax.swing.JEditorPane();
        btnValaszt = new javax.swing.JButton();
        chbHelyesValasz = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("VÁLASSZ LÁDÁT"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ládák"));

        cmbLadak.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arany", "Ezüst", "Bronz" }));

        jScrollPane2.setViewportView(edpSzovegMutat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbLadak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbLadak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eredmény"));

        jScrollPane1.setViewportView(edpValasz);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnValaszt.setText("VÁLASZT");

        chbHelyesValasz.setText("Helyes válasz mutatása");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnValaszt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbHelyesValasz)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValaszt)
                    .addComponent(chbHelyesValasz))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnValaszt;
    private javax.swing.JCheckBox chbHelyesValasz;
    private javax.swing.JComboBox<String> cmbLadak;
    private javax.swing.JEditorPane edpSzovegMutat;
    private javax.swing.JEditorPane edpValasz;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
