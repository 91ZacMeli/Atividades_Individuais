package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassePrincipalEx5 {

    public static void main(String[] args) {
        String nome, cpf, endereco,email, telefone;
        boolean continuarCadastrando = true;
        char resposta = 'S';
        Scanner entraDados = new Scanner(System.in);
        Cliente cliente = new Cliente();
        List<Cliente> clientes = new ArrayList<>();


        while (continuarCadastrando) {
            System.out.println("\nVamos cadastrar um novo Cliente? Insira os dados dele abaixo: ");
            System.out.println("\nEntre com o nome do Cliente ");
            nome = entraDados.nextLine();
            System.out.println("Entre com o CPF do Cliente ");
            cpf = entraDados.nextLine();
            System.out.println("Entre com o endereço do Cliente ");
            endereco = entraDados.nextLine();
            System.out.println("Entre com o e-mail do Cliente ");
            email = entraDados.nextLine();
            System.out.println("Entre com o número de telefone do Cliente ");
            telefone = entraDados.nextLine();

            if (cliente.validaNome(nome) && cliente.cpfValido(cpf) && cliente.emailValido(email) && cliente.telefoneValido(telefone)) {
                clientes.add(new Cliente(nome, cpf, endereco, email, telefone));
            } else {
                System.out.println("\nCliente não pode ser Cadastrado. Dados inválidos!\n");
            }
            System.out.println("Continuar Cadastrando? Sim/Não");
            resposta = entraDados.nextLine().toUpperCase().charAt(0);
            if (resposta == 'N') {
                continuarCadastrando = false;
            }
        }
        clientes.forEach(System.out::println);
    }
}
