package graphicbasics;
 
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
 
import views.TheFrame2;
import views.Canvas2;
 
public class Driver2 {
 
  private final TheFrame2 frame = new TheFrame2();
  private final Canvas2 canvas = frame.getCanvas();
 
  public Driver2() {
    frame.setTitle( getClass().getSimpleName() );
    frame.setSize(700,600);
    frame.setLocationRelativeTo(null);
 
    frame.getDrawButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {        
        Shape s = new Rectangle2D.Double(10, 10, 200, 100);
        //Shape s = new Line2D.Double(10, 10, 155, 90);
        //Shape s = new Ellipse2D.Double(10, 10, 200, 100);
        //Shape s = new Ellipse2D.Double(10, 10, 200, 200);
        //Shape s = new RoundRectangle2D.Double(10, 10, 200, 100, 20, 20);
 
        canvas.setShape(s);
        canvas.repaint();
      }
    });
  }
 
  public static void main(String[] args) {
    Driver2 app = new Driver2();
    app.frame.setVisible(true);
  }
}