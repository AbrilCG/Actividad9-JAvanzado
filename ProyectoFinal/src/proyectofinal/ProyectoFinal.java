package proyectofinal;
import java.util.Random;
/**
 *@author LyrisseCavazos
 */
public class ProyectoFinal {
    public static void main(String[] args) {
        System.out.println("******************");
        System.out.println("Ready...go");
        Random hadasCapturadas = new Random();
        int H = hadasCapturadas.nextInt(30);
        System.out.println("El numero de Hadas capturadas es de: "+H);
        if(H>=10&&H<=20){
        int vidasMago = 1;
        System.out.println("El mago tiene 1 vida");
        }else
            if(H>=20){
            int vidasMago=2;
            System.out.println("El mago tiene 2 vidas");
            }else
                if(H==30){
                int vidasMago=3;
                System.out.println("El mago tiene 3 vidas");
                }else 
                 System.out.println("No hay vidas");
    }    
}
  
