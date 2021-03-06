/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librecatalog;

import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author van
 */
public class UserInterface
{
    
    /**
     * Provides for graphical error reporting.
     * @param err error code generated by program section.
     *            100 range - configuration class.
     *            200 range - GUI errors.
     */
    public static void Error(int err) {
        int type;
        String title;
        String message;
        switch(err) {
            case 101:
                message = "The configuration file was not found.";
                title = "Configuration Info";
                type = JOptionPane.WARNING_MESSAGE;
                break;
            case 102:
                message = "Unexpected file input error.";
                title = "Configuration Error";
                type = JOptionPane.ERROR_MESSAGE;
                break;
            case 201:
                message = "Error: Invalid Permission Level.";
                title = "Access Denied";
                type = JOptionPane.WARNING_MESSAGE;
                break;
            default:
                message = "Error "+err+": undefined error code generated.";
                title = "Warning";
                type = JOptionPane.WARNING_MESSAGE;
        }
        JOptionPane.showMessageDialog(null,message,title,type);
                    
    }

    /**
     * Load up the real interface its time to play with the big guns.
     */
    static void load()
    {
        throw new UnsupportedOperationException("Not yet implemented");
        
    }

    /**
     * Allows for setup and reconfiguration of admin and librarian level passwords
     * in the event of a config file misplacement.
     * @return true if authentication succeeded false if it failed.
     */
    static boolean productSetupKey()
    {
        String setupPass = JOptionPane.showInputDialog("Setup mode detected please enter the setup\n"
                + " password you recieved with this software.");
        while (!setupPass.equals("Nova-Gamma-7even-d3lt4")) {
            setupPass = JOptionPane.showInputDialog(
                    "Unrecognized Password: Please re-enter\nthe setup password"
                    + " you recieved with this software."
                );
            if ("".equals(setupPass) )
                return false;
        }
        System.out.println("Setup mode activated.");
        return true;
    }
}
