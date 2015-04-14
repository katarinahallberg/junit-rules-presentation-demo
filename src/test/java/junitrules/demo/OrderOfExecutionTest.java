package junitrules.demo;

import org.junit.*;

public class OrderOfExecutionTest {

    @Rule
    public LoggingRule loggingRule = new LoggingRule("    [Rule]");

    @ClassRule
    public static LoggingRule loggingClassRule = new LoggingRule("[ClassRule]");

    @BeforeClass
    public static void before_class() {
        System.out.println("  [@] BeforeClass\n");
    }

    @AfterClass
    public static void after_class() {
        System.out.println("  [@] AfterClass\n");
    }

    @Before
    public void before() {
        System.out.println("      [@] Before\n");
    }

    @After
    public void after() {
        System.out.println("      [@] After\n");
    }




    @Test
    public void test_one() {
        System.out.println("        [TEST] test_one\n");
    }

    @Test
    public void test_two() {
        System.out.println("        [TEST] test_two\n");
    }
}
