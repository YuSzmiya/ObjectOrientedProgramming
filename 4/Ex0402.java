public class Ex0402 {
  public static void main(String[] args) {
    Stdin si = new Stdin();
    int countElement, maxNumber = 0;
    int array[];

    System.out.print("個数=");
    countElement = si.geti();
    array = new int[countElement];

    for (int i = 0; i < countElement; i++) {
      array[i] = si.geti();

      if (maxNumber < array[i]) {
        maxNumber = array[i];
      }
    }
    System.out.println("最大値="+maxNumber);
  }
}
