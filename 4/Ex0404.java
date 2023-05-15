public class Ex0404 {
  public static void main(String[] args) {
    Stdin si = new Stdin();
    String originalString;
    // char reverceString[];
    int countWord;

    System.out.print("文字列=");
    originalString = si.gets();

    System.out.print("長さ=");
    countWord = si.geti();

    // reverceString = new char[countWord+1];
    for (int i = countWord-1; i >= 0; i--) {
      System.out.print(originalString.charAt(i));
    }
  }
}
