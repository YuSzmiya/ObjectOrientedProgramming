public class Exec0305{
  public static void main(String[] args){
    int[] numbers = { 4, 13, 6, 9, 2, 5, 1, 11, 8, 3 };
    int maxNumber = 0;
    for (int i = 0; i < 10; i++) {
      if (maxNumber < numbers[i]) {
        maxNumber = numbers[i];
      }
    }
    System.out.println("最大値="+maxNumber);
  }
}
