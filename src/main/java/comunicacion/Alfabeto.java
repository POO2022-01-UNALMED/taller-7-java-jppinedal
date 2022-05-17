package comunicacion;

public class Alfabeto extends Pictograma {

    private String[] letras;
    private String interpretacion;

    
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }
    
    public String toString(){
        String resultado = "";
        for (int i = 0; i < letras.length; i++) {
            if (i == 0) {
                resultado += letras[i];
            }
            else {
                resultado += ", " + letras[i];
            }
        }
        return resultado;
    }
}