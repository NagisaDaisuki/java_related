
class Account {
  // 私有属性，外部不能直接访问
  private String accountNumber;
  private String ownerName;
  private double balance;

  // 构造方法
  public Account(String accountNumber, String ownerName, double balance) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = balance > 0 ? balance : 0;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

}

public class TestAccount {
  public static void main(String[] args) {
    Account account = new Account("123456", "张三", 1000);
    account.setAccountNumber("11001");
    System.out.println(account.getAccountNumber());
  }
}
