package exercicio2;

public class ManipulaStrings {
    public String inverteString(String nome){
        nome = nome.replaceAll("\\s+", "");
        String nomeInvertido = new StringBuilder(nome.toUpperCase()).reverse().toString();
        System.out.println(nomeInvertido);
        return nomeInvertido;
    }
    public void palindromo(String palavra){
        palavra = palavra.replaceAll("\\s+", "");
        if (palavra.toUpperCase().equals(inverteString(palavra)))
            System.out.println("É um palíndromo");
        else
            System.out.println("Não é um palíndromo");
    }

}
