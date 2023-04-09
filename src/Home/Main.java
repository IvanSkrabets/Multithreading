package Home;

public class Main {
    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10, };
        Thread thread = new Thread(new SelectiomSort(sortArr));
        Thread thread1 = new Thread(new BubbleSort(sortArr));
        Thread thread2 = new Thread(new InsertionSort(sortArr));
        thread1.start();
        thread.start();
        thread2.start();
    }
}
