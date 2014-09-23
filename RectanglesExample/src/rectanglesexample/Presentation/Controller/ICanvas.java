/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglesexample.Presentation.Controller;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public interface ICanvas {
    
    JTextField width();
    JTextField height();
    Graphics graphics(); 
    void close();
    
}
