public class DeleteElementInArray {
    //delete the element in array
    static final int size = 5;

    public static void main(String[] args) {
        int[] arr = {1, 20, 5, 78, 30};
        int pos = 2;
        
        if (pos < size && pos >= 0) {
            // Shift all elements from the last index to pos by 1 position to the right
            for (int i = pos; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            for (int i = 0; i < size - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid Position");
        }
    }
}

