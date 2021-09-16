package exercicio1;

public class ClassePrincipal {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        System.out.println("\n______________________________ Adicionando 10 pessoas ___________________________\n");
        agenda.armazenarPessoa(new Pessoa("Isac","Rua Das Palmeiras, 98","9999889888", 30,1.74));
        agenda.armazenarPessoa(new Pessoa("Pedro","Rua Das Palmas, 981","9999889881", 51,1.65));
        agenda.armazenarPessoa(new Pessoa("Felipe","Rua Dos Palmitos, 234","9999889383", 62,1.67));
        agenda.armazenarPessoa(new Pessoa("Thiago","Rua Das Alfazema, 398","999988984", 53,1.74));
        agenda.armazenarPessoa(new Pessoa("Carlos","Rua Das Tulipas, 598","99998898885", 24,1.87));
        agenda.armazenarPessoa(new Pessoa("Jose","Rua Das Cachoeiras, 698","9999889873", 35,1.67));
        agenda.armazenarPessoa(new Pessoa("Daiana","Rua Das Flores, 988","99998898834", 46,1.74));
        agenda.armazenarPessoa(new Pessoa("Daniela","Rua Das Cactos, 918","9999889457", 37,1.72));
        agenda.armazenarPessoa(new Pessoa("Luiza","Rua Das Industrias, 981","99998898971", 38,1.75));
        agenda.armazenarPessoa(new Pessoa("Maria","Rua Dos Corretores, 198","99998893411", 29,1.86));


        System.out.println("\n______________________________ Exibindo toda a agenda ___________________________\n");

        agenda.exibirTodaAgenda();

        agenda.removerPessoa("Isac");

        System.out.println("\n______________________________ Exibindo toda a agenda Depois de Deletar uma pessoa ___________________________\n");

        agenda.exibirTodaAgenda();

        System.out.println("\n______________________________ Buscando uma pessoa na agenda pelo nome e retornando sua posição na agenda___________________________\n");

        agenda.buscarPessoa("Maria");


        System.out.println("\n______________________________ Buscando uma pessoa na agenda pelo Index ___________________________\n");

        agenda.exibirPessoa(1);

        System.out.println("\n______________________________ Listando Pessoas em Ordem Alfabetica de nome ___________________________\n");

        agenda.listarPessoasEmOrdemAlfabetica();


        System.out.println("\n______________________________ Listando Pessoas em Ordem Alfabetica de endereço ___________________________\n");

        agenda.listarPessoasEmOrdemAlfabeticaEndereco();

        System.out.println("\n______________________________ Listando Pessoas Por Idade ___________________________\n");

        agenda.listarPessoasPorIdade();

    }
}
