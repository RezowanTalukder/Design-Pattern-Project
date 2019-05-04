
package project;

import java.awt.Graphics;

/**
 *
 * @author rez1
 */
public class OccedentalFlora implements IFlora{

    public OccedentalFlora() {
        
    }
    
    Graphics g ;
    
    public void getPlant(){
            Tree tree =  new Tree() ;
            tree.draw(g);
    }
}
