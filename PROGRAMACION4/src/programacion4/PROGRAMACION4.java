package programacion4;

/**
 * @author Lyrisse Cavazos
 */
public class PROGRAMACION4 {
    public static void main(String[] args) {
    String trimestre = "Ene-Feb-Mar Abr-May-Jun Jul-Ago-Sep Oct-Nov-Dic";
    String sabor1 = "Chocolate 111 483 471 427";
    String sabor2 = "Vainilla 192 500 355 158";
    String sabor3 = "Fresa 289 470 474 160";
    String sabor4 = "Oreo 415 114 161 308";
        String[][] datos = {trimestre.split(" "),sabor1.split(" "),sabor2.split(" "),sabor3.split(" "),sabor4.split(" ")};
        for(int a=0; a<datos.length;a++){
            if(a==0){
                System.out.println("\b\b");
            }
            for(int c=0; c<datos[a].length; c++){
                if(a==0){
                    System.out.println(datos[a][c]+"\b");
                }else{
                    System.out.println(datos[a][c]);
                    if(c==0){
                        if(a<3){
                            System.out.println("\b");
                        }else{
                            System.out.println("\b\b");
                        }
                    }else{
                        System.out.println("\b\b");
                    }
                }
            }
        System.out.println();
        }
       int[]sTrimestre={0,0,0,0};
       for(int a=1;a<datos.length;a++){
           int d=1;
           int e=Integer.parseInt(datos[a][d]);
           for(int c=1;c<datos.length;c++){
               if(e<=Integer.parseInt(datos[a][c])){
                   d=c;
                   e=Integer.parseInt(datos[a][d]);
               }
               if(a>1){
                   sTrimestre[c-1]+=Integer.parseInt(datos[a][c]);
               }
           }
       System.out.println("El trimestre en que se vendio mas " + datos[a][0] + " es: " +datos[0][d] + "(" +datos[a][d]+ ")");
       }
       int mTrimestre=0;
       int d=0;
       for(int a=0; a<sTrimestre.length;a++){
           if(mTrimestre<=sTrimestre[a]){
               mTrimestre=sTrimestre[a];
               d=a;
           }
       }
       System.out.println("El trimestre en el que mas se vendio(sin importar el sabor):" +datos[0][d]+ "(" +sTrimestre[d]+ ")");
    }
}
