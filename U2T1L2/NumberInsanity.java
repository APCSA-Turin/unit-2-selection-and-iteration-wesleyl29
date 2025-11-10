import java.util.Scanner;


public class NumberInsanity {


   public NumberInsanity() { }


   public void go() {
       Scanner myScanner = new Scanner(System.in);
       System.out.print("Enter a positive integer: ");
       int num = myScanner.nextInt();
       String msg = result(num); // call helper method and store result 
       System.out.println(msg);
   }


   // helper method that returns string containing message to be printed
   private String result(int num) {
        if (num<=0){
            return "That's not a positive number!";
        } else {
            if (num%2!=0){
                if (num%5==0&&num%7==0){
                    return "Divisible by both 5 and 7!";
                }
                else if (num%5==0){
                    return "Divisible by 5!";
                }
                else if (num%7==0){
                    return "Divisible by 7!";
                } else {
                    return "Not divisible by 5 or 7!";
                }
            } else {
                if (num>=100){
                    return "Big even number!";
                } else if (num>= 50){
                    return "Medium even number!";
                } else {
                    return "Small even number!";
                }
            }
        }
   }
     /* Returns true if the three provided lengths create a right triangle, in
     other words, a2 + b2 = c2, where c is the longest side; returns false
     Otherwise (hint: use the largest() method that you wrote).
     Note the "largest" side could be any of the 3 numbers, i.e. your method
     should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     side1 = 5, side2 = 4, and side3 = 3
   */
  
}
