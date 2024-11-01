package GUI.Pages;

import Logica.Excel;
import java.util.ArrayList;

public class AllStadistics extends javax.swing.JPanel {

    private Excel excelService = new Excel();

    public AllStadistics() {
        initComponents();
        PrincipalTitle.putClientProperty("FlatLaf.styleClass", "h1");

        TitleOne.putClientProperty("FlatLaf.styleClass", "h3");
        TitleTwo.putClientProperty("FlatLaf.styleClass", "h3");
        TitleThree.putClientProperty("FlatLaf.styleClass", "h3");
        TtitleFour.putClientProperty("FlatLaf.styleClass", "h3");
        TitleFive.putClientProperty("FlatLaf.styleClass", "h3");
        TitleSix.putClientProperty("FlatLaf.styleClass", "h3");
        TitleSeven.putClientProperty("FlatLaf.styleClass", "h3");
        TitleEight.putClientProperty("FlatLaf.styleClass", "h3");
        TitleTen.putClientProperty("FlatLaf.styleClass", "h3");
        TtitleNine.putClientProperty("FlatLaf.styleClass", "h3");

        this.setData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        MessageError = new javax.swing.JLabel();
        PrincipalTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TotalCountPanelInstrument = new javax.swing.JPanel();
        TitleOne = new javax.swing.JLabel();
        ValueOne = new javax.swing.JLabel();
        TotalCountPanelAccessories = new javax.swing.JPanel();
        TitleSix = new javax.swing.JLabel();
        ValueSix = new javax.swing.JLabel();
        TotalValuePanelInstrument = new javax.swing.JPanel();
        TitleTwo = new javax.swing.JLabel();
        ValueTwo = new javax.swing.JLabel();
        TotalValuePanelAccessories = new javax.swing.JPanel();
        TitleSeven = new javax.swing.JLabel();
        ValueSeven = new javax.swing.JLabel();
        PromedyPanelInstrument = new javax.swing.JPanel();
        TitleThree = new javax.swing.JLabel();
        ValueThree = new javax.swing.JLabel();
        PromedyPanelAccessories = new javax.swing.JPanel();
        TitleEight = new javax.swing.JLabel();
        ValueEight = new javax.swing.JLabel();
        MostExpensivePanelInstrument = new javax.swing.JPanel();
        TtitleFour = new javax.swing.JLabel();
        ValueFour = new javax.swing.JLabel();
        MostExpensivePanelAccessories = new javax.swing.JPanel();
        TtitleNine = new javax.swing.JLabel();
        ValueNine = new javax.swing.JLabel();
        CheaperPanelInstrument = new javax.swing.JPanel();
        TitleFive = new javax.swing.JLabel();
        ValueFive = new javax.swing.JLabel();
        CheaperPanelAccessories = new javax.swing.JPanel();
        TitleTen = new javax.swing.JLabel();
        ValueTen = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(510, 368));
        setMinimumSize(new java.awt.Dimension(510, 368));

        BgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MessageError.setForeground(new java.awt.Color(255, 53, 67));
        MessageError.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BgPanel.add(MessageError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 550, 40));

        PrincipalTitle.setText("Instrumentos");
        PrincipalTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        BgPanel.add(PrincipalTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 543, 90));

        jPanel1.setLayout(new java.awt.GridLayout(10, 1, 0, 8));

        TotalCountPanelInstrument.setLayout(new java.awt.GridLayout(1, 2));

        TitleOne.setText("Total de Instrumentos");
        TotalCountPanelInstrument.add(TitleOne);

        ValueOne.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueOne.setText("--");
        ValueOne.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TotalCountPanelInstrument.add(ValueOne);

        jPanel1.add(TotalCountPanelInstrument);

        TotalCountPanelAccessories.setLayout(new java.awt.GridLayout(1, 2));

        TitleSix.setText("Total de Accesorios");
        TotalCountPanelAccessories.add(TitleSix);

        ValueSix.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueSix.setText("--");
        ValueSix.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TotalCountPanelAccessories.add(ValueSix);

        jPanel1.add(TotalCountPanelAccessories);

        TotalValuePanelInstrument.setLayout(new java.awt.GridLayout(1, 2));

        TitleTwo.setText("Valor Total Instrumentos");
        TotalValuePanelInstrument.add(TitleTwo);

        ValueTwo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueTwo.setText("--");
        ValueTwo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TotalValuePanelInstrument.add(ValueTwo);

        jPanel1.add(TotalValuePanelInstrument);

        TotalValuePanelAccessories.setLayout(new java.awt.GridLayout(1, 2));

        TitleSeven.setText("Valor Total Accesorios");
        TotalValuePanelAccessories.add(TitleSeven);

        ValueSeven.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueSeven.setText("--");
        ValueSeven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TotalValuePanelAccessories.add(ValueSeven);

        jPanel1.add(TotalValuePanelAccessories);

        PromedyPanelInstrument.setLayout(new java.awt.GridLayout(1, 2));

        TitleThree.setText("Valor promedio Instrumento");
        PromedyPanelInstrument.add(TitleThree);

        ValueThree.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueThree.setText("--");
        ValueThree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PromedyPanelInstrument.add(ValueThree);

        jPanel1.add(PromedyPanelInstrument);

        PromedyPanelAccessories.setLayout(new java.awt.GridLayout(1, 2));

        TitleEight.setText("Valor promedio Accesorios");
        PromedyPanelAccessories.add(TitleEight);

        ValueEight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueEight.setText("--");
        ValueEight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PromedyPanelAccessories.add(ValueEight);

        jPanel1.add(PromedyPanelAccessories);

        MostExpensivePanelInstrument.setLayout(new java.awt.GridLayout(1, 2));

        TtitleFour.setText("Instrumento mas caro");
        MostExpensivePanelInstrument.add(TtitleFour);

        ValueFour.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueFour.setText("--");
        ValueFour.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MostExpensivePanelInstrument.add(ValueFour);

        jPanel1.add(MostExpensivePanelInstrument);

        MostExpensivePanelAccessories.setLayout(new java.awt.GridLayout(1, 2));

        TtitleNine.setText("Accesorio mas caro");
        MostExpensivePanelAccessories.add(TtitleNine);

        ValueNine.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueNine.setText("--");
        ValueNine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MostExpensivePanelAccessories.add(ValueNine);

        jPanel1.add(MostExpensivePanelAccessories);

        CheaperPanelInstrument.setLayout(new java.awt.GridLayout(1, 2));

        TitleFive.setText("Instrumento mas barato");
        CheaperPanelInstrument.add(TitleFive);

        ValueFive.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueFive.setText("--");
        ValueFive.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CheaperPanelInstrument.add(ValueFive);

        jPanel1.add(CheaperPanelInstrument);

        CheaperPanelAccessories.setLayout(new java.awt.GridLayout(1, 2));

        TitleTen.setText("Accesorio mas barato");
        CheaperPanelAccessories.add(TitleTen);

        ValueTen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ValueTen.setText("--");
        ValueTen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CheaperPanelAccessories.add(ValueTen);

        jPanel1.add(CheaperPanelAccessories);

        BgPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 78, 530, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setData() {
        MessageError.setText("");
        this.setInstrumentData();
        // accesorios
        this.setAccessoriesData();
    }

    private void setInstrumentData() {
        ArrayList<Integer> accessoriesPrices = this.excelService.getStadistics("infoInstrumentos");
        int totalRowsAccessories = accessoriesPrices.size();
        if (totalRowsAccessories <= 0) {
            MessageError.setText("No se encuentran registros de los instrumentos");
            return;
        }
        ValueOne.setText(String.valueOf(accessoriesPrices.get(0)));
        ValueTwo.setText(String.valueOf(accessoriesPrices.get(1)));
        ValueThree.setText(String.valueOf(accessoriesPrices.get(2)));
        ValueFour.setText(String.valueOf(accessoriesPrices.get(3)));
        ValueFive.setText(String.valueOf(accessoriesPrices.get(4)));
    }

    private void setAccessoriesData() {
        ArrayList<Integer> accessoriesPrices = this.excelService.getStadistics("infoAccesorios");
        int totalRowsAccessories = accessoriesPrices.size();
        if (totalRowsAccessories <= 0) {
            MessageError.setText("<html><p>"+MessageError.getText()+"<br/>"+"No se encuentran registros de los accesorios </p></html>");
            return;
        }
        ValueSix.setText(String.valueOf(accessoriesPrices.get(0)));
        ValueSeven.setText(String.valueOf(accessoriesPrices.get(1)));
        ValueEight.setText(String.valueOf(accessoriesPrices.get(2)));
        ValueNine.setText(String.valueOf(accessoriesPrices.get(3)));
        ValueTen.setText(String.valueOf(accessoriesPrices.get(4)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgPanel;
    private javax.swing.JPanel CheaperPanelAccessories;
    private javax.swing.JPanel CheaperPanelInstrument;
    private javax.swing.JLabel MessageError;
    private javax.swing.JPanel MostExpensivePanelAccessories;
    private javax.swing.JPanel MostExpensivePanelInstrument;
    private javax.swing.JLabel PrincipalTitle;
    private javax.swing.JPanel PromedyPanelAccessories;
    private javax.swing.JPanel PromedyPanelInstrument;
    private javax.swing.JLabel TitleEight;
    private javax.swing.JLabel TitleFive;
    private javax.swing.JLabel TitleOne;
    private javax.swing.JLabel TitleSeven;
    private javax.swing.JLabel TitleSix;
    private javax.swing.JLabel TitleTen;
    private javax.swing.JLabel TitleThree;
    private javax.swing.JLabel TitleTwo;
    private javax.swing.JPanel TotalCountPanelAccessories;
    private javax.swing.JPanel TotalCountPanelInstrument;
    private javax.swing.JPanel TotalValuePanelAccessories;
    private javax.swing.JPanel TotalValuePanelInstrument;
    private javax.swing.JLabel TtitleFour;
    private javax.swing.JLabel TtitleNine;
    private javax.swing.JLabel ValueEight;
    private javax.swing.JLabel ValueFive;
    private javax.swing.JLabel ValueFour;
    private javax.swing.JLabel ValueNine;
    private javax.swing.JLabel ValueOne;
    private javax.swing.JLabel ValueSeven;
    private javax.swing.JLabel ValueSix;
    private javax.swing.JLabel ValueTen;
    private javax.swing.JLabel ValueThree;
    private javax.swing.JLabel ValueTwo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
