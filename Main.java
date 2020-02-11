import java.util.Arrays;

class Main {
  static int size = 5;
  public static void main(String[] args) {
    int[][] magicSquare = new int[size][size];

    int row = 0;
    int col = (int) Math.floor((size - 1) / 2);
    int val = 1;

    while (val <= size * size) {
      magicSquare[row][col] = val;
      if (magicSquare[mod(row - 1)][mod(col + 1)] != 0) {
        row = mod(row + 1);
      }
      else {
        row = mod(row - 1);
        col = mod(col + 1);
      }
      val++;
    }

    System.out.println(Arrays.deepToString(magicSquare));
    
  }

  public static int mod(int a, int b) {
    int res = a % b;
    if (res < 0) res += b;
    return res;
  }
  public static int mod(int a) {
    return mod(a, size);
  }
}