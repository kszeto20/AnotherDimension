public class ArrayOps{
  public static void main(String[] args){
    System.out.println("hello world");
  }
  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }

}
