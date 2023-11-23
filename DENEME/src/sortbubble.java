public class sortbubble {
    // Method to print the array
    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Method to perform bubble sort
    static void bubbleSort(int a[]) {
        int n = a.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap a[j] and a[j+1]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the sorting
    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array:");
        print(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        print(arr);
    }
}
