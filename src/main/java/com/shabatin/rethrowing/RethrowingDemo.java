package main.java.com.shabatin.rethrowing;

public class RethrowingDemo {

    public void someMethod() throws NullPointerException{
        someMethod2();
    }

    public void someMethod2() throws NullPointerException{
        throw new NullPointerException();
    }
}
