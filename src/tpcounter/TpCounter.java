/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcounter;

public class TpCounter {

    public static void main(String[] args) {
        
        Counter ctr = new Counter();
        System.out.println(ctr.toString());
        ctr.inc();
        System.out.println(ctr.toString());
        System.out.println("globalCounter 1: "+ctr.getGlobalCounter());       
        
        Counter ctr2 = new Counter(2,2);
        System.out.println(ctr2.toString());
        ctr2.inc();
        System.out.println(ctr2.toString());
        System.out.println("globalCounter 2: "+ctr2.getGlobalCounter());   
        
        for(int i=0;!ctr.equals(ctr2);i++)
        {
                    System.out.println("pas encore egal");
                    ctr.inc() ;
        }
                System.out.println("egal");

        System.out.println("globalCounter 3: "+ctr2.getGlobalCounter());   

        
    }
    
}
