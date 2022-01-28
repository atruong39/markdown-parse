import static org.junit.Assert.*;

// import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks1() {
        List<String> expected = List.of("https://something.com", "some-page.html");
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        expected = List.of("google.com");
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of("new-test.md"))));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        expected = List.of("google.com");
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of("new-test2.md"))));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        expected = List.of();
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of("new-test3.md"))));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}