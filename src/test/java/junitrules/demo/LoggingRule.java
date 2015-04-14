package junitrules.demo;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule {

    private String name;

    public LoggingRule(String name) {
        this.name = name;
    }

    public Statement apply(Statement base, Description description) {
        return new Statement() {

            @Override
            public void evaluate() throws Throwable {

                String methodName = description.getMethodName();
                System.out.println(name + ", BEFORE executing original Statement '" + methodName + "'\n");

                try {
                    base.evaluate();
                } finally {
                    System.out.println(name + ", AFTER executing original Statement '" + methodName + "'\n");
                }
            }
        };
    }
}
