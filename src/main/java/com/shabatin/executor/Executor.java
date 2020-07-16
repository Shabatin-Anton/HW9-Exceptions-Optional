package main.java.com.shabatin.executor;

import main.java.com.shabatin.catching.CatchExceptions;
import main.java.com.shabatin.division.SaveDivision;
import main.java.com.shabatin.rethrowing.RethrowingDemo;

public class Executor {

    public static void start() {
        new CatchExceptions().start();
        new SaveDivision().start();

        try {
            new RethrowingDemo().someMethod();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
