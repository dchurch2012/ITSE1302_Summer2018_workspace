package graphicbasics;
 
import java.awt.Color;
 
import views.Canvas3;
import views.TheFrame3;
 
import figure.Figure;
import figure.RectangleFigure;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
 
public class Driver4 {
 
  private final TheFrame3 frame = new TheFrame3();
  private final Canvas3 canvas = frame.getCanvas();
 
  private Figure currentFigure = null;
  
  private int lastX, lastY;
  private Figure selectedFigure = null;
 
  private Figure getFigure() {
    Figure fig = new RectangleFigure(200, 100);
    fig.setLoc(20, 20);
    fig.setLineColor(Color.blue);
    fig.setFillColor(Color.red);
    fig.setStrokeWidth(4.2f);
    return fig;
  }
 
  public Driver4() {
    frame.setTitle(getClass().getSimpleName());
    frame.setSize(700, 600);
    frame.setLocationRelativeTo(null);

    currentFigure = getFigure();
    canvas.setFigure(currentFigure);
     
    canvas.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
        if (currentFigure == null) { // no figure available
          return;
        }
        int x = e.getX(), y = e.getY();

        if (currentFigure.getShape().contains(x, y)) {
          selectedFigure = currentFigure;
        }
 
        lastX = x;
        lastY = y;
      }
 
      @Override
      public void mouseReleased(MouseEvent e) {
        selectedFigure = null;
      }
    });
 
    canvas.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseDragged(MouseEvent e) {
        if (selectedFigure == null) {
          return;
        }
        int x = e.getX(), y = e.getY();
 
        int incX = x - lastX;
        int incY = y - lastY;
 
        lastX = x;
        lastY = y;
 
        selectedFigure.incLoc(incX, incY);
        canvas.repaint();
      }
    });
    
  }
 
  public static void main(String[] args) {
    Driver4 app = new Driver4();
    app.frame.setVisible(true);
  }
}
