package GUI.Pages;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class Home extends javax.swing.JPanel {

    public Home() {
        initComponents();

        PrincipalTitle.putClientProperty("FlatLaf.styleClass", "h1");
        TitleWIconOne.setIcon(IconFontSwing.buildIcon(FontAwesome.ARCHIVE, 40, Color.WHITE));
        TitleWIconTwo.setIcon(IconFontSwing.buildIcon(FontAwesome.SIGNAL, 40, Color.WHITE));

        TitleWIconOne.putClientProperty("FlatLaf.styleClass", "h2");
        TitleWIconTwo.putClientProperty("FlatLaf.styleClass", "h2");
        InstrumentPanel.putClientProperty(FlatClientProperties.STYLE, "arc: 8");
        StadisticsPanel.putClientProperty(FlatClientProperties.STYLE, "arc: 8");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PrincipalTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        InstrumentPanel = new javax.swing.JPanel();
        TitleWIconOne = new javax.swing.JLabel();
        DescriptionLabelOne = new javax.swing.JLabel();
        StadisticsPanel = new javax.swing.JPanel();
        TitleWIconTwo = new javax.swing.JLabel();
        DescriptionLabelTwo = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(560, 368));
        setPreferredSize(new java.awt.Dimension(560, 368));

        PrincipalTitle.setForeground(new java.awt.Color(78, 190, 87));
        PrincipalTitle.setText("Inicio");

        jPanel2.setLayout(new java.awt.GridLayout(1, 2, 7, 0));

        InstrumentPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(138, 59, 217), 1, true));

        TitleWIconOne.setText("Productos");

        DescriptionLabelOne.setText("jLabel2");

        javax.swing.GroupLayout InstrumentPanelLayout = new javax.swing.GroupLayout(InstrumentPanel);
        InstrumentPanel.setLayout(InstrumentPanelLayout);
        InstrumentPanelLayout.setHorizontalGroup(
            InstrumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstrumentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InstrumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleWIconOne, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionLabelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InstrumentPanelLayout.setVerticalGroup(
            InstrumentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstrumentPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TitleWIconOne, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DescriptionLabelOne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        DescriptionLabelOne.setText("<html><p> Añada, edite y organice su inventario de productos de manera eficiente. </p></html>");

        jPanel2.add(InstrumentPanel);

        StadisticsPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(138, 59, 217), 1, true));

        TitleWIconTwo.setText("Estadisticas");

        DescriptionLabelTwo.setText("jLabel2");

        javax.swing.GroupLayout StadisticsPanelLayout = new javax.swing.GroupLayout(StadisticsPanel);
        StadisticsPanel.setLayout(StadisticsPanelLayout);
        StadisticsPanelLayout.setHorizontalGroup(
            StadisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StadisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StadisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleWIconTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionLabelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StadisticsPanelLayout.setVerticalGroup(
            StadisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StadisticsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TitleWIconTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DescriptionLabelTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        DescriptionLabelTwo.setText("<html><p>Genere informes detallados para tomar decisiones informadas sobre su inventario.</p></html>");

        jPanel2.add(StadisticsPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrincipalTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PrincipalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setText("<html><p>Gestione su inventario de manera eficiente con nuestra plataforma intuitiva. Controle sus productos, realice seguimiento de stock y optimice sus operaciones.</p></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriptionLabelOne;
    private javax.swing.JLabel DescriptionLabelTwo;
    private javax.swing.JPanel InstrumentPanel;
    private javax.swing.JLabel PrincipalTitle;
    private javax.swing.JPanel StadisticsPanel;
    private javax.swing.JLabel TitleWIconOne;
    private javax.swing.JLabel TitleWIconTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
