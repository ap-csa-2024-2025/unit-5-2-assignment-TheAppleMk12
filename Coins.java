public class Coins
{
  public static void main(String[] args)
  {
    int cents = 1234;
    coinConverter(cents);
  }

    static void coinConverter(int n)
    {
      int b = n/100;
      n = n % 100;
      System.out.println("Dollar Bills: " + b);
      b = n/25;
      n = n % 25;
      System.out.println("Quarters: " + b);
      b = n/10;
      n = n % 10;
      System.out.println("Dimes: " + b);
      b = n/5;
      n = n % 5;
      System.out.println("Nickels: " + b);
      System.out.println("Pennies: " + n);
    }
}
