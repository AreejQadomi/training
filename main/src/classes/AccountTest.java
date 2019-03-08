package classes;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();

        System.out.println(account1.getName());

        account1.setName("areej");
        System.out.println(account1.getName());
    }
}
