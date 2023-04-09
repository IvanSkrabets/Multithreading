package Home;

public class SelectiomSort extends Thread {

    private int[] sortArr;

      public  SelectiomSort(int[] sortArr){
          this.sortArr = sortArr;
}
    @Override
    public void run() {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
        for(int i = 0; i < sortArr.length; i++){
            System.out.print("Выбором " + sortArr[i] + "\n");
        }

    }
}


