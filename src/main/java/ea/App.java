package ea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.color.*;


public class App {

  public static void main(String[] args) {
    App main = new App();

    main.show_window();
  }

  public void show_window() {

    // Create and set up the window
    JFrame frame = new JFrame("Dijkstras");
    JLabel label = new JLabel("Hello, World!");
    // JPanel panel = new JPanel();

    // panel.add(label);
    // panel.setBackground(Color.black);

    // frame.getContentPane().setBackground(Color.black);

    DrawCircles panel = new DrawCircles();
    panel.setBackground(Color.black);
    frame.getContentPane().add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(1024, 768);
    frame.setVisible(true);
  }

}
