import static org.junit.Assert.*;
import org.junit.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.IOException;

public class MarkdownParseTest {

    String[] toArray(ArrayList<String> li) {
        String[] array = new String[li.size()];
        for (int i = 0; i < array.length; i++) array[i] = li.get(i);
        return array;
    }

    @Test
    public void test1() throws IOException {
        Path filename = Path.of("test-file.md");
        String content = Files.readString(filename);
        String[] exp = {"https://something.com", "some-thing.htmll"};
        assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    }

    // @Test
    // public void test2() throws IOException {
    //     Path filename = Path.of("test-file2.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {"page.com"};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

    // @Test
    // public void test3() throws IOException {
    //     Path filename = Path.of("test-file3.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {"more text here"};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

    // @Test
    // public void test4() throws IOException {
    //     Path filename = Path.of("test-file4.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

    // @Test
    // public void test5() throws IOException {
    //     Path filename = Path.of("test-file5.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {"page.com"};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

    // @Test
    // public void test6() throws IOException {
    //     Path filename = Path.of("test-file6.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {"page.com"};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

    // @Test
    // public void test7() throws IOException {
    //     Path filename = Path.of("test-file7.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

    // @Test
    // public void test8() throws IOException {
    //     Path filename = Path.of("test-file8.md");
    //     String content = Files.readString(filename);
    //     String[] exp = {"a link on the first line"};
    //     assertArrayEquals(exp, toArray(MarkdownParse.getLinks(content)));
    // }

}