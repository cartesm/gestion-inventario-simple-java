package GUI.Pages;

import GUI.Pages.InstrumentPanel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Stadistics extends javax.swing.JPanel {

    private boolean fromInstrument;
    private JTable table;

    public Stadistics(boolean from, JTable table) {
        initComponents();
        PrincipalTitle.putClientProperty("FlatLaf.styleClass", "h1");
        this.fromInstrument = from;
        this.table = table;
        if (!from) {
            PrincipalTitle.setText("Accesorios");
        }
        TitleOne.putClientProperty("FlatLaf.styleClass", "h3");
        TitleTwo.putClientProperty("FlatLaf.styleClass", "h3");
        TitleThree.putClientProperty("FlatLaf.styleClass", "h3");
        TtitleFour.putClientProperty("FlatLaf.styleClass", "h3");
        TitleFive.putClientProperty("FlatLaf.styleClass", "h3");
        this.setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        PrincipalTitle = new javax.swing.JLabel();
        TableButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TotalCountPanel = new javax.swing.JPanel();
        TitleOne = new javax.swing.JLabel();
        ValueOne = new javax.swing.JLabel();
        TotalValuePanel = new javax.swing.JPanel();
        TitleTwo = new javax.swing.JLabel();
        ValueTwo = new javax.swing.JLabel();
        PromedyPanel = new javax.swing.JPanel();
        TitleThree = new javax.swing.JLabel();
        ValueThree = new javax.swing.JLabel();
        MostExpensivePanel = new javax.swing.JPanel();
        TtitleFour = new javax.swing.JLabel();
        ValueFour = new javax.swing.JLabel();
        CheaperPanel = new javax.swing.JPanel();
        TitleFive = new javax.swing.JLabel();
        ValueFive = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(510, 368));
        setMinimumSize(new java.awt.Dimension(510, 368));

        PrincipalTitle.setText("Instrumentos");
        PrincipalTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        TableButton.setText("Tabla");
        TableButton.setBorderPainted(false);
        TableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 2));

        TitleOne.setText("Total de Instrumentos");

        ValueOne.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueOne.setText("jLabel1");
        ValueOne.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TotalCountPanelLayout = new javax.swing.GroupLayout(TotalCountPanel);
        TotalCountPanel.setLayout(TotalCountPanelLayout);
        TotalCountPanelLayout.setHorizontalGroup(
            TotalCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleOne, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValueOne, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TotalCountPanelLayout.setVerticalGroup(
            TotalCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TitleOne, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ValueOne, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(TotalCountPanel);

        TitleTwo.setText("Valor Total");

        ValueTwo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueTwo.setText("jLabel1");
        ValueTwo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TotalValuePanelLayout = new javax.swing.GroupLayout(TotalValuePanel);
        TotalValuePanel.setLayout(TotalValuePanelLayout);
        TotalValuePanelLayout.setHorizontalGroup(
            TotalValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalValuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValueTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TotalValuePanelLayout.setVerticalGroup(
            TotalValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TotalValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TitleTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ValueTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(TotalValuePanel);

        TitleThree.setText("Valor promedio");

        ValueThree.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueThree.setText("jLabel1");
        ValueThree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PromedyPanelLayout = new javax.swing.GroupLayout(PromedyPanel);
        PromedyPanel.setLayout(PromedyPanelLayout);
        PromedyPanelLayout.setHorizontalGroup(
            PromedyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromedyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleThree, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValueThree, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PromedyPanelLayout.setVerticalGroup(
            PromedyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PromedyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TitleThree, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ValueThree, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(PromedyPanel);

        TtitleFour.setText("Instrumento mas caro");

        ValueFour.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueFour.setText("jLabel1");
        ValueFour.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout MostExpensivePanelLayout = new javax.swing.GroupLayout(MostExpensivePanel);
        MostExpensivePanel.setLayout(MostExpensivePanelLayout);
        MostExpensivePanelLayout.setHorizontalGroup(
            MostExpensivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostExpensivePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TtitleFour, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValueFour, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MostExpensivePanelLayout.setVerticalGroup(
            MostExpensivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MostExpensivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TtitleFour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ValueFour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(MostExpensivePanel);

        TitleFive.setText("Instrumento mas barato");

        ValueFive.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueFive.setText("jLabel1");
        ValueFive.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout CheaperPanelLayout = new javax.swing.GroupLayout(CheaperPanel);
        CheaperPanel.setLayout(CheaperPanelLayout);
        CheaperPanelLayout.setHorizontalGroup(
            CheaperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheaperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleFive, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ValueFive, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CheaperPanelLayout.setVerticalGroup(
            CheaperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheaperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(TitleFive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ValueFive, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(CheaperPanel);

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrincipalTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BgPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TableButton)))
                .addContainerGap())
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrincipalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(TableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        this.returnToTable();
    }//GEN-LAST:event_TableButtonActionPerformed

    private void setData() {
        DefaultTableModel tabla = (DefaultTableModel) table.getModel();
        int totalRows = tabla.getRowCount();
        int valorTotal = 0;
        int totalProducts = 0;
        int menor = Integer.MAX_VALUE;
        int mayor = 0;
        for (int i = 0; i < totalRows; i++) {
            // iv valor iteracion
            int iv = Integer.parseInt(tabla.getValueAt(i, 3).toString());
            valorTotal += iv * Integer.parseInt(tabla.getValueAt(i, 4).toString());
            totalProducts += Integer.parseInt(tabla.getValueAt(i, 4).toString());

            if (iv < menor) {
                menor = iv;
            }
            if (iv > mayor) {
                mayor = iv;
            }
        }
        ValueOne.setText(String.valueOf(totalProducts));
        ValueTwo.setText(String.valueOf(valorTotal));
        ValueThree.setText(String.valueOf(valorTotal / totalProducts));
        ValueFour.setText(String.valueOf(mayor));
        ValueFive.setText(String.valueOf(menor));

    }

    private void returnToTable() {
        JPanel panel;
        if (fromInstrument) {
            panel = new InstrumentPanel();
        } else {
            panel = new AccessoryPanel();
        }

        panel.setSize(560, 368);
        panel.setLocation(0, 0);
        BgPanel.removeAll();
        BgPanel.add(panel, BorderLayout.CENTER);
        BgPanel.revalidate();
        BgPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel CheaperPanel;
    private javax.swing.JPanel MostExpensivePanel;
    private javax.swing.JLabel PrincipalTitle;
    private javax.swing.JPanel PromedyPanel;
    private javax.swing.JButton TableButton;
    private javax.swing.JLabel TitleFive;
    private javax.swing.JLabel TitleOne;
    private javax.swing.JLabel TitleThree;
    private javax.swing.JLabel TitleTwo;
    private javax.swing.JPanel TotalCountPanel;
    private javax.swing.JPanel TotalValuePanel;
    private javax.swing.JLabel TtitleFour;
    private javax.swing.JLabel ValueFive;
    private javax.swing.JLabel ValueFour;
    private javax.swing.JLabel ValueOne;
    private javax.swing.JLabel ValueThree;
    private javax.swing.JLabel ValueTwo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
