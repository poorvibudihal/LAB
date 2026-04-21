package Swings;

import java.awt.Color;
import javax.swing.*;

public class TabbedpaneExample {

    JFrame f;

    TabbedpaneExample() {

        f = new JFrame("Tabbed Pane Color Example");

        // Create panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set background colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Add tabbed pane to frame
        f.add(tp);

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedpaneExample();
    }
}