package views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextArea;
import java.awt.RenderingHints;

import figure.Figure;
import java.awt.geom.AffineTransform;

public class Canvas3 extends JTextArea {

  private Figure figure = null;

  public void setFigure(Figure figure) {
    this.figure = figure;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );

    if (figure == null) {
      return;
    }

    AffineTransform t = g2.getTransform(); // save the transform settings

    double x = figure.getXloc(), y = figure.getYloc();

    g2.translate(x, y);
    figure.draw(g2);
    g2.setTransform(t);

//    g2.translate(x, y);
//    figure.draw(g2);
//    g2.translate(-x, -y);
  }
}
