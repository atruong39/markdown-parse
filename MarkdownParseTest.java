import static org.junit.Assert.*;

// import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class MarkdownParseTest {
    public static void getLinksTest(String filename, List<String> expected) {
        try {
            assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(filename))));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    
    // @Test
    // public void testGetLinks0() {
    //     List<String> expected = List.of("https://something.com", "some-page.html");
    //     getLinksTest("test-file.md", expected);
        
    //     // My tests
    //     expected = List.of("google.com");
    //     getLinksTest("new-test.md", expected);
    //     getLinksTest("new-test2.md", expected);
    //     expected = List.of();
    //     getLinksTest("new-test3.md", expected);
    //     getLinksTest("new-test4.md", expected);
    //     expected = List.of("google.com");
    //     getLinksTest("new-test5.md", expected);

    //     expected = List.of("https://something.com", "some-page.html");
    //     getLinksTest("test-file2.md", expected);
    //     expected = List.of();
    //     getLinksTest("test-file3.md", expected);
    //     getLinksTest("test-file4.md", expected);
    //     getLinksTest("test-file5.md", expected);
    //     getLinksTest("test-file6.md", expected);
    //     getLinksTest("test-file7.md", expected);
    //     getLinksTest("test-file8.md", expected);
    // }

    // My tests 
    @Test
    public void testGetLinks2() {
        List<String> expected = List.of("google.com");
        getLinksTest("new-test.md", expected);
    }

    @Test
    public void testGetLinks3() {
        List<String> expected = List.of("google.com");
        getLinksTest("new-test2.md", expected);
    }

    @Test
    public void testGetLinks4() {
        List<String> expected = List.of();
        getLinksTest("new-test3.md", expected);
    }
    
    @Test
    public void testGetLinks5() {
        List<String> expected = List.of();
        getLinksTest("new-test4.md", expected);
    }

    @Test
    public void testGetLinks6() {
        List<String> expected = List.of("google.com");
        getLinksTest("new-test5.md", expected);
    }

    @Test
    public void testGetLinks14() {
        List<String> expected = List.of("lol.com");
        getLinksTest("new-test6.md", expected);
    }

    @Test
    public void testGetLinks15() {
        List<String> expected = List.of();
        getLinksTest("new-test7.md", expected);
    }

    @Test
    public void testGetLinks16() {
        List<String> expected = List.of("link.com");
        getLinksTest("new-test8.md", expected);
    }

    // Professors Tests 
    @Test
    public void testGetLinks1() {
        List<String> expected = List.of("https://something.com", "some-page.html");
        getLinksTest("test-file.md", expected);
    }

    @Test
    public void testGetLinks7() {
        List<String> expected = List.of("https://something.com", "some-page.html");
        getLinksTest("test-file2.md", expected);
    }


    @Test
    public void testGetLinks8() {
        List<String> expected = List.of();
        getLinksTest("test-file3.md", expected);
    }

    @Test
    public void testGetLinks9() {
        List<String> expected = List.of();
        getLinksTest("test-file4.md", expected);
    }

    @Test
    public void testGetLinks10() {
        List<String> expected = List.of();
        getLinksTest("test-file5.md", expected);
    }

    @Test
    public void testGetLinks11() {
        List<String> expected = List.of();
        getLinksTest("test-file6.md", expected);
    }

    @Test
    public void testGetLinks12() {
        List<String> expected = List.of();
        getLinksTest("test-file7.md", expected);
    }

    @Test
    public void testGetLinks13() {
        List<String> expected = List.of();
        getLinksTest("test-file8.md", expected);
    }

    // Lab Report 4 Tests
    @Test
    public void labReport4Test1() {
        List<String> expected = List.of("`google.com","google.com","ucsd.edu");
        getLinksTest("lr4-test1.md", expected);
    }

    @Test
    public void labReport4Test2() {
        List<String> expected = List.of("a.com","a.com(())","example.com");
        getLinksTest("lr4-test2.md", expected);
    }

    @Test
    public void labReport4Test3() {
        List<String> expected = List.of("https://ucsd-cse15l-w22.github.io/");
        getLinksTest("lr4-test3.md", expected);
    }
}