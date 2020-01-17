package SistemaLivraria;

public class App {
    public static void main(String[] args) {
        Editora editora1 = new Editora(
                "Objetiva",
                "2005",
                "16.964.392/0001-49",
                "Rua das Aleatoridades",
                "23",
                "Brasil",
                "São Paulo"
        );

        Autor autor1 = new Autor(
                "Evangelina",
                "Himitian",
                "Biografias",
                Autor.sexo.feminino.toString(),
                "Argentina",
                "Paraguay",
                56

        );

        Livro novoLivro = new Livro(
                "A vida de Francisco: O papa do povo",
                256,
                Livro.genero.biografia.toString(),
                autor1,
                editora1,
                116,
                "2013"
        );


        System.out.println(novoLivro.folhear(20));


    }
}
