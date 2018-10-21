/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan48_kalkulator;

/**
 *
 * @author Acer
 */
public class PBO0210117043_latihan48_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kalkulator klt = new kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("VALUE1: " +klt.getValue1());
        System.out.println("VALUE2: " +klt.getValue2());
        klt.setNameproject();
        klt.setNoteproject(null);
        System.out.println("Result add is = " + klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiplication is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}
