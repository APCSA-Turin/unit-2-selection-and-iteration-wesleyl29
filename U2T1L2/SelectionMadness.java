public class SelectionMadness {

  // no instance variables //
  
  public SelectionMadness() { }

  /* Returns 1 of 5 randomly generated fortunes as a string;
     you should write your own 5 fortunes! (see output for examples)
   */
  public String fortune() {
     int rand = (int)(Math.random() * 5);
     if (rand == 0){
        return "it will be a terrible night";
     } else if (rand == 1){
        return "it's your lucky day";
     } else if (rand == 2){
        return "it's not looking so good";
     } else if (rand == 3){
        return "this day will be amazing";
     } else {
        return "the sun shines brightly on you";
     }
  }

  /* Returns the largest of three provided integers: num1, num2, or num3
   */
  public int largest(int num1, int num2, int num3) {
     if (num1 > num2 && num1 > num3){
         return num1;
     }
     else if (num2 > num3){
         return num2;
     }
     else {
      return num3;
     }
  }
public boolean rightTriangle(int side1, int side2, int side3) {
        if (side3>side2&&side3>side1){
            if (Math.pow(side1,2)+Math.pow(side2,2)==Math.pow(side3,2)){
                return true;
            } else {
                return false;
            }
        }
        else if (side2>side1&&side2>side3){
            if (Math.pow(side1,2)+Math.pow(side3,2)==Math.pow(side2,2)){
                return true;
            } else {
                return false;
            }
        }
        else{
            if (Math.pow(side2,2)+Math.pow(side3,2)==Math.pow(side1,2)){
                return true;
            } else {
                return false;
            }
        }
  }
}
