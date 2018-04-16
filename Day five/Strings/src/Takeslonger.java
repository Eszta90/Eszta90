public class Takeslonger {

        public static void main(String... args){
            String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

            StringBuilder quote2 = new StringBuilder(quote);
            quote2.insert (21, "always takes longer than ");
            String s = quote2.toString();
            quote = s;
            System.out.println(quote);

            // When saving this quote a disk error has occured. Please fix it.
            // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
            // Using pieces of the quote variable (instead of just redefining the string)

        }
    }

