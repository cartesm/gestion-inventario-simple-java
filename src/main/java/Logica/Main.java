package Logica;

import GUI.MainWindow;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class Main {

    public static void main(String[] args) {
        FlatGradiantoMidnightBlueIJTheme.setup();
        IconFontSwing.register(FontAwesome.getIconFont());

        MainWindow window = new MainWindow();
        window.setTitle("Melody Manager");
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);

    }

}
