package views;

import javax.swing.JButton;

/**
 *
 * @author Robert Kline
 */
public class TheFrame3 extends javax.swing.JFrame {

  public Canvas3 getCanvas() {
    return (Canvas3) canvas;
  }

  public JButton getDrawButton() {
    return draw;
  }

  /**
   * Creates new form FirstFrame
   */
  public TheFrame3() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    canvas = new views.Canvas3();
    jPanel1 = new javax.swing.JPanel();
    draw = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    canvas.setEditable(false);
    canvas.setColumns(20);
    canvas.setRows(5);
    jScrollPane1.setViewportView(canvas);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    draw.setText("Draw");
    jPanel1.add(draw);

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea canvas;
  private javax.swing.JButton draw;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  // End of variables declaration//GEN-END:variables
}
