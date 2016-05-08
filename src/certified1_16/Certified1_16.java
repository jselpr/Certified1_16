/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certified1_16;

/**
 *
 * @author joselopezruiz
 */
public class Certified1_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Object i = new Long(0);
            int total = 100/(Integer)i;
            System.out.println(total);
        } catch (ClassCastException | IllegalArgumentException e){
            System.out.println("Exception 1");
        } catch(ArithmeticException e){
            System.out.println("Exception 2");
        }
    }
    
}
