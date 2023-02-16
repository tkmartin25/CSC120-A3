import java.util.Scanner;
import java.util.Random;
// import array list

class Conversation {
  public static void main(String[] arguments) {
    int rounds = 1;
    int counter = 1 ;
    String user_sentence = "";
    String user_reply = ""; 
    String modified_user_sentence = "";
    // array to hold responses 
    String [] transcript = {};
    // array to hold replacements
    String [] canned_responses = {"Mmm-hmm.", "Okay.", "Nice.", "I see.", "I get that.", "Aha.", "Real.", "It's so interesting to hear how humans think."};
    // list of mirrored words String[] mirrored_words = {"you", "me", "am", "i", "my", "your"};

    Scanner user_rounds = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);

    // chatbot initiation
    System.out.println("Talk to me!");
    System.out.println("How many times do you want to talk to me? ");
    // storing how many times the user wants to talk
    rounds = user_rounds.nextInt();
    // while loop to talk user-specified number of times
    while (counter <= rounds) {
      // counter incrementer
      counter++;
      String mirrored_response = "";
      // conversation initator
      System.out.print("Hi! Whatcha doin'? ");
      // user first response
      user_sentence = userInput.nextLine();
      // format user_sentence for analysis
      modified_user_sentence = user_sentence.toLowerCase();
      // splitting to get rid of spaces
      String[] split = modified_user_sentence.split(" ");
      // if any elemnts are mirror words, replace them and 
      // print new response with changes. Else, print canned response
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
        mirrored_response += element + " ";
        }
      
      if (mirrored_response.equals(user_sentence.toLowerCase() + " ")) {
        // generate random number
        Random random_number = new Random();
        // print random canned response using random number generated above
        System.out.println(canned_responses[random_number.nextInt(7)]); 
      }
      else {
        System.out.println(mirrored_response);
      }
      
      
  } // while loop bracket
            
          
  
    user_rounds.close();
    userInput.close();
    userInput2.close();
    // final bye greeting
    System.out.println("Bye!");
}
}


  
