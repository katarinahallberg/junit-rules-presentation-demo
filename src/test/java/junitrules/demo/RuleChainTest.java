package junitrules.demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

import static org.junit.Assert.assertTrue;

public class RuleChainTest {

    @Rule
    public RuleChain chain = RuleChain
            .outerRule(new LoggingRule("Outer rule"))
            .around(new LoggingRule("  Middle rule"))
            .around(new LoggingRule("    Inner rule"));

    @Test
    public void test_one() {
        System.out.println("      In 'test_one'\n");
        assertTrue(true);
    }
}
