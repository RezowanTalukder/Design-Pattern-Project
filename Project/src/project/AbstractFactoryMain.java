
package project;

import java.util.Scanner;

/**
 *
 * @author rez1
 */
public class AbstractFactoryMain {
     public void so_main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("1. Oriental\n2. Occidental\n");
        int a  = sc.nextInt() ;
        
        AbsFactory f = new AbsFactory() ;
        f.factory(a);
    }
}
