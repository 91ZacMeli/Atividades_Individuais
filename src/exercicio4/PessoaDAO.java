package exercicio4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private File file;
    private ManipulaArquivos manipulaArquivos;

    public PessoaDAO(String arquivo) {
        file = new File(arquivo);
        manipulaArquivos = new ManipulaArquivos(file);
    }
    public void salva(Pessoa pessoa) {
        String registro = pessoa.toString();
        try {
            manipulaArquivos.escreve(registro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void salva(List<Pessoa> pessoas) {
        pessoas.forEach(pessoa -> salva(pessoa));
        manipulaArquivos.fechaArquivo();
    }
    public Pessoa obter(String id) {
        return null;
    }

    public List<Pessoa> listagem() {
        List<Pessoa> pessoasExistentes = new ArrayList<>();
        try {
            List<String> registros = manipulaArquivos.retornaRegistros();
            registros.forEach(registro -> {
                Pessoa pessoaConvertida = converte(registro);
                pessoasExistentes.add(pessoaConvertida);
            });
            return pessoasExistentes;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private Pessoa converte(String registro) {
        String[] campos = registro.replaceAll("\"","").split(",");
        Pessoa pessoa = new Pessoa(campos[0], campos[1]);
        return pessoa;

    }

}
