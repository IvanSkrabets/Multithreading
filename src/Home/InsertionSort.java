package Home;

public class InsertionSort extends Thread {
    private int[] sortArr;
    public InsertionSort( int[] sortArr){
        this.sortArr = sortArr;
    }

    @Override
    public void run() {
        int j;
        //���������� �������� �� ������� ��������, �.�. ���������, ��� ������ ������� ��� ������������
        for (int i = 1; i < sortArr.length; i++) {
            //��������� ������ �� ������ ����������� ��������
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //�������� ���������������� �������� ���������� �����, ���� ��� ������ �������� ��� �������
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        for(int i = 0; i < sortArr.length; i++){
            System.out.print("��������� " + sortArr[i] + "\n");
        }
    }
}
