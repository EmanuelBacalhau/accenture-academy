package activity5;

public class Client {
  private String cpf;
  private String nome;
  private String sobrenome;

  public Client(String cpf, String nome, String sobrenome) {
    this.nome = nome;
    this.cpf = cpf;
    this.sobrenome = sobrenome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
}
