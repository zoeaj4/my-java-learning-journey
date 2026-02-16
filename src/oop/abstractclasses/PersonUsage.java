package oop.abstractclasses;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 * I understand how abstract classes work in Java and I am practicing them.
 * This program shows how an abstract class (Person) can be extended by
 * different subclasses (Employee and Student), each one implementing
 * its own version of the abstract method getDescription().
 */

public class PersonUsage {

    public static void main(String[] args) {

        Person[] people = new Person[2];
        people[0] = new Employee("Luis", 5000, 2009, 2, 25);
        people[1] = new Student("Ana", "Accounting");

        for (Person p : people) {
            System.out.println(p.getName());
            System.out.println(p.getDescription());
        }
    }
}

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getDescription();
}

class Employee extends Person {

    private double salary;
    private Date hireDate;
    private static int nextId;
    private int id;

    // ===== CONSTRUCTOR =====
    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDate = calendar.getTime();

        this.id = nextId;
        nextId++;
    }

    // ===== METHODS =====
    public String getDescription() {
        return "This employee has an ID = " + id + " and a salary of: " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }

    public void raiseSalary(double percentage) {
        double increase = salary * percentage / 100;
        salary += increase;
    }
}

class Student extends Person {

    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "This student is studying: " + major;
    }
}
