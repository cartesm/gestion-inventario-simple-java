package GUI.Pages;

import GUI.UI.UpdateItemDialog;
import Logica.Excel;
import GUI.Pages.Stadistics;
import GUI.UI.CreateItemDialog;
import Logica.Schemas.Instrument;
import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AccessoryPanel extends javax.swing.JPanel {

    private Excel excelService = new Excel();

    public AccessoryPanel() {

        initComponents();
        excelService.populate("infoAccesorios", AccessoryTable);
        MessageError.setText("");
        PrincipalTitle.putClientProperty("FlatLaf.styleClass", "h1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BgPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccessoryTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        ExcelButton = new javax.swing.JButton();
        CreateButton = new javax.swing.JButton();
        EditButton1 = new javax.swing.JButton();
        MessageError = new javax.swing.JLabel();
        PrincipalTitle = new javax.swing.JLabel();
        EstadisticButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(510, 368));
        setMinimumSize(new java.awt.Dimension(510, 368));

        AccessoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Tipo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AccessoryTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(AccessoryTable);

        DeleteButton.setBackground(new java.awt.Color(255, 53, 67));
        DeleteButton.setText("Eliminar");
        DeleteButton.setBorderPainted(false);
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ExcelButton.setText("Exportar a Excel");
        ExcelButton.setBorderPainted(false);
        ExcelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelButtonActionPerformed(evt);
            }
        });

        CreateButton.setBackground(new java.awt.Color(78, 150, 87));
        CreateButton.setText("Crear");
        CreateButton.setBorderPainted(false);
        CreateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        EditButton1.setBackground(new java.awt.Color(242, 127, 61));
        EditButton1.setText("Editar");
        EditButton1.setBorderPainted(false);
        EditButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButton1ActionPerformed(evt);
            }
        });

        MessageError.setForeground(new java.awt.Color(255, 53, 67));
        MessageError.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        MessageError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PrincipalTitle.setText("Accesorios");
        PrincipalTitle.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        EstadisticButton.setText("Estadisticas");
        EstadisticButton.setBorderPainted(false);
        EstadisticButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EstadisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgPanelLayout = new javax.swing.GroupLayout(BgPanel);
        BgPanel.setLayout(BgPanelLayout);
        BgPanelLayout.setHorizontalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(PrincipalTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                        .addComponent(MessageError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                                .addComponent(CreateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                                .addComponent(ExcelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EstadisticButton)))))
                .addContainerGap())
        );
        BgPanelLayout.setVerticalGroup(
            BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrincipalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MessageError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgPanelLayout.createSequentialGroup()
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addGroup(BgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExcelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstadisticButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        MessageError.setText("");
        CreateItemDialog window = new CreateItemDialog(null, true, false);

        window.setLocationRelativeTo(this);
        window.setTitle("Crear Accesorio");
        window.setVisible(true);

        Instrument instrumento = window.getInstrumento();

        if (instrumento == null) {
            System.out.println("Objeto no valido");
            MessageError.setText("Datos invalidos, intente nuevamente");
            return;
        }
        DefaultTableModel table = (DefaultTableModel) AccessoryTable.getModel();
        table.addRow(new Object[]{
            instrumento.getNombre(),
            instrumento.getMarca(),
            instrumento.getTipo(),
            instrumento.getPrecio(),
            instrumento.getStock()
        });
        excelService.addRow("infoAccesorios", instrumento);
    }//GEN-LAST:event_CreateButtonActionPerformed


    private void EditButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButton1ActionPerformed
        MessageError.setText("");
        int selectedRow = AccessoryTable.getSelectedRow();
        if (selectedRow == -1) {
            MessageError.setText("Primero selecciona una fila");
            return;
        }
        DefaultTableModel tabla = (DefaultTableModel) AccessoryTable.getModel();

        String nombre = String.valueOf(tabla.getValueAt(selectedRow, 0));
        String marca = String.valueOf(tabla.getValueAt(selectedRow, 1));
        String tipo = String.valueOf(tabla.getValueAt(selectedRow, 2));
        int precio = Integer.parseInt(String.valueOf(tabla.getValueAt(selectedRow, 3)));
        int stock = Integer.parseInt(String.valueOf(tabla.getValueAt(selectedRow, 4)));

        UpdateItemDialog window = new UpdateItemDialog(null, true, new Instrument(nombre, marca, tipo, precio, stock), false);
        window.setLocationRelativeTo(this);
        window.setTitle("Actualizar Accesorio");
        window.setVisible(true);

        Instrument instrumento = window.getInstrumento();
        if (instrumento == null) {
            System.out.println("Accesorio no valido");
            MessageError.setText("Datos invalidos, intente nuevamente");
            return;
        }

        tabla.setValueAt(instrumento.getNombre(), selectedRow, 0);
        tabla.setValueAt(instrumento.getMarca(), selectedRow, 1);
        tabla.setValueAt(instrumento.getTipo(), selectedRow, 2);
        tabla.setValueAt(instrumento.getPrecio(), selectedRow, 3);
        tabla.setValueAt(instrumento.getStock(), selectedRow, 4);

        excelService.updateFile("infoAccesorios", selectedRow, instrumento);


    }//GEN-LAST:event_EditButton1ActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        MessageError.setText("");
        int selectedRow = AccessoryTable.getSelectedRow();
        if (selectedRow == -1) {
            MessageError.setText("Primero selecciona una fila");
            return;
        }

        int optionSelect = JOptionPane.showOptionDialog(
                null,
                "¿Estas seguro de borar esta fila?",
                "Eliminar fila",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new Object[]{"Aceptar", "Cancelar"},
                null);
        if (optionSelect == JOptionPane.YES_OPTION) {
            DefaultTableModel tabla = (DefaultTableModel) AccessoryTable.getModel();
            tabla.removeRow(selectedRow);
            excelService.deleteRow("infoAccesorios", selectedRow);
        }


    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelButtonActionPerformed
        MessageError.setText("");
        int totalRows = AccessoryTable.getRowCount();
        if (totalRows == 0) {
            MessageError.setText("Primero ingresa valores a la tabla");
            return;
        }
        File file;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int selecOption = fileChooser.showOpenDialog(this);
        if (selecOption == JFileChooser.APPROVE_OPTION) {
            file = new File(fileChooser.getSelectedFile() + "\\infoAccesorios.xlsx");
        } else {
            MessageError.setText("Selecciona donde se guardara tu archivo para continuar");
            return;
        }
        excelService.exportFile(file, AccessoryTable, totalRows);

    }//GEN-LAST:event_ExcelButtonActionPerformed

    private void EstadisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticButtonActionPerformed
        MessageError.setText("");
        int totalRows = AccessoryTable.getRowCount();
        if (totalRows <= 0) {
            MessageError.setText("Para ver las estadisticas primero ingresa algun valor");
            return;
        }
        this.changePanel();
    }//GEN-LAST:event_EstadisticButtonActionPerformed

    private void changePanel() {
        Stadistics panel = new Stadistics(false, AccessoryTable);
        panel.setSize(560, 368);
        panel.setLocation(0, 0);
        BgPanel.removeAll();
        BgPanel.add(panel, BorderLayout.CENTER);
        BgPanel.revalidate();
        BgPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AccessoryTable;
    private javax.swing.JPanel BgPanel;
    private javax.swing.JButton CreateButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton1;
    private javax.swing.JButton EstadisticButton;
    private javax.swing.JButton ExcelButton;
    private javax.swing.JLabel MessageError;
    private javax.swing.JLabel PrincipalTitle;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
