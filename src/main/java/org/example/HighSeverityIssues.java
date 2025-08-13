package org.example;

public class HighSeverityIssues {

    private ProblemsFactory factory;

    /**
     * Calls a deprecated method from the factory.
     */
    public void usingDeprecatedApi() {
        factory.method3();
    }

    void unreachableCode() {
        System.exit(0);
        System.out.println("Application is terminated");
    }
}
