package Alphabet;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.*;

public class AlphabetConsola {
    
    static Pattern rangoAlfabeto = Pattern.compile("[A-Za-z0-9]-[A-Za-z0-9]");
    static Pattern listaAlfabeto = Pattern.compile("([A-Za-z0-9]*(, )*)+");
    
    static Pattern regexAlfabeto;
    
    static String alfabetoM[] = new String[100];
    
    static HashSet<String> L2, L1 = new HashSet();
    
    
    static String alf = "", w1 = "", w2 = "";
    
    static int size;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
       
            System.out.print("Ingrese su alfabeto: ");
            validarAlfabeto(sc.nextLine());
       
            imprimirAlfabeto(alfabetoM);
            
            System.out.print("Ingrese la cadena 1: ");
            w1 = sc.nextLine();
            validarCadena(w1);
            
            System.out.print("Ingrese la cadena 2: ");
            w2 = sc.nextLine();
            validarCadena(w2);
            System.out.println("Cadena 1 prefijo de 2: " + validarPrefijo(w1, w2));
            System.out.println("Cadena 2 prefijo de 1: " + validarPrefijo(w2, w1));
            System.out.println("Cadena 1 sufijo de 2: " + validarSufijo(w2, w1));
            System.out.println("Cadena 2 sufijo de 1: " + validarSufijo(w1, w2));
            
            System.out.println("Cadena 1 subcadena de 2: " + validarSubcadena(w2, w1));
            System.out.println("Cadena 2 subcadena de 1: " + validarSubcadena(w1, w2));
            
            System.out.println("Cadena 1 subcadena propiade 2: " + validarSubcadenaPropia(w2, w1));
            System.out.println("Cadena 2 subcadena propia de 1: " + validarSubcadenaPropia(w1, w2));
            
            System.out.println("Cadena 1 prefijo propio de 2: " + validarPrefijoPropio(w1, w2));
            System.out.println("Cadena 2 prefijo propio de 1: " + validarPrefijoPropio(w2, w1));
            
            System.out.println("Cadena 1 sufijo propio de 2: " + validarSufijoPropio(w2, w1));
            System.out.println("Cadena 2 sufijo propio de 1: " + validarSufijoPropio(w1, w2));
            
            System.out.println("Cadena 1 subsecuencia de 2: " + validarSubsecuencia(w1, w2));
            System.out.println("Cadena 2 subsecuencia de 1: " + validarSubsecuencia(w2, w1));
            
            System.out.println("LENGUAJE 1\n");
            
            L1 = generarLenguaje(4, 2);
            imprimirLenguaje(L1);
            
            System.out.println("LENGUAJE 2\n");
            
            L2 = generarLenguaje(5, 2);
            imprimirLenguaje(L2);
            
            System.out.println("LENGUAJE UNIDO\n");
            imprimirLenguaje(unirLenguajes(L1, L2));
            
            System.out.println("LENGUAJE CONCATENADO\n");
            imprimirLenguaje(concatenarLenguaje(L1, L2));
        
    }
    
    static boolean validarAlfabeto(String alfabeto){
        Matcher matcherRango = rangoAlfabeto.matcher(alfabeto);
        Matcher matcherLista = listaAlfabeto.matcher(alfabeto);
                
        if(matcherRango.matches()){
            System.out.println("Valido Rango");
            size = generarAlfabeto(alfabeto);
            return  size > 3;
        }else if(matcherLista.matches()){
            System.out.println("Valido Lista");
            alfabetoM = alfabeto.split(", ");
            eliminarDuplicados();            
            return   size > 3;
        }else{
            System.out.println("Invalido");
            return false;
        }
    }
    
    static int generarAlfabeto(String alfabeto){
        int incremento, size = 0, indice = 0;
        byte[] bytes = alfabeto.getBytes(StandardCharsets.US_ASCII);
        byte letra;
        incremento = (alfabeto.charAt(0) < alfabeto.charAt(2)) ? 1 : -1;
        
        do{
            letra = (byte) (bytes [0] + (incremento * size));
            if(validarRango(letra)){
                alfabetoM[indice] = String.valueOf((char) letra);
                indice++;
            }
            
            size++;
        }while(letra != bytes[2]);
            
        return size;
    }
    
    static void imprimirAlfabeto(String alfabeto[]){
        int i = 0;
        while(i < alfabeto.length && alfabeto[i] != null){
            System.out.println(alfabeto[i]);
            alf += "("+alfabeto[i]+")*";
            i++;
        }
    }
    
    static boolean validarRango(byte c){
        return (c > 47 && c < 58) || (c >96 && c < 123) || (c > 64 && c < 91);
    }
    
    static boolean validarCadena(String cadena){
        System.out.println(alf);
        regexAlfabeto = Pattern.compile("("+alf+")*");
        Matcher matcherCadena = regexAlfabeto.matcher(cadena);
        
        if(matcherCadena.matches()){
            System.out.println("Cadena valida");
            return true;
        }else{
            System.out.println("Cadena invalida");
            return false;
        }
    }
    
    static boolean validarSubcadena(String cadena, String subcadena ){
        return cadena.contains(subcadena);
    }
    
    static boolean validarSubcadenaPropia(String cadena, String subcadena ){
        return !validarPrefijo(subcadena, cadena) && !validarSufijo(cadena, subcadena) && cadena.contains(subcadena);
    }
    
    static boolean validarPrefijo(String cadenaPrefijo, String cadena){
        return cadena.startsWith(cadenaPrefijo);
    }
    
    static boolean validarSufijo(String cadena, String cadenaSufijo){
        return cadena.endsWith(cadenaSufijo);
    }
    
    static boolean validarSufijoPropio(String cadena, String cadenaSufijo){
        return cadena.endsWith(cadenaSufijo) && !cadenaSufijo.equals(cadena) && !cadenaSufijo.isBlank(); 
    }
    
    static boolean validarPrefijoPropio(String cadenaPrefijo, String cadena){
        return cadena.startsWith(cadenaPrefijo) && !cadenaPrefijo.equals(cadena) && !cadenaPrefijo.isBlank(); 
    }
    
    static boolean validarSubsecuencia(String cadena1, String cadena2){
        int p = 0;
        for(int i = 0; i < cadena2.length(); i++){ 
            if(p < cadena1.length() && cadena1.charAt(p) == cadena2.charAt(i)){
                p++;
            }
        }
        return p == cadena1.length();
    }
    
    static HashSet<String> generarLenguaje(int np, int l){
        String p = "";
        HashSet<String> leng = new HashSet();
        if(np <= Math.pow(size, l)){
            while(leng.size() != np){
                p = ""; 
            for(int i = 0; i < l; i++){
                p += alfabetoM[(int) (Math.random()* size)];
            }
           System.out.println("P: "+ p+ " S: "+ " "+ leng.size() );
           leng.add(p);
           
            }
        }else{
            System.out.println("No es posible generar  "+ np+ " combinaciones de longitud "+ l + " con " + size+ " elementos en el alfabeto" );
            System.out.println(leng.size());
        }
        
        return leng;
    }

    static void imprimirLenguaje(HashSet<String> leng) {
        for(String pal : leng){
            System.out.println(pal);
        }
    }
    
    static HashSet<String> unirLenguajes(HashSet<String> lenguaje1, HashSet<String> lenguaje2 ){
        HashSet<String> lenguajeUnido = new HashSet();
        if(lenguaje1.size() > 0 && lenguaje2.size() > 0){
            for(String pal : lenguaje1){
                lenguajeUnido.add(pal);
            }
            for(String pal : lenguaje2){
                lenguajeUnido.add(pal);
            }
        }else{
            System.out.println("alguno de los lenguajes es no valido");
        }
        
        return lenguajeUnido;
    }
    
     static HashSet<String> concatenarLenguaje(HashSet<String> lenguaje1, HashSet<String> lenguaje2 ){
        HashSet<String> lenguajeConcatenado = new HashSet();
        String p = "";
        for(String pal1 : lenguaje1){
            p = "";
            for(String pal2 : lenguaje2){
                //p = pal1 + pal2;
                lenguajeConcatenado.add(pal1 + pal2);
            }
            
        }
        
        return lenguajeConcatenado;
     }
     
     static boolean validarCadenaER(String cadena){
         Pattern regexJava = Pattern.compile("([a-zA-Z$_][a-zA-Z0-9_$]*)");
         Matcher matcherRegex = regexJava.matcher(cadena);
         return matcherRegex.matches();
     }
     
     static void eliminarDuplicados(){
        HashSet<String> alfSinD = new HashSet(Arrays.asList(alfabetoM));
        size = alfSinD.size();
        alfSinD.toArray(alfabetoM);
        System.out.println("SIZE: "+ String.valueOf(size) + " ARAY: "+Arrays.toString(alfabetoM));
        
     }
    
    
}
