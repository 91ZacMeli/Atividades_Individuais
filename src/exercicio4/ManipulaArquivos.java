package exercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManipulaArquivos {
    private File file;
    private BufferedWriter bw;
    private BufferedReader br;


    public ManipulaArquivos(File file) {
        this.file = file;
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos = new FileOutputStream(this.file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            fis = new FileInputStream(this.file);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao conectar ao arquivo, deu ruim");
        }
    }

    public void escreveObjetoArquivoTexto(Pessoa pessoa) throws IOException {
        bw.append(pessoa.toString());
        bw.newLine();

    }

    public void escreve(String registro) throws IOException {
        bw.append(registro);
        bw.newLine();
    }

    public void escreve(List<String> registros) throws IOException {
        registros.forEach(registro -> {
            try {
                escreve(registro);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    public List<String> retornaRegistros() throws IOException {
        List<String> registros = new ArrayList<String>();
        while(true) {
            String linha = br.readLine();
            if(linha==null) {
                break;
            }
            registros.add(linha);
        }
        registros.forEach(System.out::println);
        return registros;
    }

    public void fechaArquivo() {
        try {
            bw.close();
        } catch (IOException e) {
            System.out.println("deu ruim");
        }

    }
}