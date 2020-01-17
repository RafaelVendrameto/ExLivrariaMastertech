package SistemaLivraria;

public class Livro {
    private String titulo;
    private int totalPaginas;
    private boolean aberto = false;
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

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
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

    public Livro(String titulo, int totalPaginas, String genero, Autor autorLivro, Editora editoraLivro, int paginaAtual, String anoPublicacao) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
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

    public void abrirLivro(){
        this.aberto = true;
    }

    public void fecharLivro(){
        this.aberto = false;
    }

    public int proximaPagina(){
        if (aberto = true){
            paginaAtual+=1;
            return paginaAtual;
        }
        return paginaAtual;
    }

    public int paginaAnterior(){
        if (aberto = true){
            paginaAtual-=1;
            return paginaAtual;
        }
        return paginaAtual;
    }

     public int folhear (int contador2){
        if (aberto =true){
            contador2 = paginaAtual + contador2;
            return contador2;
        }
        return paginaAtual;
     }

    public String listarDados() {
        return "Livro {" +
                "Titulo = '" + titulo + '\'' +
                ", Total de Páginas = " + totalPaginas +
                ", Gênero = '" + genero + '\'' +
                ", Autor = " + autorLivro.listarDados() +
                ", Editora = " + editoraLivro.listarDados() +
                ", Pagina Atual = " + paginaAtual +
                ", Ano de Publicação = '" + anoPublicacao + '\'' +
                '}';
    }

}
