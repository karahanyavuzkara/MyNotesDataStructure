public class BubbbleSortmytry {
    public static void main(String[]args) {
        int array [] = {2, 3, 1, 8, 5 , 4, 9, 6, 7,};

        bubbleSort(array);
        for ( int i : array ) {
            System.out.print(i);
        }
    }
    public static void bubbleSort(int array []) {
        for (int i = 0; i < array.length -1 ; i++) {
            for (int j = 0; j <array.length -i -1 ; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }

    }
}