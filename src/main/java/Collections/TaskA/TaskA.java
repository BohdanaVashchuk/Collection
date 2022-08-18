
package Collections.TaskA;
import java.util.*;


public class TaskA {

    public static void main(String[] args)
    {
        ArrayList<String> userInput = new ArrayList<String>();
        System.out.println("Enter your word: ");
        Scanner input = new Scanner(System.in);
        while (true) {
           String word = input.next();
           if(word.equalsIgnoreCase("break")){
               System.out.println("Program is stopped due to break");
               outputAll(userInput);
               outputWordWithS(userInput);
               outputWordWithSize(userInput);
               break;
            }
            userInput.add(word);
        }
    }

    public static void outputAll(ArrayList<String> userInput) {
        System.out.println("You enter next text ");
        for (String word:userInput) {
            System.out.println(word);
        }
    }

    public static void outputWordWithS(ArrayList<String> userInput) {
        System.out.println("All words with that starts with s");
        for (String word:userInput) {
            if(word.startsWith("s")){
                System.out.println(word);
            }
        }
    }

    public static void outputWordWithSize(ArrayList<String> userInput) {
        System.out.println("All words with 5 char");
        for (String word:userInput) {
            if(word.length()> 5){
                System.out.println(word);
            }
        }
    }

}
