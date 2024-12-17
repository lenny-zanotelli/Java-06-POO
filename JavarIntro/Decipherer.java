public class Decipherer {
  public static String decipher(String message) {
    int lenght = message.length();
    int key = lenght / 2;
    String subMessage = message.substring(5, 5 + key);
    subMessage = subMessage.replace("@#?", " ");

    String reversedMessage = new StringBuilder(subMessage).reverse().toString();

    return reversedMessage;
  }

  public static void main(String[] args) {

    String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
    String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

    System.out.println(decipher(message1));
    System.out.println(decipher(message2));
    System.out.println(decipher(message3));
  }
  
}
