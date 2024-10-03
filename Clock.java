public class Clock
{
  public static void main(String[] args)
  {
    System.out.println(timeOfDay(0));
    System.out.println(timeOfDay(3));
    System.out.println(timeOfDay(6));
    System.out.println(timeOfDay(9));
    System.out.println(timeOfDay(12));
    System.out.println(timeOfDay(15));
    System.out.println(timeOfDay(18));
    System.out.println(timeOfDay(21));
    System.out.println(timeOfDay(24));
    System.out.println(timeOfDay(27));

  }

  public static String timeOfDay(int n)
  {
    String output = "null";
    n = n%24;

    if (n == 0){
      output = "midnight";
    } else if (12 > n) {
      output = "morning";
    } else if (n == 12) {
      output = "noon";
    } else if (18 > n) {
      output = "afternoon";
    } else if (n == 18) {
      output = "dusk";
    } else if (24 > n) {
      output = "evening";
    } 
    return output;
  }
  // write code for timeOfDay here

}
