package graphicbasics;
 
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
 
import views.TheFrame1;
 
public class Driver1 {
 
  private final TheFrame1 frame = new TheFrame1();
  private final JComponent canvas = frame.getCanvas();
 
  public Driver1() {
    frame.setTitle( getClass().getSimpleName() );
 
    frame.setSize(700,600);
 
    frame.getDrawButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Graphics g = canvas.getGraphics();
        Graphics2D g2 = (Graphics2D) g;
 
        Shape s = new Rectangle2D.Double(10, 10, 200, 100);
 
        g2.setStroke(new BasicStroke(4.2f));
 
        g2.setColor(Color.red);  // set color
        g2.fill(s);              // and fill the shape
 
        g2.setColor(Color.blue); // set color
        g2.draw(s);              // draw the shape (the outline)
      }
    });
  }
 
  public static void main(String[] args) {
    Driver1 app = new Driver1();
    app.frame.setVisible(true);
  }
}