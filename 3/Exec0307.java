public class Exec0307{
  public static void main(String[] args) {
    // HACK: 1とその数自身しかない数
    System.out.println("1");
    System.out.println("2");

    for(int i=3; i<=100; i++){
      boolean primeNumberFlag = false;

      for(int j=2; j<i; j++){
        if(i%j == 0){
          primeNumberFlag = false;
          break;
        }else{
          primeNumberFlag = true;
        }
      }
      if(primeNumberFlag){
        System.out.println(i);
      }
    }
  }
}
