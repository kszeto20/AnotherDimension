public class Tester{
  public static void main(String[] args){
    int[] B = {1, 3, 5};
    int[][] A = { {  1,  0, 12, -1 }, {  7, -2,  2,  1 }, { -5, -2,  2, -9 } };
    int[][] C = { {  1,  2, 3, 4 }, {  2, 3,  4,  1 }, { 3, 4,  1, 2 } };
    int[][] D = { {  1,  1, 1 }, {  2, 2, 2 }, { 3,  3, 3 } };
    int[][] E = { {  2,  4, 2 }, {  2, 2, 2 } };
    System.out.println();
    System.out.println(ArrayOps.sum(B));
    System.out.println();
    System.out.println(ArrayOps.largest(B));
    System.out.println();
    System.out.println(arrToString(ArrayOps.sumRows(A)));
    System.out.println();
    System.out.println(arrToString(ArrayOps.largestInRows(A)));
    System.out.println();
    System.out.println(ArrayOps.sum(A));
    System.out.println();
    System.out.println(arrToString(ArrayOps.sumCols(A)));
    System.out.println();
    System.out.println(ArrayOps.isRowMagic(C));
    System.out.println();
    System.out.println(ArrayOps.isColMagic(D));
    System.out.println();
    System.out.println(ArrayOps.isLocationMagic(E, 1, 1));
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
