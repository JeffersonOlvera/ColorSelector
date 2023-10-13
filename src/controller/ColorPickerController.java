package controller;

import service.PanelUtil;
import view.ColorPicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorPickerController implements ActionListener {
    private final PanelUtil panelUtil = new PanelUtil();
    private ColorPicker colorPicker = new ColorPicker();

    private final Color BROWN = new Color(150, 75, 0);
    private final Color ORANGE = new Color(255, 95, 31);
    private final Color PINK = new Color(255, 105, 180);

    private final Color SKY_BLUE = new Color(0, 191, 255);

    public ColorPickerController(ColorPicker colorPicker) {
        this.colorPicker = colorPicker;
        this.colorPicker.amarilloButton.addActionListener(this);
        this.colorPicker.rojoButton.addActionListener(this);
        this.colorPicker.blancoButton.addActionListener(this);
        this.colorPicker.celesteButton.addActionListener(this);
        this.colorPicker.rosadoButton.addActionListener(this);
        this.colorPicker.azulButton.addActionListener(this);
        this.colorPicker.verdeButton.addActionListener(this);
        this.colorPicker.negroButton.addActionListener(this);
        this.colorPicker.naranjaButton.addActionListener(this);
        this.colorPicker.cafeButton.addActionListener(this);
    }

    public void run() {
        PanelUtil.showPanel(colorPicker, "Color Picker - POE");
    }

    /**
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton button = (JButton) e.getSource();

        if (button.equals(colorPicker.amarilloButton)) {
            colorPicker.ColorPanel.setBackground(Color.YELLOW);
        }
        if (button.equals(colorPicker.rojoButton)) {
            colorPicker.ColorPanel.setBackground(Color.RED);
        }
        if (button.equals(colorPicker.blancoButton)) {
            colorPicker.ColorPanel.setBackground(Color.WHITE);
        }
        if (button.equals(colorPicker.rosadoButton)) {
            colorPicker.ColorPanel.setBackground(PINK);
        }
        if (button.equals(colorPicker.celesteButton)) {
            colorPicker.ColorPanel.setBackground(SKY_BLUE);
        }
        if (button.equals(colorPicker.azulButton)) {
            colorPicker.ColorPanel.setBackground(Color.BLUE);
        }
        if (button.equals(colorPicker.verdeButton)) {
            colorPicker.ColorPanel.setBackground(Color.GREEN);
        }
        if (button.equals(colorPicker.negroButton)) {
            colorPicker.ColorPanel.setBackground(Color.BLACK);
        }
        if (button.equals(colorPicker.naranjaButton)) {
            colorPicker.ColorPanel.setBackground(ORANGE);
        }
        if (button.equals(colorPicker.cafeButton)) {
            colorPicker.ColorPanel.setBackground(BROWN);
        }

    }
}
