// import scanner, random, and arraylist
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

// make conversation class
class Conversation {
  public static void main(String[] arguments) {
    // defining variables
    int rounds = 1;
    int counter = 1 ;
    String user_sentence = "";
    String modified_user_sentence = "";
    String canned_response = "";
    // array to hold responses 
    ArrayList<String> transcript = new ArrayList<String>();
    // string array of canned responses
    String [] canned_responses = {"Mmm-hmm.", "Okay.", "Nice.", "I see.", "I get that.", "Aha.", "Real.", "It's so interesting to hear how humans think.", "That's rough, buddy."};
    // Scanner for user rounds input and user input for conversation
    Scanner user_rounds = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    // chatbot initiation
    System.out.println("Talk to me!");
    System.out.println("How many times do you want to talk to me? ");
    // storing how many times the user wants to talk
    rounds = user_rounds.nextInt();
    // conversation initator
    System.out.print("Hi! Whatcha doin'? ");
    // add computer greeting to transcript
    transcript.add("Hi! Whatcha doin'? ");
    // while loop to talk user-specified number of times
    while (counter <= rounds) {
      // counter incrementer
      counter++;
      // redefining mirrored response as "" within while loop to reset it
      String mirrored_response = "";
      // user first response
      user_sentence = userInput.nextLine();
      // add user conversation reply
      transcript.add(user_sentence);
      // format user_sentence for analysis
      modified_user_sentence = user_sentence.toLowerCase();
      // splitting to get rid of spaces
      String[] split = modified_user_sentence.split(" ");
      // check string elements for mirrored_words, and if true, change element
      for (String element : split) {
        if (element.equals("i")) {
          element = "you";
        }
        else if (element.equals("you")) {
          element = "i";
        }
        else if (element.equals("my")) {
          element = "your";
        }
        else if (element.equals("your")) {
          element = "my";
        }
        else if (element.equals("me.")) {
          element = "you";
        }
        else if (element.equals("am")) {
          element = "are";
        }
        else if (element.equals("are")) {
          element = "am";
        }
        else if (element.equals("you.")) {
          element = "me";
        }
        else if (element.equals("you're")) {
          element = "I'm";
        }
        else if (element.equals("i'm")) {
          element = "you're";
        }
        // add element to mirrored response 
        mirrored_response += element + " ";
        }
      
      // if no words are changed, aka there are no mirrored words, print canned response
      if (mirrored_response.equals(user_sentence.toLowerCase() + " ")) {
        // generate random number
        Random random_number = new Random();
        // print random canned response using random number generated above
        canned_response = canned_responses[random_number.nextInt(8)];
        // print canned response
        System.out.println(canned_response);
        // add canned response to transcript
        transcript.add(canned_response);
      }
      // if there are mirrored words, print new mirrored response
      else {
        // replace ending with ? instead of .
        mirrored_response = mirrored_response.replace(".","?");
        // print completed mirrored response
        System.out.println(mirrored_response);
        // add mirrored response to transcript
        transcript.add(mirrored_response);
      }
      
      
  } // while loop bracket
            
    // close scanners
    user_rounds.close();
    userInput.close();
    // final bye greeting
    System.out.println("Bye!");
    // add final greeting to transcript
    transcript.add("Bye!");
    // let user know that it is printing transcript
    System.out.println('\n' + "Here's a transcript of our conversation.");
    // for elements in the transcript string array, print it out
    for (String element : transcript) {
      System.out.println(element);
    }
}
}


  
