package views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JTextArea;
import java.awt.RenderingHints;

import figure.Figure;
import java.awt.geom.AffineTransform;

public class Canvas5 extends JTextArea {

  private Figure top = null, bottom = null;

  public void setTopFigure(Figure top) {
    this.top = top;
  }

  public void setBottomFigure(Figure bottom) {
    this.bottom = bottom;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
    );

    if (bottom == null || top == null) {
      return;
    }

    AffineTransform t = g2.getTransform(); // save the transform settings
    
    double x, y, scale;

    x = bottom.getXloc();
    y = bottom.getYloc();
    scale = bottom.getScale();
    
    g2.translate(x, y);
    g2.scale(scale, scale);
    bottom.draw(g2);
    g2.setTransform(t);  // comment this line after settting, in Driver5:
                         //   currentFigure = bottom figure
                         // to see what happens 
    x = top.getXloc();
    y = top.getYloc();
    scale = top.getScale();
    
    g2.translate(x, y);
    g2.scale(scale, scale);
    top.draw(g2);
    g2.setTransform(t);
  }
}
