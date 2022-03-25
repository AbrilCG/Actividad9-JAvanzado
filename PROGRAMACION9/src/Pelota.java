package programacion9;
/**
 *
 * @author Lyrisse Cavazos 
 */
public class Pelota {
    public String color;
    private int rapidez = 0;
    private int poder = 0;
    
    public void disminuirRapidez(int dis){
        rapidez = rapidez - dis;
        System.out.println("Disminuira:-" +dis);
        System.out.println("La rapidez de la pelota disminuyo a:" +rapidez);
    }
    public void aumentarPoder(int aumento){
        poder = poder+aumento;
         System.out.println("Aumentara:+" +aumento);
         System.out.println("El poder de la pelota aumento a:" +poder);
    }
}
