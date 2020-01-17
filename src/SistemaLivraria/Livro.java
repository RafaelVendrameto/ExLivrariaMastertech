package SistemaLivraria;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private boolean aberto;
    private String genero;
    private Autor autorLivro;
    private Editora editoraLivro;
    private int paginaAtual;
    private String anoPublicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }

    public Editora getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(Editora editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, int totalPaginas, boolean aberto, String genero, Autor autorLivro, Editora editoraLivro, int paginaAtual, String anoPublicacao) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.aberto = aberto;
        this.genero = genero;
        this.autorLivro = autorLivro;
        this.editoraLivro = editoraLivro;
        this.paginaAtual = paginaAtual;
        this.anoPublicacao = anoPublicacao;
    }

    public enum genero{
        comedia,
        drama,
        romance,
        biografia
    }

    public boolean abrirAberto(){
        if (aberto == true){
            return true;
        }
        return false;
    }

    public boolean fecharLivro(){
        if (aberto == false){
            return true;
        }
        return false;
    }
}
