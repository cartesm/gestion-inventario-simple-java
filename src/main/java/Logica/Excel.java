package Logica;

import Logica.Schemas.Instrument;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.ArrayList;

public class Excel {

    public ArrayList<Integer> getStadistics(String path) {
        String fileSrc = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\" + path + ".xlsx";
        ArrayList<Integer> prices = new ArrayList<Integer>();

        try {
            FileInputStream fis = new FileInputStream(fileSrc);
            Workbook workBook = new XSSFWorkbook(fis);
            Sheet sheet = workBook.getSheetAt(0);
            if (sheet.getPhysicalNumberOfRows() <= 0) {
                return new ArrayList<Integer>();
            }

            int totalValue = 0;
            int totalProducts = 0;
            int menorPrecio = Integer.MAX_VALUE;
            int mayorPrecio = 0;

            for (Row row : sheet) {
                totalValue += (int) Float.parseFloat(row.getCell(3).toString()) * (int) Float.parseFloat(row.getCell(4).toString());
                totalProducts += (int) Float.parseFloat(row.getCell(4).toString());

                if ((int) Float.parseFloat(row.getCell(3).toString()) <= menorPrecio) {
                    menorPrecio = (int) Float.parseFloat(row.getCell(3).toString());
                }
                if ((int) Float.parseFloat(row.getCell(3).toString()) >= mayorPrecio) {
                    mayorPrecio = (int) Float.parseFloat(row.getCell(3).toString());
                }
            }

            System.out.println(totalProducts);
            System.out.println(totalValue);

            prices.add(totalProducts);
            prices.add(totalValue);
            prices.add(totalValue / totalProducts);
            prices.add(mayorPrecio);
            prices.add(menorPrecio);

            return prices;

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Algo anda mal");
            return new ArrayList<Integer>();
        }

    }

    public void updateFile(String path, int rowToUpdate, Instrument intrumento) {

        String fileSrc = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\" + path + ".xlsx";

        try {
            FileInputStream fis = new FileInputStream(fileSrc);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            Row row = sheet.getRow(rowToUpdate);
            row.createCell(0).setCellValue(intrumento.getNombre());
            row.createCell(1).setCellValue(intrumento.getMarca());
            row.createCell(2).setCellValue(intrumento.getTipo());
            row.createCell(3).setCellValue(intrumento.getPrecio());
            row.createCell(4).setCellValue(intrumento.getStock());

            FileOutputStream fos = new FileOutputStream(fileSrc);
            workbook.write(fos);
            System.out.println("correcto en teoria");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Esta wea no debe de aparecer");
        }
    }

    public void deleteRow(String path, int rowToDelete) {

        String fileSrc = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\" + path + ".xlsx";
        try {
            FileInputStream fis = new FileInputStream(fileSrc);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            int lastRow = sheet.getLastRowNum();
            Row row = sheet.getRow(rowToDelete);
            if (row == null) {
                System.out.println("no exiuste");
                return;
            }

            if (rowToDelete >= 0 && rowToDelete <= lastRow) {
                sheet.shiftRows(rowToDelete + 1, lastRow + 1, - 1);
            }

            FileOutputStream fos = new FileOutputStream(fileSrc);
            workbook.write(fos);

        } catch (Exception e) {
            System.out.println("Este mensaje no deberia aparecer");
            System.out.println("si aparece esto llamen a dios, o en su defecto a mi");
        }

    }

    public void exportFile(File path, JTable tableModel, int totalRows) {

        DefaultTableModel tabla = (DefaultTableModel) tableModel.getModel();

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Uno");
        Row row = sheet.createRow(0);
        row.createCell(0).setCellValue("Nombre");
        row.createCell(1).setCellValue("Marca");
        row.createCell(2).setCellValue("Tipo");
        row.createCell(3).setCellValue("Precio");
        row.createCell(4).setCellValue("Stock");

        for (int i = 0; i < totalRows; i++) {
            row = sheet.createRow(i + 1);

            for (int ii = 0; ii < 5; ii++) {
                if (ii == 3 || ii == 4) {
                    row.createCell(ii).setCellValue((int) Integer.parseInt(tabla.getValueAt(i, ii).toString()));
                }
                row.createCell(ii).setCellValue(tabla.getValueAt(i, ii).toString());
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream(path);
            workbook.write(fos);
            System.out.println("bueno");
        } catch (Exception e) {
            System.out.println("malo");
            e.printStackTrace();
        }

    }

    public void addRow(String path, Instrument data) {
        try {
            String fileSrc = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\" + path + ".xlsx";
            FileInputStream fis = new FileInputStream(fileSrc);
            Workbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(0);

            Row row = sheet.createRow(sheet.getLastRowNum() + 1);

            row.createCell(0).setCellValue(data.getNombre());
            row.createCell(1).setCellValue(data.getMarca());
            row.createCell(2).setCellValue(data.getTipo());
            row.createCell(3).setCellValue(data.getPrecio());
            row.createCell(4).setCellValue(data.getStock());

            FileOutputStream fos = new FileOutputStream(fileSrc);
            workbook.write(fos);

        } catch (Exception e) {
            System.out.println("Llamen a dave");
        }

    }

    public void populate(String path, JTable table) {
        String fileSrc = System.getProperty("user.dir") + "\\src\\main\\java\\Datos\\" + path + ".xlsx";
        DefaultTableModel tabla = (DefaultTableModel) table.getModel();
        try {
            FileInputStream fis = new FileInputStream(fileSrc);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                tabla.addRow(new Object[]{
                    row.getCell(0),
                    row.getCell(1),
                    row.getCell(2),
                    (int) Float.parseFloat(row.getCell(3).toString()),
                    (int) Float.parseFloat(row.getCell(4).toString())
                });
            }

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error xd");
        }
    }

}
