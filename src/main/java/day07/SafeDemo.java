package day07;

public class SafeDemo {
    public static void main(String[]args) throws InterruptedException{
        SafeBankAccount sbk = new SafeBankAccount();
        System.out.println("Current"+sbk.getBalance());

        Thread[] threads = new Thread[1000];
         for(int i = 0 ; i < 1000; i ++){
             threads[i] = new Thread(() -> sbk.withdraw(1));
         }

         for(Thread t : threads) t.start();

         for(Thread t : threads) t.join();

        System.out.println("Expected is 9000");
        System.out.println("Actual "+sbk.getBalance());
    }
}
