
package programacion3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author lyrisse Cavazos
 */
public class PROGRAMACION3 {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int opcion = 0;
        int num, exp, dig, aux, op;
        double binario, octal, hexadecimal,decimal, decimaal, deciimal;
        do{
            System.out.println("**Programa de conversiones**");
            System.out.println("1. Convertir de decimal a binario");
            System.out.println("2. Convertir de decimal a octal");
            System.out.println("3. Convertir de decimal a hexadecimal");
            System.out.println("4. Convertir de binario a decimal");
            System.out.println("5. convertir de octal a decimal");
            System.out.println("6. Convertir de hexadeciaml a decimal");
            System.out.println("Que tipo de conversion quieres??");
            opcion = Integer.parseInt(entrada.readLine());
        
            switch(opcion){
                case 1:
                    System.out.println("Introduce un numero entero mayor a 0");
                    num = Integer.parseInt(entrada.readLine());
                    exp=0;
                    binario=0;
                    while(num!=0){
                        dig = num % 2;
                        binario = binario + dig * Math.pow(10,exp);
                        exp++;
                        num = num/2;
                    }
                    System.out.println("El numero " + num + "en base binario es igual a " +binario);
                break;
                case 2:
                    System.out.println("Introduce un numero entero mayor a 0");
                    num = Integer.parseInt(entrada.readLine());
                    exp=0;
                    octal=0;
                    while(num!=0){
                        dig = num % 8;
                        octal = octal + dig * Math.pow(10,exp);
                        exp++;
                        num = num/8;
                    }
                    System.out.println("El numero " + num + "en base binario es igual a " +octal);
                break;
                case 3: 
                    System.out.println("Introduce un numero entero mayor a 0");
                    num = Integer.parseInt(entrada.readLine());
                    exp=0;
                    hexadecimal=0;
                    while(num!=0){
                        dig = num % 16;
                        hexadecimal = hexadecimal + dig * Math.pow(10,exp);
                        exp++;
                        num = num/16;
                    }
                    System.out.println("El numero " + num + "en base binario es igual a " +hexadecimal);
                break;
                case 4:
                    System.out.println("Introduce una serie de numeros bianrios");
                    num = Integer.parseInt(entrada.readLine());
                    exp=0;
                    decimal=0;
                    while (num!=0){
                        dig = num % 10;
                        decimal = decimal + dig * (int)Math.pow(2,exp);
                        exp++;
                        num = num/10;
                    }
                    System.out.println("La serie de numeros binarios" + num + "a numero decimal es igual a " +decimal);
                break;
                case 5:
                    System.out.println("Introduce un numero en base octal");
                    num = Integer.parseInt(entrada.readLine());
                    exp=0;
                    decimal=0;
                    while (num!=0){
                        dig = num % 10;
                        decimal = decimal + dig * (int)Math.pow(8,exp);
                        exp++;
                        num = num/10;
                    }
                    System.out.println("El numero con base octal " + num + "a numero decimal es igual a " +decimal);
                break;
                case 6:
                    System.out.println("Introduce un numero en base octal");
                    num = Integer.parseInt(entrada.readLine());
                    exp=0;
                    decimal=0;
                    while (num!=0){
                        dig = num % 10;
                        decimal = decimal + dig * (int)Math.pow(16,exp);
                        exp++;
                        num = num/10;
                    }
                    System.out.println("El numero con base octal " + num + "a numero decimal es igual a " +decimal);
                break;
            }   
                    System.out.println("Otra conversion??)");
                    System.out.println("Presiona 1 para repetir");
                    System.out.println("Presiona 2 para salir)");
                    op = Integer.parseInt(entrada.readLine());  
        }while(1==op);  
        System.out.println("Fin del programa");
    }
}
