package swcs.args.after;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArgsTest {

    @Test(expected = RuntimeException.class)
    public void testWithNoSchemaButWithOneArgument() throws Exception {
        new Args("", new String[] {"-x"});
    }

    @Test(expected = RuntimeException.class)
    public void testWithSchemaButWithNoArguments() throws Exception {
        new Args("x", new String[0]);
    }

    @Test(expected = RuntimeException.class)
    public void testWithNoSchemaButWithMultipleArguments() throws Exception {
        new Args("", new String[] {"-x", "-y"});
    }

    @Test(expected = RuntimeException.class)
    public void testNonLetterSchema() throws Exception {
        new Args("*", new String[] {});
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidArgumentFormat() throws Exception {
        new Args("f~", new String[] {});
    }

    @Test
    public void testSimpleStringPresent() throws Exception {
        Args args = new Args("x*", new String[] {"-x", "param"});

        assertEquals("param", args.getString('x'));
    }

    @Test
    public void testMultipleArguments() throws Exception {
        Args args = new Args("h*,p#", new String[] {"-h", "localhost", "-p", "8080"});

        assertEquals("localhost", args.getString('h'));
        assertEquals(8080, args.getInt('p'));
    }

    @Test(expected = RuntimeException.class)
    public void testMissingStringArgument() throws Exception {
        new Args("x*", new String[] {"-x"});
    }

    @Test
    public void testSimpleIntPresent() throws Exception {
        Args args = new Args("x#", new String[] {"-x", "42"});

        assertEquals(42, args.getInt('x'));
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidInteger() throws Exception {
        new Args("x#", new String[] {"-x", "Forty two"});
    }

    @Test(expected = RuntimeException.class)
    public void testMissingInteger() throws Exception {
        new Args("x#", new String[] {"-x"});
    }
}