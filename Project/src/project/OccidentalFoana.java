
package project;

import java.awt.Graphics;

/**
 *
 * @author rez1
 */
public class OccidentalFoana implements IFoana{

    public OccidentalFoana() {
        
    }
    
    Graphics g ;
    
    public void getPlant(){
            Tree tree = new Tree() ;
            tree.draw(g);
    }
    
}
