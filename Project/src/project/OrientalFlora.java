
package project ;

import java.awt.Graphics;

/**
 *
 * @author rez1
 */
public class OrientalFlora implements IFlora{

    public OrientalFlora() {
        
    }
    
    Graphics g ;
    
    public void getPlant(){
        Tree tre = new Tree() ;
        tre.draw(g);
    }
    
}
