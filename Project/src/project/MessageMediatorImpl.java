package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MessageMediatorImpl implements MessageMediator{
    private ArrayList<User> users;
 
    public MessageMediatorImpl(){
        this.users=new ArrayList<>();
    }
 
    public void addUser(User user){
        this.users.add(user);
        JOptionPane.showMessageDialog(null,"Email "+user.email+" registered");
    }
 
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            if(u != user){
                u.receive(msg);
            }
            
            System.out.println(u.email);
        }
    }
}
