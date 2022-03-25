package programacion10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PROGRAMACION10 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException{
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese el nombre: ");
        cadena=teclado.next();
        cambia_car(cadena);
    }
    public static String cambia_car(String cadena){
        Scanner teclado = new Scanner(System.in);
        String cambio;
        System.out.println("Modifica el nombre");
        cambio=teclado.next();
        System.out.println("modificó el nombre "+cadena+" a: "+cambio);
    return cambio; 
    }
}

        
       
 
