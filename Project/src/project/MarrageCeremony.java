package project;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class MarrageCeremony {
	
	public int max=350,min=250;
        public int cX,cY ;
	public int radius;
	public Color color;
	public Pane mainPane;
	Circle circle=new Circle();
	public MarrageCeremony(Pane mainPane,Color color) {
		
		this.color=color;
		this.mainPane=mainPane;
	}
	
	public void draw(){
		
		cX = (int) ((Math.random() * ((max - min) + 1)) + min) ;
                cY = (int) ((Math.random() * ((max - min) + 1)) + min) ;

		circle.setCenterX(cX);
		circle.setCenterY(cY);
                circle.setRadius(200);
                circle.setStroke(Color.SEAGREEN);
                
                Image im = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRJ39m9s5iXcN_RglwuGXDXn4nVqrlfCO_xrhrMZpLPunv8qrZ",false);
                circle.setFill(new ImagePattern(im));

                mainPane.getChildren().add(circle);
	}
	
	public void erase() {
		
		mainPane.getChildren().remove(circle);
	}

    void fillColor(Object object) {

    }
	

}
