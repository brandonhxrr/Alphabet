package Alphabet;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.*;

public class Alphabet {
    
    static Pattern rangoAlfabeto = Pattern.compile("[A-Za-z0-9]-[A-Za-z0-9]");
    static Pattern listaAlfabeto = Pattern.compile("([A-Za-z0-9]*(, )*)+");
    
    static Pattern regexAlfabeto;
    
    static boolean valido;
    
    static String alfabetoM[] = new String[100];
    
    static HashSet<String> L2, L1 = new HashSet();
    
    
    static String alf = "", w1 = "", w2 = "";
    
    static int size;
    
    
    public static boolean validarAlfabeto(String alfabeto){
        Matcher matcherRango = rangoAlfabeto.matcher(alfabeto);
        Matcher matcherLista = listaAlfabeto.matcher(alfabeto);
                
        if(matcherRango.matches()){ //Alfabeto en forma de rango
            size = generarAlfabeto(alfabeto);
            return  size > 3;
        }else if(matcherLista.matches()){ //Alfabeto en forma de lista
            alfabetoM = alfabeto.split(", ");
            eliminarDuplicados();   
            return   size > 3;
        }else{ //Alfabeto no valido
            System.out.println("Invalido");
            return false;
        }
    }
    
    public static int generarAlfabeto(String alfabeto){
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
    
    public static boolean validarRango(byte c){
        return (c > 47 && c < 58) || (c >96 && c < 123) || (c > 64 && c < 91);
    }
    
    public static boolean validarCadena(String cadena){
        regexAlfabeto = Pattern.compile("("+alf+")*");
        Matcher matcherCadena = regexAlfabeto.matcher(cadena);
        
        return matcherCadena.matches();
        
    }
    
    public static boolean validarSubcadena(String cadena, String subcadena ){
        return cadena.contains(subcadena);
    }
    
    public static boolean validarSubcadenaPropia(String cadena, String subcadena ){
        return !validarPrefijo(subcadena, cadena) && !validarSufijo(cadena, subcadena) && cadena.contains(subcadena);
    }
    
    public static boolean validarPrefijo(String cadenaPrefijo, String cadena){
        return cadena.startsWith(cadenaPrefijo);
    }
    
    public static boolean validarSufijo(String cadena, String cadenaSufijo){
        return cadena.endsWith(cadenaSufijo);
    }
    
    public static boolean validarSufijoPropio(String cadena, String cadenaSufijo){
        return cadena.endsWith(cadenaSufijo) && !cadenaSufijo.equals(cadena) && !cadenaSufijo.isBlank(); 
    }
    
    public static boolean validarPrefijoPropio(String cadenaPrefijo, String cadena){
        return cadena.startsWith(cadenaPrefijo) && !cadenaPrefijo.equals(cadena) && !cadenaPrefijo.isBlank(); 
    }
    
    public static boolean validarSubsecuencia(String cadena1, String cadena2){
        int p = 0;
        for(int i = 0; i < cadena2.length(); i++){ 
            if(p < cadena1.length() && cadena1.charAt(p) == cadena2.charAt(i)){
                p++;
            }
        }
        return p == cadena1.length();
    }
    
    public static HashSet<String> generarLenguaje(int np, int l){ //Verificar que el HashSet tenga long > 0
        String p = "";
        HashSet<String> leng = new HashSet();
        if(np <= Math.pow(size, l)){
            while(leng.size() != np){
                p = ""; 
            for(int i = 0; i < l; i++){
                p += alfabetoM[(int) (Math.random()* size)];
            }
           leng.add(p);
           
            }
        }        
        return leng;
    }

    public static HashSet<String> unirLenguajes(HashSet<String> lenguaje1, HashSet<String> lenguaje2 ){
        HashSet<String> lenguajeUnido = new HashSet();
        //if(lenguaje1.size() > 0 && lenguaje2.size() > 0){
            for(String pal : lenguaje1){
                lenguajeUnido.add(pal);
            }
            for(String pal : lenguaje2){
                lenguajeUnido.add(pal);
            }
        //}
        
        return lenguajeUnido;
    }
    
     public static HashSet<String> concatenarLenguaje(HashSet<String> lenguaje1, HashSet<String> lenguaje2 ){
        HashSet<String> lenguajeConcatenado = new HashSet();
        
        if(lenguaje1.size() > 0 && lenguaje2.size() > 0){
            for(String pal1 : lenguaje1){
                for(String pal2 : lenguaje2){
                    lenguajeConcatenado.add(pal1 + pal2);
                }
            
            }
            return lenguajeConcatenado;
        }else if(lenguaje2.size() > 0){
            return lenguaje2;
        }else{
            return lenguaje1;
        }
        
        
        
        
     }
     
     public static boolean validarCadenaER(String cadena){
         Pattern regexJava = Pattern.compile("([a-zA-Z$_][a-zA-Z0-9_$]*)");
         Matcher matcherRegex = regexJava.matcher(cadena);
         return matcherRegex.matches();
     }
     
     public static void eliminarDuplicados(){
        HashSet<String> alfSinD = new HashSet(Arrays.asList(alfabetoM));
        size = alfSinD.size();
        alfSinD.toArray(alfabetoM);        
     }
    
    
}
