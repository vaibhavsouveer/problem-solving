package core.multithreading;

public class RaceConditionDemo {
    int balance = 10;
    public static void main(String[] args) {
        RaceConditionDemo ob =  new RaceConditionDemo();
        Thread lucy = new Thread(() -> {
            for(int i = 1; i <= 10; i++) {
                ob.sleep(1000);
                ob.withdraw(Thread.currentThread().getName());
                ob.sleep(1000);
            }
        }, "Lucy");
        Thread fred = new Thread(() -> {
            for(int i = 1; i <= 10; i++) {
                ob.sleep(1000);
                ob.withdraw(Thread.currentThread().getName());
                ob.sleep(1000);
            }
        }, "Fred");
        lucy.start();
        fred.start();
    }

    public int checkBalance() {
        return this.balance;
    }

    public void deductBalance() {
        --this.balance;
        System.out.println("Balance after deduction = " + balance);
    }

    public void withdraw(String name) {
        if(checkBalance() > 0) {
            System.out.println(name + " is withdrawing");
            //;.sleep(1000);
            deductBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
