package GUI.UI;

import Logica.Schemas.Instrument;
import javax.swing.UIManager;

public class UpdateItemDialog extends javax.swing.JDialog {

    private Instrument instrumento;

    public UpdateItemDialog(java.awt.Frame parent, boolean modal, Instrument instrumento, boolean isInstrument) {
        super(parent, modal);
        initComponents();
        NameLabel.putClientProperty("FlatLaf.styleClass", "h1");
        TitleLabel.putClientProperty("FlatLaf.styleClass", "h1");
        NameInput.setText(instrumento.getNombre());
        MarcaInput.setText(instrumento.getMarca());
        TypeInput.setText(instrumento.getTipo());
        PriceInput.setText(String.valueOf(instrumento.getPrecio()));
        StockInput.setText(String.valueOf(instrumento.getStock()));
        if (!isInstrument) {
            TitleLabel.setText("Actualizar Accesorio");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        MarcaInput = new javax.swing.JTextField();
        Marcalabel = new javax.swing.JLabel();
        TypeInput = new javax.swing.JTextField();
        TipeLabel = new javax.swing.JLabel();
        PriceInput = new javax.swing.JTextField();
        PrecioLabel = new javax.swing.JLabel();
        StockInput = new javax.swing.JTextField();
        StockLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ErrorMessages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Actualizar Instrumento");
        TitleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        SubmitButton.setBackground(new java.awt.Color(78, 150, 87));
        SubmitButton.setText("Actualizar");
        SubmitButton.setBorderPainted(false);
        SubmitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        NameLabel.setText("Nombre");

        Marcalabel.setText("Marca");

        TipeLabel.setText("Tipo");

        PrecioLabel.setText("Precio");

        StockLabel.setText("Stock");

        ErrorMessages.setForeground(new java.awt.Color(255, 53, 67));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(145, 145, 145))
            .addComponent(TitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ErrorMessages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Marcalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarcaInput)
                    .addComponent(TipeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TypeInput)
                    .addComponent(PrecioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PriceInput)
                    .addComponent(StockLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StockInput)
                    .addComponent(NameInput, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Marcalabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MarcaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TipeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PrecioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PriceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StockLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StockInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ErrorMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        ErrorMessages.setText("");

        String nombre = NameInput.getText();
        String marca = MarcaInput.getText();
        String tipo = TypeInput.getText();
        int stock;
        int precio;

        if (nombre.equals("")) {
            ErrorMessages.setText("El valor del nombre no puede estar en vacio");
            return;
        }
        if (marca.equals("")) {
            ErrorMessages.setText("El valor de la marca no puede estar en vacio");
            return;
        }
        if (tipo.equals("")) {
            ErrorMessages.setText("El valor del tipo no puede estar en vacio");
            return;
        }
        try {
            precio = Integer.parseInt(PriceInput.getText());
            stock = Integer.parseInt(StockInput.getText());
        } catch (Exception e) {
            ErrorMessages.setText("Los valores del stock y el precio deben se numeros");
            return;
        }
        if (precio <= 0) {
            ErrorMessages.setText("El valor del precio debe ser mayor a 0");
            return;
        }
        if (stock <= 0) {
            ErrorMessages.setText("El valor del stock debe ser mayor a 0");
            return;
        }

        instrumento = new Instrument(nombre, marca, tipo, precio, stock);
        System.out.println(instrumento);
        this.dispose();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    public Instrument getInstrumento() {
        return instrumento;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMessages;
    private javax.swing.JTextField MarcaInput;
    private javax.swing.JLabel Marcalabel;
    private javax.swing.JTextField NameInput;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JTextField StockInput;
    private javax.swing.JLabel StockLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TipeLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TypeInput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
