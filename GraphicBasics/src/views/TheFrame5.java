package views;

import javax.swing.JButton;
import javax.swing.JSpinner;

/**
 *
 * @author Robert Kline
 */
public class TheFrame5 extends javax.swing.JFrame {

  public Canvas5 getCanvas() {
    return (Canvas5) canvas;
  }
  
  public JSpinner getScaleSpinner() {
    return scale;
  }
  
  public JButton getSetScale() {
    return setscale;
  }

  /**
   * Creates new form FirstFrame
   */
  public TheFrame5() {
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
    canvas = new views.Canvas5();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    scale = new javax.swing.JSpinner();
    setscale = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    canvas.setEditable(false);
    canvas.setColumns(20);
    canvas.setRows(5);
    jScrollPane1.setViewportView(canvas);

    getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

    jLabel1.setText("scale:");
    jPanel1.add(jLabel1);
    jPanel1.add(scale);

    setscale.setText("set scale=2.0");
    jPanel1.add(setscale);

    getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextArea canvas;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JSpinner scale;
  private javax.swing.JButton setscale;
  // End of variables declaration//GEN-END:variables
}
