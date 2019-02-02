public class Account implements Comparable<Account> {
    private int id;
    private User user;
    private int moneyAmount;

    public Account(int id, User user) {
        this.id = id;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userId=" + user.getId() + ", userMail=" + user.getEmail() +
                ", moneyAmount=" + moneyAmount +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUserMail() {
        return user.getEmail();
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    @Override
    public int compareTo(Account o) {
        return this.id - o.id;
    }
}