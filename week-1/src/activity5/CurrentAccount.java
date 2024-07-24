package activity5;

import java.util.Date;

public class CurrentAccount {

  private int numero;
  private Client client;
  private double saldo;
  private Date data;

  public CurrentAccount(int numero, Client client, double saldo, Date data) {
    this.numero = numero;
    this.saldo = saldo;
    this.data = data;
    this.client = client;
  }

  public void deposit(double value) {
    System.out.println("Deposit:");
    this.saldo += value;
    System.out.println(this);
  }

  public void withdrawn(double value) {
    System.out.println("Withdraw:");
    this.saldo -= value;
    System.out.println(this);
  }

  public void transfer(double value, CurrentAccount account) {

    if ((saldo - value) == 0.0) {
      System.out.println("Saldo inválido!");
    } else {
      System.out.println("Transfer:");
      this.saldo -= value;
      account.setSaldo(account.getSaldo() + value);
      System.out.println(this);
    }
  }

  public Date getData() {
    return data;
  }

  public int getNumero() {
    return numero;
  }

  public Client getClient() {
    return client;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  private void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Numero: " + this.getSaldo() + "\nNome: " + this.client.getNome() + "\nSaldo: " + this.getSaldo()
        + "\n-------------------";
  }
}