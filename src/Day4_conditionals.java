public class Day4_conditionals{
    public static void main(String[] args){
//         When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


// cigarParty(30, false) → false
// cigarParty(50, false) → true
// cigarParty(70, true) → true
public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend == true){
      if(cigars>=40){
        return true;
      }
      else{
        return false;
      }
    }
    else{
      if(cigars>=40 && cigars<=60){
        return true;
      }
      else{
        return false;
      }
    }
  }

//   You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.


// caughtSpeeding(60, false) → 0
// caughtSpeeding(65, false) → 1
// caughtSpeeding(65, true) → 0

public int caughtSpeeding(int speed, boolean isBirthday) {
    if(isBirthday == true){
      if(speed-5 <= 60){
        return 0;
      }
      else if(speed-5 >=61 && speed-5 <=80){
        return 1;
      }
      else {
        return 2;
      }
    }
    else{
      if(speed <= 60){
        return 0;
      }
      else if(speed >=61 && speed <=80){
        return 1;
      }
      else{
        return 2;
      }
    }
  }
 }
}