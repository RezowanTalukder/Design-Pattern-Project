package project;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle implements IShape{
	
	int x, y, radius;
	
	public Triangle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	
	public void draw(Graphics g) {
                
            int x[]={200,500,350};
            int y[]={130,130,60};
            g.drawPolygon(x,y,3);

	    g.setColor(Color.gray);
	    g.fillPolygon(x, y, 3);
	}
}
