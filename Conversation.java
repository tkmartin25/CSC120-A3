import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
// import array list

class Conversation {
  public static void main(String[] arguments) {
    int rounds = 1;
    int counter = 1 ;
    String user_sentence = "";
    String modified_user_sentence = "";
    String canned_response = "";
    // array to hold responses 
    ArrayList<String> transcript = new ArrayList<String>();
    // array to hold replacements
    String [] canned_responses = {"Mmm-hmm.", "Okay.", "Nice.", "I see.", "I get that.", "Aha.", "Real.", "It's so interesting to hear how humans think.", "That's rough, buddy."};
    // list of mirrored words String[] mirrored_words = {"you", "me", "am", "i", "my", "your"};

    Scanner user_rounds = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);

    // chatbot initiation
    System.out.println("Talk to me!");
    System.out.println("How many times do you want to talk to me? ");
    // storing how many times the user wants to talk
    rounds = user_rounds.nextInt();
    // conversation initator
    System.out.print("Hi! Whatcha doin'? ");
    transcript.add("Hi! Whatcha doin'? ");
    // while loop to talk user-specified number of times
    while (counter <= rounds) {
      // counter incrementer
      counter++;
      String mirrored_response = "";
      // user first response
      user_sentence = userInput.nextLine();
      transcript.add(user_sentence);
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
        canned_response = canned_responses[random_number.nextInt(8)];
        System.out.println(canned_response);
        transcript.add(canned_response);
      }
      else {
        mirrored_response = mirrored_response.replace(".","?");
        System.out.println(mirrored_response);
        transcript.add(mirrored_response);
      }
      
      
  } // while loop bracket
            

    user_rounds.close();
    userInput.close();
    // final bye greeting
    System.out.println("Bye!");
    transcript.add("Bye!");
    System.out.println("Here's a transcript of our conversation.");
    for (String element : transcript) {
      System.out.println(element);
    }
}
}


  
