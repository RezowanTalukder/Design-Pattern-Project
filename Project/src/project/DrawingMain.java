
package project;


import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class DrawingMain extends JPanel {

        public static Pane mainPane ;
        public static BorderPane bp ;
	public static JFrame frame;
	public Graphics g2 = getGraphics(); ;
        
        
        private static DrawingMain dm ;
        
	
	private DrawingMain() {

		
		JButton btnIsland1 = new JButton("Oriental");
		btnIsland1.setBounds(210, 702, 120, 23);
                
                JButton btnIsland2 = new JButton("Occedental");
		btnIsland2.setBounds(357, 702, 120, 23);
                
                JButton btnMarrage = new JButton("Marrage");
		btnMarrage.setBounds(710, 502, 120, 23);
                
                JButton btnUndo = new JButton("Undo Marrage");
		btnUndo.setBounds(710, 552, 120, 23);
                
                JButton btnRedo = new JButton("Redo Marrage") ;
                btnRedo.setBounds(710,602,120, 23);
                
                JButton btnRegister = new JButton("Register Engineer") ;
                btnRegister.setBounds(110, 550, 150, 29);
                
                JButton btnSendMgs = new JButton("Send Message") ;
                btnSendMgs.setBounds(310, 550, 150, 23);
                
                JButton btnWater = new JButton("Check Water") ;
                btnWater.setBounds(710, 600, 150, 23);
                
                
                JButton btnCheck = new JButton("Check User") ;
                btnCheck.setBounds(710, 630, 150, 23);
                
                                
                frame.add(btnMarrage) ;
                frame.add(btnRedo) ;
                frame.add(btnUndo) ;
                frame.add(btnRegister) ;
                frame.add(btnSendMgs) ;
                frame.add(btnWater) ;
                frame.add(btnCheck) ;
                
                btnMarrage.setVisible(false);
                btnRedo.setVisible(false);
                btnUndo.setVisible(false);
                btnRegister.setVisible(false);
                btnSendMgs.setVisible(false);
                btnWater.setVisible(false);
                btnCheck.setVisible(false);
                
                
		btnIsland1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tree tree = new Tree();
				tree.setX1(200);		
                                tree.setY1(130);
				tree.setX2(500);		
                                tree.setY2(130);
				tree.setX3(500);		
                                tree.setY3(300);
				tree.setX4(200);		
                                tree.setY4(300);
				
				tree.draw(getGraphics());
                                btnIsland2.setVisible(false);
                                btnMarrage.setVisible(true);
                                //btnRedo.setVisible(true);
                                //btnUndo.setVisible(true);
                                btnRegister.setVisible(true);
                                btnSendMgs.setVisible(true);
                                btnWater.setVisible(true);
                                btnCheck.setVisible(true);

                                
			}
		});
		frame.add(btnIsland1);
                
                
		btnIsland2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tree tree = new Tree();
				tree.setX1(200);		
                                tree.setY1(130);
				tree.setX2(500);		
                                tree.setY2(130);
				tree.setX3(500);		
                                tree.setY3(300);
				tree.setX4(200);		
                                tree.setY4(300);
				
				tree.draw(getGraphics());
                                
                                btnIsland1.setVisible(false);
                                btnMarrage.setVisible(true);
                                //btnRedo.setVisible(true);
                                //btnUndo.setVisible(true);
                                btnRegister.setVisible(true);
                                btnSendMgs.setVisible(true);
                                btnWater.setVisible(true);
                                btnCheck.setVisible(true);


			}
		});
		frame.add(btnIsland2);
                
                
                
                btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                            Register rg = new Register() ;
                            rg.reg() ;
                                
			}
		});
                
                
                btnWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                            WaterChecker wt = new WaterChecker() ;
                            wt.call() ;
                                
			}
		});
                
                
                btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                            CheckUser cu = new CheckUser();
                            cu.run();
                                
			}
		});
                
                
                
                MessageMediator mediator = new MessageMediatorImpl();
                User user = new UserImpl(mediator, "rezowan", "bsse0933") ;
                
                
                btnSendMgs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                            mediator.addUser(user);
                            
                            user.send("Alert! Foni is coming !");
                                
			}
		});
		
                
                
                
                
                ArrayList<MarrageCeremony> list=new ArrayList<>();
                FactoryClass factory=new FactoryClass();
                Color color=Color.GREEN;
                btnMarrage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                            CommandMain cm = new CommandMain() ;
                            cm.run();
                                
			}
		});
                	

	}
        
        
        public static DrawingMain getDM(){
            
            if(dm==null){
                synchronized(DrawingMain.class){
                    if(dm==null){
                        dm = new DrawingMain() ;
                    }
                }
            }
             
            return dm ;
        }
	
	public static void main(String []args)  {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    frame = new JFrame("Composite Pattern");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(1050, 850);
            
            mainPane = new Pane() ;
            bp = new BorderPane() ;
            
            mainPane.setMinSize(1050,850) ;
            bp.setCenter(mainPane);
	 
	    DrawingMain panel = new DrawingMain();
	 
	    frame.getContentPane().add(panel);
	 
	    frame.setVisible(true);
	  }
}
