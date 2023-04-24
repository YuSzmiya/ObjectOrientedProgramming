public class Daikei{
  public static void main(String[] argv){
    final int UPPER_SOLE = 2; //cm
    final int DOWNNER_SOLE = 3; //cm
    final int HEIGHT = 4; //cm

    float trapezoidArea = (UPPER_SOLE + DOWNNER_SOLE) * HEIGHT / 2;
    System.out.println("上底:"+UPPER_SOLE+"cm,"+
                     "下底:"+DOWNNER_SOLE+"cm,"+
                     "高さ:"+HEIGHT+"cm,"+
                     "の台形の面積は"+trapezoidArea+"cm^2です");
  }
}
