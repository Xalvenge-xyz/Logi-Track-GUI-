/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import App.Login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AuthFrame extends JFrame {

    protected boolean authorized = true;

    public AuthFrame() {

        if(session.getId() == 0){
            JOptionPane.showMessageDialog(null, "Please login first!");
            new Login().setVisible(true);
            authorized = false;
            dispose();
        }
    }
}
