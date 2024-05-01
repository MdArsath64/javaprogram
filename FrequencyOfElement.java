public class FrequencyOfElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 6, 2, 1};
        int len = arr.length;
        int vis[] = new int[len];

        for (int i = 0; i < len; i++) {
            int count = 1;
            if (vis[i] == 0) {
                for (int j = i + 1; j < len; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        vis[j] = 1;
                    }
                }
                System.out.println(arr[i] + " occurred " + count + " times");
            }
        }
    }
}
