public class Ex0403 {
  public static void main(String[] args) {
    int isMonth = 0;
    int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    Stdin si = new Stdin();

    while(true){
      System.out.print("月=");
      isMonth = si.geti();
      if (isMonth == 0) {
        System.out.print("終了します");
        System.exit(0);
      }else if(isMonth == 2){
        System.out.println("2月は28日か29日です。");
      }else{
        System.out.println(isMonth+"月は"+ month[isMonth]+"日です。");
      }
    }
  }
}
