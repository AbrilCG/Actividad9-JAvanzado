package calculadoraaa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Calculadoraaa {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static int opc;
    public static void main(String[] args) throws IOException{
        int op = 0;
        int opcion;
        do{
        System.out.println("Presiona 1 si quieres realizar una Suma");
        System.out.println("Presiona 2 si quieres realizar una Resta");
        System.out.println("Presiona 3 si quieres realizar una Multiplicacion");
        System.out.println("Presiona 4 si quieres realizar una Division");
        opcion = Integer.parseInt(entrada.readLine());
        switch(opcion){
            case 1: 
                System.out.println("Dame el primer numero");
                int num1 = Integer.parseInt(entrada.readLine());
                System.out.println("Dame el segundo numero");
                int num2 = Integer.parseInt(entrada.readLine());
                int suma = num1 + num2;
                System.out.println("El resultado de la suma realizada es: "+suma);
            break;
            case 2: 
                System.out.println("Dame el primer numero");
                int nume1 = Integer.parseInt(entrada.readLine());
                System.out.println("Dame el segundo numero");
                int nume2 = Integer.parseInt(entrada.readLine());
                int resta = nume1 - nume2;
                System.out.println("El resultado de la resta realizada es: "+resta);
            break;
            case 3: 
                System.out.println("Dame el primer numero");
                int numer1 = Integer.parseInt(entrada.readLine());
                System.out.println("Dame el segundo numero");
                int numer2 = Integer.parseInt(entrada.readLine());
                int multiplicacion = numer1 * numer2;
                System.out.println("El resultado de la multiplicación realizada es: "+multiplicacion);
            break;
            case 4: 
                System.out.println("Dame el primer numero");
                int numero1 = Integer.parseInt(entrada.readLine());
                System.out.println("Dame el segundo numero");
                int numero2 = Integer.parseInt(entrada.readLine());
                int division = numero1 / numero2;
                System.out.println("El resultado de la division realizada es: "+division);
            break;
        }
                System.out.println("*********************************************");
                System.out.println("Quieres volver a utilizar la calculadora?");
                System.out.println("Presiona 1 para repetir");
                    System.out.println("Presiona 2 para salir");
                    op = Integer.parseInt(entrada.readLine());  
        }while(1==op);  
        System.out.println("Fin del programa"); 
    }
    
}
