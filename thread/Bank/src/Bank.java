import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Bank {
    ConcurrentSkipListSet<Account> accounts = new ConcurrentSkipListSet<>();
    ConcurrentSkipListSet<User> users = new ConcurrentSkipListSet<>();

    public User createUser(String email) throws Exception {
        if(users.stream().noneMatch(user -> user.getEmail().equals(email))){
            User user = new User(users.isEmpty()? 0:users.last().getId()+1,email);
            users.add(user);
            return user;
        }
        else
            throw new Exception("Email уже используется");
    }

    public Account createAccount(User user){
        Account account = new Account(accounts.isEmpty()?0:accounts.last().getId()+1, user);
        accounts.add(account);
        return account;
    }

    public String transferMoney(Account source, Account destination, int amount) throws ExecutionException, InterruptedException {
        System.out.println(amount + " " + source.getUserMail() + " -> " + destination.getUserMail());
        if(amount<=0){ return "Операция не выполнена. Неверная сумма";}
        if(source.equals(destination)) {return "Операция не выполнена. Перевод между одним аккаунтом";}
        if(source.getMoneyAmount()<amount) {return "Операция не выполнена. Недостаточно средств.";}

        FutureTask<String> task = new FutureTask<>(new Transaction(source,destination,amount));
        new Thread(task).start();

        return task.get();
    }
}
