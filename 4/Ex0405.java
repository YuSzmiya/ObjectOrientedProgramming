import java.util.Random;

public class Ex0405 {
  public static void main(String[] args) {
    Stdin si = new Stdin();
    int guessNumber = new Random().nextInt(100);
    int inputNumber = 0;

    for (int i = 0; i <= 10; i++) {
      System.out.print("数は=");
      while (true) {
        inputNumber = si.geti();
        if (0 <= inputNumber && inputNumber <= 99) {
          System.out.print("0～99の値を入力してね:");
          break;
        }
      }

      if (inputNumber == guessNumber) {
        System.out.println("正解!");
        System.exit(0);
      }else if (inputNumber > guessNumber) {
        System.out.println("大きい");
      } else {
        System.out.println("小さい");
      }
    }
    System.out.print("終了します");
    System.exit(0);
  }
}
