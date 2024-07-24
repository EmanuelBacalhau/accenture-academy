package activity5;

import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Client client1 = new Client("03112345698", "Emanuel", "Bacas");
    Client client2 = new Client("03112345698", "Carlos", "Bacas");
    CurrentAccount currentAccount1 = new CurrentAccount(123, client1, 120.00, new Date());
    CurrentAccount currentAccount2 = new CurrentAccount(456, client2, 50.00, new Date());

    currentAccount1.deposit(50);
    currentAccount1.withdrawn(50);
    currentAccount1.transfer(20, currentAccount2);

    System.out.println(client2.getNome());

  }
}
