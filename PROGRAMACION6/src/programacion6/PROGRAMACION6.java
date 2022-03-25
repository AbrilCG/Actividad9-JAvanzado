package programacion6;
import java.io.*;
import java.util.Scanner;
/**
 * @author Lyrisse Cavazos 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROGRAMACION6 {    
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private static char letra;
    public static void main(String[] args)throws IOException {
       int op = 0;
       char opc;
       do{
       System.out.println("Preciona 1 si quieres el modo basico");
       System.out.println("Preciona 2 si quieres el modo intermedio");
       System.out.println("Preciona 3 si quieres el modo dificil");
       op = Integer.parseInt(entrada.readLine());
       switch (op) {
           case 1: 
               Scanner sc = new Scanner(System.in);
               char[] palabra1 = {'A','Z','U','L'};
               char[] respuesta1 = {'X','X','X','X'};
               char letra;
               System.out.println("Todas las letras seran en mayusculas");
           int veces;
           for(veces=0;veces<15;veces++){ 
               if((palabra1[0]==respuesta1[0])&&(palabra1[1]==respuesta1[1])&&(palabra1[2]==respuesta1[2])&&(palabra1[3]==respuesta1[3])){
                  System.out.println("**************");
                  System.out.println("WINNER");
                  System.out.println("La palabra es AZUL");
                  break;
               }
               try {
                   boolean num = false;
                System.out.println(num);
            }catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("t  eclea una letra");
            }
            catch (Throwable exc){
            System.out.println("No es una letra");
            }
               System.out.println("Teclea una letra");
               letra = entrada.readLine().charAt(0);
                if(letra==palabra1[0]){
                System.out.println("**************");
                System.out.println("AXXX");
                respuesta1[0]='A';
                }else{
                   if(letra==palabra1[1]){
                       System.out.println("**************");
                       System.out.println("XZXX");
                       respuesta1[1]='Z';
                   }else{
                        if(letra==palabra1[2]){
                           System.out.println("**************");
                           System.out.println("XXUX");
                           respuesta1[2]='U';
                        }else{
                            if(letra==palabra1[3]){
                                System.out.println("**************");
                                System.out.println("XXXL");
                                respuesta1[3]='L';
                            }else{
                               System.out.println("**************");
                               System.out.println("INTENTA DE NUEVO");
                            }
                                
                        }
                   }
                }
            }
           break;
           case 2: 
               char[] palabra2 = {'M','O','L','E','S','T','A','R'};
               char[] respuesta2 = {'X','X','X','X','X','X','X','X'};
               char letr;
               System.out.println("ACTIVA LAS LETRAS EN MAYUSCULAS");
           int vece;
           for(vece=0;vece<15;vece++){ 
               if((palabra2[0]==respuesta2[0])&&(palabra2[1]==respuesta2[1])&&(palabra2[2]==respuesta2[2])&&(palabra2[3]==respuesta2[3])&&(respuesta2[4]==palabra2[4])&&(palabra2[5]==respuesta2[5])&&(palabra2[6]==respuesta2[6])&&(palabra2[7]==respuesta2[7])){                                                                
                  System.out.println("**************");
                  System.out.println("WINNER");
                  System.out.println("La palabra es MOLESTAR");
                  break;
               }
               System.out.println("Teclea una letra");
               letr = entrada.readLine().charAt(0);
               if(letr==palabra2[0]){
                System.out.println("**************");
                System.out.println("XXXXXXXX");
                respuesta2[0]='M';
               }else{
                   if(letr==palabra2[1]){
                       System.out.println("**************");
                       System.out.println("XXXXXXXX");
                       respuesta2[1]='O';
                   }else{
                        if(letr==palabra2[2]){
                           System.out.println("**************");
                           System.out.println("XXXXXXXX");
                           respuesta2[2]='L';
                        }else{
                            if(letr==palabra2[3]){
                                System.out.println("**************");
                                System.out.println("XXXXXXXX");
                                respuesta2[3]='E';
                            }else{
                                if(letr==palabra2[4]){
                                    System.out.println("**************");
                                    System.out.println("XXXXXXXX");
                                    respuesta2[4]='S';
                                }else{
                                    if(letr==palabra2[5]){
                                        System.out.println("**************");
                                        System.out.println("XXXXXXXX");
                                        respuesta2[5]='T';
                                    }else{
                                        if(letr==palabra2[6]){
                                           System.out.println("**************");
                                           System.out.println("XXXXXXXX");
                                           respuesta2[6]='A';
                                        }else{
                                            if(letr==palabra2[7]){
                                                System.out.println("**************");
                                                System.out.println("XXXXXXXX");
                                                respuesta2[7]='R';
                                            }
                                            else{
                                                System.out.println("**************");
                                                System.out.println("Vuelve a intentarlo");
                                            }
                                        }
                                    }
                                }
                              
                            }
                                
                        }
                   }
                }
            }
           break;
           case 3:
               char[] palabra3 = {'E','S','T','U','P','E','F','A','C','T','O'};
               char[] respuesta3 = {'X','X','X','X','X','X','X','X','X','X'};
               char let;
               System.out.println("ACTIVA LAS LETRAS EN MAYUSCULAS");
           int vec;
           for(vec=0;vec<15;vec++){ 
               if((palabra3[0]==respuesta3[0])&&(palabra3[1]==respuesta3[1])&&(palabra3[2]==respuesta3[2])&&(palabra3[3]==respuesta3[3])&&(respuesta3[4]==palabra3[4])&&(palabra3[5]==respuesta3[5])&&(palabra3[6]==respuesta3[6])&&(palabra3[7]==respuesta3[7])&&(palabra3[8]==respuesta3[8])&&(palabra3[9]==respuesta3[9])&&(palabra3[10]==respuesta3[10])){                                                                
                  System.out.println("**************");
                  System.out.println("WINNER");
                  System.out.println("La palabra es ESTUPEFACTO");
                  break;
                }
                System.out.println("Teclea una letra");
                let = entrada.readLine().charAt(0);
                if(let==palabra3[0]){
                System.out.println("**************");
                System.out.println("XXXXXXXX");
                respuesta3[0]='E';
                }else{
                   if(let==palabra3[1]){
                       System.out.println("**************");
                       System.out.println("XXXXXXXX");
                       respuesta3[1]='S';
                    }else{
                        if(let==palabra3[2]){
                           System.out.println("**************");
                           System.out.println("XXXXXXXX");
                           respuesta3[2]='T';
                        }else{
                            if(let==palabra3[3]){
                                System.out.println("**************");
                                System.out.println("XXXXXXXX");
                                respuesta3[3]='U';
                            }else{
                                if(let==palabra3[4]){
                                    System.out.println("**************");
                                    System.out.println("XXXXXXXX");
                                    respuesta3[4]='P';
                                }else{
                                    if(let==palabra3[5]){
                                        System.out.println("**************");
                                        System.out.println("XXXXXXXX");
                                        respuesta3[5]='E';
                                    }else{
                                        if(let==palabra3[6]){
                                           System.out.println("**************");
                                           System.out.println("XXXXXXXX");
                                           respuesta3[6]='F';
                                        }else{
                                            if(let==palabra3[7]){
                                                System.out.println("**************");
                                                System.out.println("XXXXXXXX");
                                                respuesta3[7]='A';
                                            }else{
                                                if(let==palabra3[8]){
                                                    System.out.println("**************");
                                                    System.out.println("XXXXXXXXXXX");
                                                    respuesta3[8]='C';
                                                }else{
                                                    if(let==palabra3[9]){
                                                        System.out.println("**************");
                                                        System.out.println("XXXXXXXXXXX");
                                                        respuesta3[9]='T';
                                                    }else{
                                                        if(let==palabra3[10]){
                                                            System.out.println("**************");
                                                            System.out.println("XXXXXXXXXXX");
                                                            respuesta3[10]='O';
                                                        }else{
                                                            System.out.println("**************");
                                                            System.out.println("Vuelve a intentarlo");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
           }
           break;
        }
       System.out.println("Quiere repetir el juego?? S/N");
       opc= entrada.readLine().charAt(0);
       }while (opc == 'S');
    }
}   