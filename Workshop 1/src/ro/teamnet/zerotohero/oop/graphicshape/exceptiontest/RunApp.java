package ro.teamnet.zerotohero.oop.graphicshape.exceptiontest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Gabriel.Tabus on 7/4/2017.
 */
public class RunApp {
    public void tryFinnalyWithFlux() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fis.in"));
        try {
            System.out.println(br.readLine());
        } catch (Exception e) {
            if (e instanceof IOException) {
                System.out.println("I/O exception!");
            }
            if (e instanceof FileNotFoundException) {
                System.out.println("FileNotFound!");
            }
        } finally {
            br.close();
        }

        try{
            throw new RuntimeException();
        }finally {

        }
    }


    public void tryFinally() {
        int a = 5;
        try {
            System.out.println(a);
            throw new FileNotFoundException("bla4");
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof ExceptionType1) {
                System.out.println("tryFinally method Exception!");
            }
        } finally {
            a = 10;
            System.out.println(a);
        }
    }

    public void tryWithResources() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fis.in"));;
        try{
            System.out.println(br.readLine());
        } catch (Exception e) {
            if (e instanceof IOException) {
                System.out.println("I/O exception!");
            }
            if (e instanceof FileNotFoundException) {
                System.out.println("FileNotFound!");
            }
        } finally {
            br.close();
        }
    }

    public void nestA() {
        try {
            nestB();
        } catch (Exception e) {
            if (e instanceof ExceptionType1) {
                System.out.println("Exceptie prinsa in nestA!");
            }
        }
    }

    public void nestB() {
        try {
            nestC();
        } catch (Exception e) {
            if (e instanceof ExceptionType1) {
                System.out.println("Exceptie prinsa in nestB!");
            }
        }
    }

    public void nestC() throws ExceptionType1 {
        try {
            System.out.println("Salut din nestC!");
        } catch (Exception e) {
            if (e instanceof ExceptionType1) {
                System.out.println("Exceptie prinsa in nestC!");
                throw new ExceptionType1("bla3");
            }
        }
    }


    public void methodA() {
        try {
            methodB();
        } catch (Exception e) {
            if (e instanceof ExceptionType1) {
                System.out.println("ExceptionType1 catched!");
            }
        }
    }

    public void methodB() throws ExceptionType1 {
        methodC();
    }

    public void methodC() throws ExceptionType1 {
        throw new ExceptionType1("bla2");
    }

    public static void main(String args[]) {
        try{
            RunApp a = new RunApp();
            System.out.println("Propagation!");
            a.methodA();
            System.out.println("Nested!");
            a.nestA();
            System.out.println("With Resources!");
            a.tryWithResources();
            System.out.println("Try finnaly!");
            a.tryFinally();
        } catch(Exception e){
            System.out.println("HAHAHA");
        }

    }
}
