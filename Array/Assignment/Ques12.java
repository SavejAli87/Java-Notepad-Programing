class Ques12 {
  static void transpose(int x[][], int y[][]) {
    int Row = x.length;
    int cols = x[0].length;
    for (int i = 0; i < Row; i++) {
      for (int j = 0; j < cols; j++) {
        y[j][i] = x[i][j];
      }
    }
  }

  public static void main(String[] args) {
    int x[][] = {
      {3, 5, 9},
      {5, 8, 9}
    };

    int y[][] = new int[x[0].length][x.length];

    transpose(x, y);

    for (int i = 0; i < y.length; i++) {
      for (int j = 0; j < y[0].length; j++) {
        System.out.print(y[i][j] + " ");
      }
      System.out.println();
    }
  }
}
