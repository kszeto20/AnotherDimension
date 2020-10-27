public class Tester{
  public static void main(String[] args){
    int[] arr = {1, 3, 5, 7, 5, 30, 2, 5, 5, 10};
    int[][] matrix = { {3, 4, 5, 6, 7}, {7, 6, 5, 4, 3}, {1, 2, 8, 9, 10, 11} };
    int[][] matrix2 = { {1, 2, 3, 4, 5, 6}, {5, 5, 6, 5}, {10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} };
    System.out.println();
    System.out.println(ArrayOps.sum(arr));
    System.out.println();
    System.out.println(ArrayOps.largest(arr));
    System.out.println();
    System.out.println(arrToString(ArrayOps.sumRows(matrix)));
    System.out.println();
    System.out.println(arrToString(ArrayOps.largestInRows(matrix)));
    System.out.println();
    System.out.println(ArrayOps.sum(matrix));
    System.out.println();
    System.out.println(arrToString(ArrayOps.sumCols(matrix)));
    System.out.println();
    System.out.println(ArrayOps.isRowMagic(matrix2));
  }

  public static String arrToString(int[] arr){
    String newString = "{";
    if (arr.length > 0){
      for (int i = 0; i < arr.length - 1; i++){
        newString = newString + Integer.toString(arr[i]) + ", ";
      }
      newString = newString + Integer.toString(arr[arr.length - 1]);
    }
    return newString + "}";
  }

}
