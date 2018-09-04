package graphicbasics;

import java.awt.Color;

import views.Canvas5;
import views.TheFrame5;

import figure.Figure;
import figure.PolyFigure;
import figure.RectangleFigure;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Driver5 {

  private final TheFrame5 frame = new TheFrame5();
  private final Canvas5 canvas = frame.getCanvas();

  private Figure currentFigure = null;

  private int lastX, lastY;
  private Figure selectedFigure = null;

  private Figure getFigureA() {
    Figure figure = new RectangleFigure(200, 100);
    figure.setLoc(80, 80);
    figure.setLineColor(Color.green);
    figure.setFillColor(Color.yellow);
    figure.setStrokeWidth(7f);
    return figure;
  }
  
  private Figure getFigureB() {
    List<Point> points = new ArrayList<>();
    points.add(new Point(180, 20));
    points.add(new Point(20, 200));
    points.add(new Point(20, 75));
    
    Figure figure = new PolyFigure(points);
    figure.setFillColor(Color.red);
    figure.setLoc(0, 0);
    figure.setLineColor(Color.magenta);
    figure.setStrokeWidth(4.2f);
    return figure;
  }
  
  public Driver5() {
    frame.setTitle(getClass().getSimpleName());
    frame.setSize(700, 600);
    frame.setLocationRelativeTo(null);

    frame.getScaleSpinner().setModel(
        new SpinnerNumberModel(1.0, 0.1, 5.0, 0.05)
    );

    Figure figureA = getFigureA();
    Figure figureB = getFigureB();
    
    canvas.setTopFigure(figureA);
    canvas.setBottomFigure(figureB);

    currentFigure = figureB;

    frame.getScaleSpinner().addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        double d = (Double) frame.getScaleSpinner().getValue();
        currentFigure.setScale(d);
        canvas.repaint();
      }
    });
    
    frame.getSetScale().addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        frame.getScaleSpinner().setValue(2.0);
      }
    });

    canvas.addMouseListener(new MouseAdapter() {
      @Override
      public void mousePressed(MouseEvent e) {
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
    Driver5 app = new Driver5();
    app.frame.setVisible(true);
  }
}
