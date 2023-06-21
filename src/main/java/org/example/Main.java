package org.example;



public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        Save save = new Persister(user);
        save.save();

        Reportable reportable = new ReportUser(user);
        reportable.report();
    }
}