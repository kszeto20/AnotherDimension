public class Tester{
  public static void main(String[] args){
    int[] arr = {1, 3, 5, 7, 5, 30, 2, 5, 5, 10};
    int[][] matrix = { {3, 4, 5, 6, 7}, {7, 6, 5, 4, 3}, {1, 2, 8, 9, 10} };
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));

    int[] a = ArrayOps.sumRows(matrix);
    for (int i = 0; i < a.length; i++){
      System.out.println("test" + a[i]);
    }
  }
}
