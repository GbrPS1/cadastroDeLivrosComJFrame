//By Ledón

package pckfiladinamica;

public class Livro {
    private String titulo, autor;
    private int anopublic;
    private String editora;

    public Livro(String titulo, String autor, int anopublic, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublic = anopublic;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", anopublic=" + anopublic + ", editora=" + editora + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnopublic() {
        return anopublic;
    }

    public void setAnopublic(int anopublic) {
        this.anopublic = anopublic;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
}
