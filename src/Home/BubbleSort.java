package Home;

public class BubbleSort implements Runnable{
    private int[] sortArr;
    public BubbleSort(int[] sortArr) {
        this.sortArr = sortArr;
    }

    @Override
    public void run() {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
        for(int i = 0; i < sortArr.length; i++){
            System.out.print("пузырьком сортировка " + sortArr[i] + "\n");
        }
    }
}
