package Home;

public class InsertionSort extends Thread {
    private int[] sortArr;
    public InsertionSort( int[] sortArr){
        this.sortArr = sortArr;
    }

    @Override
    public void run() {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        for(int i = 0; i < sortArr.length; i++){
            System.out.print("вставками " + sortArr[i] + "\n");
        }
    }
}
