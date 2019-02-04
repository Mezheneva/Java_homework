import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Restaurant restaurant = Restaurant.getInstance();

        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new Task(i, restaurant, countDownLatch)).start();
        }
        countDownLatch.await();
        Thread.sleep(10);
        Restaurant.close();
        Thread.sleep(1000);
    }
}

class Task implements Runnable {
    private int num;
    private Restaurant restaurant;
    private CountDownLatch countDownLatch;

    public Task(int num, Restaurant restaurant, CountDownLatch countDownLatch) {
        this.num = num;
        this.restaurant = restaurant;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        String currentOrder = "Order number:"+(num++);
        System.out.println(currentOrder);
        countDownLatch.countDown();
        try {
            countDownLatch.await();
            System.out.println(restaurant.doOrder(currentOrder));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

