public class Ex0401 {
  public static void main(String[] args) {
    Stdin si = new Stdin();
    double bmi, height, weight = 0;

    System.out.print("身長(cm)=");
    height = si.getd();
    height = 0.01 * height; // cm -> m

    System.out.print("体重(kg)=");
    weight = si.getd();

    bmi = weight / (height * height);
    System.out.println("BMIは"+String.format("%.2f",bmi)+"です。");
  }
}
