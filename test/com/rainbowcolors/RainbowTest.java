package com.rainbowcolors;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class RainbowTest {

    public static void main(String[] args) {

        Rainbow rainbow = new Rainbow();

        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(400, 250);
        jFrame.add(rainbow);
    }

}