/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import UI.AtorDialog;
import UI.GeneroDialog;
import UI.PaisDialog;
import java.text.SimpleDateFormat;
//import javax.swing.*;

/**
 *
 * @author a1511335
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY/MM/dd");
        // TODO code application logic here
        //new GeneroDialog().setVisible(true);
        //new PaisDialog().setVisible(true);
        new AtorDialog().setVisible(true);
        
        //new frmPrincipal().setVisible(true);
    }
    
}
