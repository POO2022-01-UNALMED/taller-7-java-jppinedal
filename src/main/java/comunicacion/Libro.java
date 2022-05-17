package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    
    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion){
        
    	super(origen, titulo,autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public String getCo_Autor() {
        return co_autor;
    }
    public void setCo_Autor(String co_autor) {
        this.co_autor = co_autor;
    }

    
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    
    public String interpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    public int palabrasTotales(int param) {
        return this.getPaginas()*param*2;
    }

    public String toString() {
        String r = this.getOrigen() + "\n";
        r += this.getTitulo() + "\n";
        r += this.getAutor() + "\n";
        r += this.getPaginas() + "\n";
        r += this.co_autor + "\n";
        r += this.editorial + "\n";
        r += this.edicion;
        return  r;
    }
}