package graphicbasics;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
 
import views.Canvas3;
import views.TheFrame3;
 
import figure.Figure;
import figure.RectangleFigure;
 
public class Driver3 {
 
  private final TheFrame3 frame = new TheFrame3();
  private final Canvas3 canvas = frame.getCanvas();
 
  private Figure currentFigure = null;
 
  private Figure getFigure() {
    Figure fig = new RectangleFigure(200, 100);
    fig.setLoc(20, 20);
    fig.setLineColor(Color.blue);
    fig.setFillColor(Color.red);
    fig.setStrokeWidth(4.2f);
    return fig;
  }
 
  public Driver3() {
    frame.setTitle(getClass().getSimpleName());
    frame.setSize(700, 600);
    frame.setLocationRelativeTo(null);

    currentFigure = getFigure();
 
    frame.getDrawButton().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        canvas.setFigure(currentFigure);
        canvas.repaint();
      }
    });
  }
 
  public static void main(String[] args) {
    Driver3 app = new Driver3();
    app.frame.setVisible(true);
  }
}