package comunicacion;

public class Fabula extends Escrito{

    private String ensenanza;
    private String interpretacion;

    
    public Fabula (String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }
    
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacio(String interpretacio) {
        this.interpretacion = interpretacio;
    }

    public int palabrasTotales(int parametro) {
        return this.getPaginas() * parametro;
    }

    public String toString() {
        String r = this.getOrigen() + "\n";
        r += this.getTitulo() + "\n";
        r += this.getAutor() + "\n";
        r += this.getPaginas() + "\n";
        r += this.ensenanza;
        return  r;
    }
}