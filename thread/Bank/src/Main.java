import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception, ExecutionException, InterruptedException {

        Bank bank = new Bank();

        User u1 = bank.createUser("Iri");
        Account a1 = bank.createAccount(u1);
        a1.setMoneyAmount(200);

        User u2 = bank.createUser("Ter");
        Account a2 = bank.createAccount(u2);
        a2.setMoneyAmount(1000);


        System.out.println(a1);
        System.out.println(a2);

        System.out.println(bank.transferMoney(a2,a1,200));
        System.out.println(a1);
        System.out.println(a2);

        System.out.println(bank.transferMoney(a1,a2,500));

        System.out.println(bank.transferMoney(a1,a1,100));

        System.out.println(bank.transferMoney(a1,a2,-1));
    }
}
