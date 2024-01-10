package ea;

import java.awt.*;
import javax.swing.*;

class DrawCircles extends JPanel {
  private int circleRadius = 50;

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Calculate the center of the panel
    int centerX = 50;
    int centerY = 50;

    // Draw a filled circle with a certain radius
    g.setColor(Color.RED);
    g.fillOval(centerX - circleRadius, centerY - circleRadius, 2 * circleRadius, 2 * circleRadius);
  }
}
