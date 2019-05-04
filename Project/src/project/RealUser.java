
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author rez1
 */
public class RealUser implements Proxy{
    @Override
    public void connectTo(String userName) 
    { 
        JOptionPane.showMessageDialog(null,"Permission approved: "+ userName);
    }
}
