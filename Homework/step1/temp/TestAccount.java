import java.util.Scanner;

class Account {
  static int sId;
  int id;
  int balance;

  public Account() {
    this(0);
  }

  public Account(int balance) {
    this.balance = balance;
    this.id = sId;
    sId++;
  }

  public void deposit(int in) {
    balance += in;
  }

  public void draw(int out) {
    if (balance - out < 0) {
      System.out.println(id + ":error!");
    } else {
      balance -= out;
    }
  }

  public void show() {
    System.out.println("balance of " + id + " is:" + balance);
  }

}

class TestAccount {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Account.sId = in.nextInt();
    Account c1 = new Account(in.nextInt());
    c1.deposit(in.nextInt());
    Account c2 = new Account(in.nextInt());
    c2.draw(in.nextInt());
    c1.show();
    c2.show();

    in.close();
  }
}
