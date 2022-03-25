package programacion10p2;
import java.util.Scanner;
public class PROGRAMACION10P2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int arreglo[] = new int[5];
        int ultimo;
        String nombre = null;
        
        System.out.println("Llena el arreglo");
        for(int i=0;i<5;i++){
        System.out.print(i+" escribe los nombres: ");
            String a = teclado.next();   
        }
        ultimo = arreglo[4];
        for(int i=3;i>=0;i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0]=ultimo;
        System.out.println("Mostrar el nuevo arreglo");
        for(int i=0;i<5;i++){
            System.out.println(i+"Nombre: "+arreglo[i]);
        }
    }
    
}
