package service;

import javax.swing.*;

public class PanelUtil {
    /**
     *
     * @param panel JFrame
     * @param title Windows title
     */
    public static void showPanel(JFrame panel, String title) {

        panel.setTitle(title);
        panel.setLocationRelativeTo(null);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setVisible(true);
        panel.setResizable(false);
        panel.setSize(450,250);

    }

}
