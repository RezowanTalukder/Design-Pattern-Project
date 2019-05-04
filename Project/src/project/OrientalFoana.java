package project;

import java.awt.Graphics;

/**
 *
 * @author rez1
 */
public class OrientalFoana implements IFoana{

    public OrientalFoana() {
        
    }
    
    Graphics g ;
    
    public void getPlant(){
           Tree tree = new Tree() ;
           tree.draw(g);
    }
    
}
