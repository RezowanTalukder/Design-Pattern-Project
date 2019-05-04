
package project;

/**
 *
 * @author USER
 */
public interface MessageMediator {
    
    public void sendMessage(String msg, User user);
 
    void addUser(User user);    
    
}
