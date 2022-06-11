import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("hello");
        System.out.print("U "); //using print instead of println prints where the cursor left of so right next to the word
        System.out.print("are ");
        System.out.print("good?");
        System.out.println(); //prints a blank line

        //-----------------------------------------------------------------------------------
        Date todayDate = new Date(); //todaysDate is the varible name and setting it equal to the Date object
        // we have to use new to declare a new spot in memory for the item

        //todayDate.getTime() this is how we call an instance of that object(or in other words the functions
        //that are associated with that object
        System.out.println(todayDate);
    }
}