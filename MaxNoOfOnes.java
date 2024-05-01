public class MaxNoOfOnes {
    public static void main(String[] args) {
        int[][] br = {{1, 0, 1}, {1, 1, 0}, {0, 0, 1}, {1, 1, 1}};
        int[] ar = new int[br.length];

        for (int i = 0; i < br.length; i++) {
            int count = 0;
            for (int j = 0; j < br[i].length; j++) {
                if (br[i][j] == 1) {
                    count++;
                }
            }
            ar[i] = count;
        }

        int maxIndex = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > ar[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("row " + maxIndex + " has the maximum number of 1");
    }
}