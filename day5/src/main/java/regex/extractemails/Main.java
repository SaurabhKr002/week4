package Regex.extractemails;

import regex.extractemails.EmailExtractor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        List<String> extractedEmails = EmailExtractor.extractEmails(text);

        System.out.println("Extracting email addresses from: " + text);
        System.out.println("Extracted email addresses:");
        for (String email : extractedEmails) {
            System.out.println(email);
        }
    }
}
