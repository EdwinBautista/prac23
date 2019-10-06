
package prac23;

/**
 *
 * @author 18PROGB0156
 */
public class Libro {
    private String Titulo; 
    private String Autor;
    private int existencia;
    private int prestados;

    public Libro() {
    }
    

    public Libro(String Titulo, String Autor, int existencia, int prestados) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.existencia = existencia;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    
    
}
