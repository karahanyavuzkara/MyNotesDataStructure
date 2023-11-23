public class myty {
    public static void main(String[] args) {
        int array[] = {6, 3, 4, 1, 5, 7, 9, 8};

        bubbleSorty(array);
        for (int i : array) {
            System.out.print(i);
        }
    }
    public static void bubbleSorty(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;


                }
            }
        }
    }
}