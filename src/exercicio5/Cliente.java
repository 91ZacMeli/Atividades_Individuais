package exercicio5;

public class Cliente {
    private int id = 0;
    private String nome, cpf, endereco, email, telefone;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        this.setId(id+1);
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    public boolean validaNome(String nome){
        if(nome.length() >=3 && nome.length() <=50){
            return true;
        }else {
            return false;
        }
    }
    public boolean cpfValido(String cpf){
        if(cpf.length() == 11){
            return true;
        }else {
            return false;
        }
    }
    public boolean emailValido(String email){
        if(email.contains("@")){
            return true;
        }else {
            return false;
        }
    }
    public boolean telefoneValido(String telefone){
        if(telefone.length() == 11){
            return true;
        }else {
            return false;
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
