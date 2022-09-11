public class BankAccount {
    private Double amount;

    public BankAccount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;


    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("Общяя сумма на счету: " + amount);

    }

    public void withDraw(Double sum) throws Exception {
        if (amount < sum) {
            throw new LimitException("ошибка", amount);
        } else {
            amount = amount - sum;
            System.out.println("Сумма снятия:" + sum);

            System.out.println("остаток: " + amount);
        }

    }


}


