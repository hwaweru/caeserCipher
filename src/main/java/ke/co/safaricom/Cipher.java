package ke.co.safaricom;

import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to encode: ");
        String message = scanner.nextLine();
        System.out.print("Enter the key (an integer from 1 to 25): ");
        int key = scanner.nextInt();
        String encodedMessage = encode(message, key);
        System.out.println("Encoded message: " + encodedMessage);
        String decodedMessage = decode(encodedMessage, key);
        System.out.println("Decoded message: " + decodedMessage);
        scanner.close();
    }

    public static String encode(String message, int key) {
        String encodedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    c = (char)(((int)c + key - 65) % 26 + 65);
                } else {
                    c = (char)(((int)c + key - 97) % 26 + 97);
                }
            }
            encodedMessage += c;
        }
        return encodedMessage;
    }

    public static String decode(String message, int key) {
        return encode(message, 26 - key);
    }
}
