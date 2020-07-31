package com.rainbowcolors;

import javax.swing.*;
import java.awt.*;

public class Rainbow extends JPanel {

    private final static Color VIOLET = new Color(238,130,238);
    private final static Color INDIGO = new Color(75,0,130);

    private Color[] colors = {Color.WHITE, Color.WHITE, Color.RED, Color.ORANGE,
                              Color.YELLOW, Color.GREEN, Color.BLUE, INDIGO, VIOLET};

    public Rainbow() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics graphics) {
        int radius = 20;
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;

        for (int i = colors.length; i > 0; i--) {
            graphics.setColor(colors[i - 1]);
            graphics.fillArc(centerX - i * radius, centerY - i * radius,
                            i * radius * 2, i * radius* 2, 0, 180);
        }
    }
}
