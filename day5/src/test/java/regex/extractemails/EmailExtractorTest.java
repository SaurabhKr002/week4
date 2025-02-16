package regex.extractemails;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class EmailExtractorTest {

    @Test
    void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("support@example.com"));
        assertTrue(emails.contains("info@company.org"));
    }

    @Test
    void testNoEmails() {
        String text = "No emails here!";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertTrue(emails.isEmpty());
    }

    @Test
    void testEmailsWithSpecialCharacters() {
        String text = "Reach out to Saurabh_Kumar123@mail.co.uk and Shreya+Singh@gmail.com";
        List<String> emails = EmailExtractor.extractEmails(text);

        assertEquals(2, emails.size());
        assertTrue(emails.contains("Saurabh_Kumar123@mail.co.uk"));
        assertTrue(emails.contains("Shreya+Singh@gmail.com"));
    }
}
