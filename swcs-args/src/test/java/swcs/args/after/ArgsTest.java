package swcs.args.after;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class ArgsTest {

    @Test
    void testWithNoSchemaButWithOneArgument() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("", new String[] {"-x"}));
    }

    @Test
    void testWithSchemaButWithNoArguments() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("x", new String[0]));
    }

    @Test
    void testWithNoSchemaButWithMultipleArguments() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("", new String[] {"-x", "-y"}));
    }

    @Test
    void testNonLetterSchema() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("*", new String[] {}));
    }

    @Test
    void testInvalidArgumentFormat() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("f~", new String[] {}));
    }

    @Test
    void testSimpleStringPresent() throws Exception {
        Args args = new Args("x*", new String[] {"-x", "param"});

        assertEquals("param", args.getString('x'));
    }

    @Test
    void testMultipleArguments() throws Exception {
        Args args = new Args("h*,p#", new String[] {"-h", "localhost", "-p", "8080"});

        assertEquals("localhost", args.getString('h'));
        assertEquals(8080, args.getInt('p'));
    }

    @Test
    void testMissingStringArgument() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("x*", new String[] {"-x"}));
    }

    @Test
    void testSimpleIntPresent() throws Exception {
        Args args = new Args("x#", new String[] {"-x", "42"});

        assertEquals(42, args.getInt('x'));
    }

    @Test
    void testInvalidInteger() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("x#", new String[] {"-x", "Forty two"}));
    }

    @Test
    void testMissingInteger() throws Exception {
        assertThrows(RuntimeException.class, () -> new Args("x#", new String[] {"-x"}));
    }
}