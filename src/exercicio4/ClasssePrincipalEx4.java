package exercicio4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClasssePrincipalEx4 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        ManipulaArquivos arquivoManipulavel = new ManipulaArquivos(new File("arquivo.txt"));

        Pessoa isac = new Pessoa("Isac","30 anos");
        Pessoa carla = new Pessoa("Carla","32 anos");
        Pessoa joana= new Pessoa("Joana","27 anos");
        Pessoa luiz = new Pessoa("Luiz","37 anos");
        Pessoa paloma= new Pessoa("Paloma","27 anos");
        pessoas.add(isac);
        pessoas.add(carla);
        pessoas.add(joana);
        pessoas.add(luiz);
        pessoas.add(paloma);

        pessoas.forEach( p -> {
            try {
                arquivoManipulavel.escreveObjetoArquivoTexto(p);

            } catch (IOException e) {
                e.printStackTrace();
            }
            });

        arquivoManipulavel.fechaArquivo();

        try {
            arquivoManipulavel.retornaRegistros();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
