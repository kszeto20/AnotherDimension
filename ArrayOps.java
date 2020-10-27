public class ArrayOps{
  public static void main(String[] args) {
    
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest){
        largest = arr[i];
      }
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] comboRow = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      int rowSum = 0;
      for (int j = 0; j < matrix[i].length; j++) {
        rowSum += matrix[i][j];
      }
      comboRow[i] = rowSum;
    }
    return comboRow;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] biggestTerm = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++){
      biggestTerm[i] = ArrayOps.largest(matrix[i]);
    }
  return biggestTerm;
  }


}
