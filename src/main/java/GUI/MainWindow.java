package GUI;

import GUI.Pages.AccessoryPanel;
import GUI.Pages.AllStadistics;
import GUI.Pages.Home;
import GUI.Pages.InstrumentPanel;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();

        InstrumentButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        AccesoriesButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        EstadisticsButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        HomeButton.putClientProperty(FlatClientProperties.STYLE, "arc: 10");
        PrincipalTitle.putClientProperty("FlatLaf.styleClass", "h1");

        HomeButton.setIcon(IconFontSwing.buildIcon(FontAwesome.HOME, 20, Color.WHITE));
        InstrumentButton.setIcon(IconFontSwing.buildIcon(FontAwesome.MUSIC, 20, Color.WHITE));
        AccesoriesButton.setIcon(IconFontSwing.buildIcon(FontAwesome.BOOK, 20, Color.WHITE));
        EstadisticsButton.setIcon(IconFontSwing.buildIcon(FontAwesome.SIGNAL, 20, Color.WHITE));
        Copyirght.setIcon(IconFontSwing.buildIcon(FontAwesome.COPYRIGHT, 10, Color.WHITE));
        
        showJPanel(new Home());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        Copyirght = new javax.swing.JLabel();
        PrincipalTitle = new javax.swing.JLabel();
        PrincipalSubtitle = new javax.swing.JLabel();
        SubmenuPanel = new javax.swing.JPanel();
        HomeButton = new javax.swing.JButton();
        InstrumentButton = new javax.swing.JButton();
        AccesoriesButton = new javax.swing.JButton();
        EstadisticsButton = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuPanel.setBackground(new java.awt.Color(77, 32, 140));

        Copyirght.setForeground(new java.awt.Color(153, 153, 153));
        Copyirght.setText("Standard Code inc");
        Copyirght.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Copyirght.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        PrincipalTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrincipalTitle.setText("Melody");
        PrincipalTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PrincipalSubtitle.setForeground(new java.awt.Color(78, 200, 87));
        PrincipalSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrincipalSubtitle.setText("Manager");
        PrincipalSubtitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SubmenuPanel.setBackground(new java.awt.Color(77, 32, 140));
        SubmenuPanel.setLayout(new java.awt.GridLayout(4, 1, 4, 3));

        HomeButton.setText("Inicio");
        HomeButton.setBorder(null);
        HomeButton.setBorderPainted(false);
        HomeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        SubmenuPanel.add(HomeButton);

        InstrumentButton.setText("Instrumentos");
        InstrumentButton.setBorder(null);
        InstrumentButton.setBorderPainted(false);
        InstrumentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InstrumentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        InstrumentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstrumentButtonActionPerformed(evt);
            }
        });
        SubmenuPanel.add(InstrumentButton);

        AccesoriesButton.setText("Accesorios");
        AccesoriesButton.setBorder(null);
        AccesoriesButton.setBorderPainted(false);
        AccesoriesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AccesoriesButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AccesoriesButton.setMaximumSize(new java.awt.Dimension(65, 15));
        AccesoriesButton.setMinimumSize(new java.awt.Dimension(65, 15));
        AccesoriesButton.setPreferredSize(new java.awt.Dimension(65, 15));
        AccesoriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesoriesButtonActionPerformed(evt);
            }
        });
        SubmenuPanel.add(AccesoriesButton);

        EstadisticsButton.setText("Estadisticas");
        EstadisticsButton.setBorder(null);
        EstadisticsButton.setBorderPainted(false);
        EstadisticsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EstadisticsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EstadisticsButton.setMaximumSize(new java.awt.Dimension(65, 15));
        EstadisticsButton.setMinimumSize(new java.awt.Dimension(65, 15));
        EstadisticsButton.setPreferredSize(new java.awt.Dimension(65, 15));
        EstadisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticsButtonActionPerformed(evt);
            }
        });
        SubmenuPanel.add(EstadisticsButton);

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrincipalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(PrincipalSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Copyirght, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SubmenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrincipalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PrincipalSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addComponent(SubmenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Copyirght, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ContentPanel.setPreferredSize(new java.awt.Dimension(560, 368));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(ContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InstrumentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstrumentButtonActionPerformed
        showJPanel(new InstrumentPanel());
    }//GEN-LAST:event_InstrumentButtonActionPerformed

    private void AccesoriesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesoriesButtonActionPerformed
        showJPanel(new AccessoryPanel());
    }//GEN-LAST:event_AccesoriesButtonActionPerformed

    private void EstadisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticsButtonActionPerformed
        showJPanel(new AllStadistics());
    }//GEN-LAST:event_EstadisticsButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        showJPanel(new Home());
    }//GEN-LAST:event_HomeButtonActionPerformed

    public void showJPanel(JPanel panel) {
        panel.setSize(560, 368);
        panel.setLocation(0, 0);
        ContentPanel.removeAll();
        ContentPanel.add(panel, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccesoriesButton;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JLabel Copyirght;
    private javax.swing.JButton EstadisticsButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton InstrumentButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JLabel PrincipalSubtitle;
    private javax.swing.JLabel PrincipalTitle;
    private javax.swing.JPanel SubmenuPanel;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
