package swcs.args.after;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArgsTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testWithNoSchemaButWithOneArgument() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("", new String[] {"-x"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.UNEXPECTED_ARGUMENT, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testWithSchemaButWithNoArguments() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("x", new String[0]);
        } catch (ArgsException e) {
            throw e;
        }
    }

    @Test
    public void testWithNoSchemaButWithMultipleArguments() throws Exception {
        try {
            this.exception.expect(ArgsException.class);

            new Args("", new String[] {"-x", "-y"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.UNEXPECTED_ARGUMENT, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testNonLetterSchema() throws Exception {
        this.exception.expect(ArgsException.class);
        try {
            new Args("*", new String[] {});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.INVALID_ARGUMENT_NAME, e.getErrorCode());
            assertEquals('*', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testInvalidArgumentFormat() throws Exception {
        this.exception.expect(ArgsException.class);
        try {
            new Args("f~", new String[] {});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.INVALID_ARGUMENT_FORMAT, e.getErrorCode());
            assertEquals('f', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testMissingBooleanArgument() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("x", new String[] {"-x"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.MISSING_BOOLEAN, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testInvalidArgumentValueFormat() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("x, y", new String[] {"xy", "true", "false"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.INVALID_ARGUMENT_FORMAT, e.getErrorCode());
            assertEquals('-', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testSimpleStringPresent() throws Exception {
        Args args = new Args("x*", new String[] {"-x", "param"});

        assertTrue(args.has('x'));
        assertEquals("param", args.getString('x'));
    }

    @Test
    public void testMissingStringArgument() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("x*", new String[] {"-x"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.MISSING_STRING, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            throw e;
        }
    }

    @Test
    public void testSimpleIntPresent() throws Exception {
        Args args = new Args("x#", new String[] {"-x", "42"});

        assertTrue(args.has('x'));
        assertEquals(42, args.getInt('x'));
    }

    @Test
    public void testInvalidInteger() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("x#", new String[] {"-x", "Forty two"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.INVALID_INTEGER, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            assertEquals("Forty two", e.getErrorParameter());
            throw e;
        }
    }

    @Test
    public void testMissingInteger() throws Exception {
        this.exception.expect(ArgsException.class);

        try {
            new Args("x#", new String[] {"-x"});
        } catch (ArgsException e) {
            assertEquals(ArgsException.ErrorCode.MISSING_INTEGER, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            throw e;
        }
    }
}