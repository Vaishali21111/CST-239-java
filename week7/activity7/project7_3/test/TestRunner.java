package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
    	//run all the test assertions 
        Result result = JUnitCore.runClasses(TestAssertions.class);
        for (Failure failure : result.getFailures()) {
            System.out.println("A JUnit test failes: "+ failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("The Junit Tests " + (result.wasSuccessful() ? "Passed" : "Failed"));
        }
    }
}