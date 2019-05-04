package project;

import javax.swing.JOptionPane;


public class UserImpl extends User{
    
    public UserImpl(MessageMediator med, String name, String email) {
            super(med, name, email);
        }

        @Override
        public void send(String msg){
            System.out.println(this.email+": Sending Message= "+msg);
            JOptionPane.showMessageDialog(null, this.email+": Sending Message= "+msg);
            mediator.sendMessage(msg, this);
        }
        @Override
        public void receive(String msg) {
            System.out.println(this.email+": Received Message: "+msg);
        }
}
