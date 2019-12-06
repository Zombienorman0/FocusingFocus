import java.io.*;

public class AddNum {

  public int addNum(int numA, int numB) {
    return numA + numB;
  }

  public double divideNum(double numA, double numB) {
    return numA / numB;
  }

  public static void main (String args[])
  throws IOException
  {
    AddNum obj = new AddNum();
    int ansSum = obj.addNum(1,2);
    double ansDiv;
    try{
   ansDiv = obj.divideNum(4,0);
   System.out.println("Excellent, you haven't divide by 0.");
  }catch(Exception e) {
    System.out.println("please don't divide by 0.");
    ansDiv = 108.0 ;
    System.out.printf("%.2f", ansDiv);
  }
    System.out.println("\nThe sum of two numbers is: " + ansSum + "\n");
    System.out.println("\nthe divisible of two numbers is: " + ansDiv + "\n");
  }
}
