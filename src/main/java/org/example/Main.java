package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        try {
            Injector injector = Guice.createInjector(new BankModule());
            App app = injector.getInstance(App.class);
            app.run();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (Throwable e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }
}