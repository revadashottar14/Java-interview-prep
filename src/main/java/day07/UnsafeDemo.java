package day07;

public class UnsafeDemo {
    public static void main (String [] args) throws InterruptedException {
        UnsafeBankAccount bk = new UnsafeBankAccount();
        System.out.println("Starting balance "+bk.getBalance());

        Thread[] threads = new Thread[1000];
        for(int i=0;i<1000;i++){
            threads[i] = new Thread(()-> bk.withdraw(1));
        }
        for(Thread t : threads) t.start();

        for(Thread t : threads) t.join();

        System.out.println("Expected is 9000");
        System.out.println("Actual "+bk.getBalance());
    }
}
