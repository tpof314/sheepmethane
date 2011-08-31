/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uwa.cits3200.sheepmethane;

import org.javalite.activejdbc.Base;

import edu.uwa.cits3200.sheepmethane.view.MainWindow;

/**
 *
 * @author zaydana
 */
public class Main {
   /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Base.open("org.h2.Driver", "jdbc:h2:~/test", "root", "");
    
    MainWindow win = new MainWindow();
    win.setVisible(true);
  }
}
