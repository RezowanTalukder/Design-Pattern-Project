/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rez1
 */
public class ProxyUser implements Proxy{
    private Proxy internet = new RealUser(); 
    private static List<String> bannedUser; 
      
    static
    { 
        bannedUser = new ArrayList<String>(); 
        bannedUser.add("abc"); 
        bannedUser.add("def"); 
        bannedUser.add("ghi"); 
        bannedUser.add("jkl"); 
    } 
    
    public void connectTo(String serverhost) throws Exception 
    { 
        if(bannedUser.contains(serverhost.toLowerCase())) 
        { 
            throw new Exception("Access Denied"); 
        } 
          
        internet.connectTo(serverhost); 
    } 
}
