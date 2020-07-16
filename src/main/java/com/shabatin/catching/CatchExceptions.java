package main.java.com.shabatin.catching;

import main.java.com.shabatin.exeption.ExceptionA;
import main.java.com.shabatin.exeption.ExceptionB;

import java.io.IOException;

public class CatchExceptions {

    public void start(){

        try{
            throw new ExceptionA();
        }catch (ExceptionA exceptionA){
            exceptionA.printStackTrace();
        }

        try{
            throw new ExceptionB();
        }catch (ExceptionB exceptionB){
            exceptionB.printStackTrace();
        }

        try {
            throw new IOException();
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

}
