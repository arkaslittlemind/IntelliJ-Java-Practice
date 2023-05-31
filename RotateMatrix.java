public class RotateMatrix {
    static int N = 3;

    static void rotate(int[][] mat) {
        for (int i = N - 1; i >= 0 ; i--) {
            for (int j = N - 1; j >= 0; j--) {
                System.out.println(mat[i][j] + " ");

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(mat);
    }
}
