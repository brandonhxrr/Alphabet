/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alphabet;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Fernando
 */
public class Reg {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int $my, var, ñoño, $, ñ, ___j, sum_a$arra;
        
        Pattern rangoAlfabeto = Pattern.compile("([a-zA-Z$_][a-zA-Z0-9_$]*)");
        
        while(true){
            System.out.print("Palabra: ");
            Matcher matcherRango = rangoAlfabeto.matcher(sc.nextLine());
            if(matcherRango.matches()){
                System.out.println("Valido\n");
            }else{
                System.out.println("Invalido\n");
            }
        }
    }
    
}
