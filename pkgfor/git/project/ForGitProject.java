/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.git.project;

/**
 *
 * @author LEO
 */import java.util.Scanner;
public class ForGitProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter values");
        a= input.nextInt();
                b=input.nextInt();
        int sum =a+b;
        int multiply = a*b;
        System.out.println("multiply :"+multiply);
                System.out.println("sum:"+sum);
                System.out.println("LEO");
        // TODO code application logic here
    }
    
}
