package exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    List <Pessoa> pessoas = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void removerPessoa(String nome){
        for (int i = 0; i< pessoas.size(); i++ ){
            if (pessoas.get(i).getNome().equals(nome)){
                pessoas.remove(pessoas.get(i));
            }
        }
    }
    public int buscarPessoa(String nome){
        int indice = 0;
        for ( int i=0; i< pessoas.size(); i++ ){
            if (pessoas.get(i).getNome().equals(nome)){
                System.out.println("Essa pessoa se encontra na posição "+ (i+1) + " Da Agenda");
               indice = i;
            }
        }
        return indice;
    }
    public void exibirTodaAgenda(){
        pessoas.forEach(System.out::println);
    }
    public void exibirPessoa(int index){
        System.out.println(pessoas.get(index).toString());
    }
    public void listarPessoasEmOrdemAlfabetica() {
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        });
        pessoas.forEach(System.out::println);
    }
    public void listarPessoasEmOrdemAlfabeticaEndereco() {
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getEndereco().compareTo(p2.getEndereco());
            }
        });
        pessoas.forEach(System.out::println);
    }
    public void listarPessoasPorIdade() {
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p2.getIdade().compareTo(p1.getIdade());
            }
        });
        pessoas.forEach(System.out::println);
    }
}