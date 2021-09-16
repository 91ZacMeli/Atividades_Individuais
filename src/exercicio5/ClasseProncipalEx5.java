package exercicio5;

import java.util.Scanner;

public class ClasseProncipalEx5 {
    public static void main(String[] args) {

        String nome, cpf, endereco,email, telefone;
        Scanner entraDados = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Vamos cadastrar um novo Cliente? Insira os dados dele abaixo: ");
        System.out.println("Entre com o nome do Cliente ");
        nome = entraDados.nextLine();
        System.out.println("Entre com o CPF do Cliente ");
        cpf = entraDados.nextLine();
        System.out.println("Entre com o endereço do Cliente ");
        endereco = entraDados.nextLine();
        System.out.println("Entre com o e-mail do Cliente ");
        email = entraDados.nextLine();
        System.out.println("Entre com o nome telefone do Cliente ");
        telefone = entraDados.nextLine();

        if(cliente.validaNome(nome) && cliente.cpfValido(cpf) && cliente.emailValido(email)&& cliente.telefoneValido(telefone)){
            Cliente cliente1 = new Cliente(nome,cpf,endereco,email,telefone);
            System.out.println(cliente1.toString());
        }else {
            System.out.println("Cliente não pode ser Cadastrado. Dados inválidos!");
        }


    }
}
