public class Exec0306{
  public static void main(String[] args){
    int[] numArray = {4, 13, 6, 9, 2, 5, 1, 11, 8, 3};

    // select sort
    for(int i=0; i<9-1; i++){
      int maxIndex = i;
      int tmp;
      for(int j=i; j<=9; j++){
        if(numArray[maxIndex] < numArray[j]){
          maxIndex = j;
        }
      }

      tmp = numArray[maxIndex];
      numArray[maxIndex] = numArray[i];
      numArray[i] = tmp;
    }
    for(int n=0; n<10; n++){
      System.out.println(numArray[n]);
    }
  }
}
