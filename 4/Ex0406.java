public class Ex0406 {
  public static void main(String[] args) {
    Stdin si = new Stdin();
    int inputNumber = 0;

    while (inputNumber != -1) {
      System.out.print("数は=");
      inputNumber = si.geti();

      if (inputNumber == -1) {
        System.out.println("終了します");
      } else if (inputNumber < 0 && 500 < inputNumber) {
        System.out.println("500以下の正の整数を入力してね");
      } else if (inputNumber == 1 || inputNumber == 2) {
        System.out.println("素数です!");
      } else {
        boolean primeNumberFlag = true;
        for (int i = 2; i < inputNumber; i++) {
          if (inputNumber % i == 0) {
            System.out.println("素数ではありません");
            primeNumberFlag = false;
            break;
          }
        }
        if (primeNumberFlag) {
          System.out.println("素数です!");
        }
      }
    }
  }
}
