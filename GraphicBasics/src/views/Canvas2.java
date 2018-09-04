package views;
 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.RenderingHints;
import javax.swing.JTextArea;
 
public class Canvas2 extends JTextArea {
 
  private Shape shape = null;
 
  public void setShape(Shape shape) {
    this.shape = shape;
  }
 
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
 
    if (shape == null) {
      return;
    }
 
    Graphics2D g2 = (Graphics2D) g;
 
    g2.setRenderingHint(
      RenderingHints.KEY_ANTIALIASING,
      RenderingHints.VALUE_ANTIALIAS_ON
    );
 
    g2.draw(shape);
  }
}