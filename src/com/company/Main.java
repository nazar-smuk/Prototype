package com.company;

public class Main {

    public static void main(String[] args) {

        // test commit
        // test commit 2
        // test commit 3

        Employer employer = new Employer("Nazar", 24);

        Employer employer1 = employer.clone();

        System.out.println(employer.getAge());
        System.out.println(employer1.getAge());

        System.out.println(employer == employer1);
    }
}
