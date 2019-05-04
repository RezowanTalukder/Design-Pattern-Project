package project;

import java.awt.Graphics;

public class Draw extends ICommand{

	MarrageCeremony circle;
        //Graphics g ;
	public Draw(MarrageCeremony circle) {
		
		this.circle=circle;
	}
	@Override
	public void execute(){
		
		circle.draw();
	}
	@Override
	public void undo() {
		
		circle.erase();
	}
	@Override
	public void redo() {
		
		circle.draw();
	}
}
