public class Exec0304{
  public static void main(String[] args){
    for(int i=0; i<=100; i++){
      switch (i % 15) {
        case 0:
          System.out.println("FizzBuzz");
          break;

        case 5: case 10:
          System.out.println("Buzz");
          break;

        case 3: case 6: case 9: case 12:
          System.out.println("Fizz");
          break;

        default:
          System.out.println(i);
          break;
      }
    }
  }
}
