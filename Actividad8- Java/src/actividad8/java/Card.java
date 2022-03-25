package actividad8.java;
/**
 *@author LyrisseC
 */
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Palo: " + palo + " | " + "Color: " + color +
                " | " + "Valor: " + valor;
    }
}
