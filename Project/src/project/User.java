package project;


public abstract class User {
    
    protected MessageMediator mediator;
    protected String name,email;
 
    public User(MessageMediator med, String name, String email){
        this.mediator=med;
        this.name=name;
        this.email = email ;
    }
 
    public abstract void send(String msg);
 
    public abstract void receive(String msg);


}
