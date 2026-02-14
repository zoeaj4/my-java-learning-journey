package oop.basics;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 * This program demonstrates Object-Oriented Programming concepts such as:
 * - Inheritance (Manager extends Employee)
 * - Method overriding (getSalary)
 * - Static variables (automatic ID generation)
 * - Polymorphism using an array of Employee objects
 * - Casting from Employee to Manager
 * It simulates a small company with employees and managers.
 */

public class Employee {

    private String name;
    private double salary;
    private Date hireDate;
    private static int nextId;
    private int id;

    // ===== CONSTRUCTORS =====

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;

        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDate = calendar.getTime();

        this.id = nextId;
        nextId++;
    }

    public Employee(String name) {
        this(name, 30000, 2000, 1, 1);
    }

    // ===== GETTERS AND SETTERS =====

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    // ===== METHODS =====

    public void raiseSalary(double percentage) {
        double increase = salary * percentage / 100;
        salary += increase;
    }

    // ===== MAIN =====

    public static void main(String[] args) {

        Manager hrBoss = new Manager("Aurelion Sol", 10, 1999, 10, 1);
        hrBoss.setBonus(1000);

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Darius", 85000, 1990, 12, 17);
        employees[1] = new Employee("Garen", 95000, 1995, 6, 2);
        employees[2] = new Employee("Renekton", 105000, 2002, 3, 15);
        employees[3] = new Employee("Akshan");
        employees[4] = new Employee("Kassadin");
        employees[5] = new Employee("Teemo");
        employees[6] = new Employee("Tristana");
        employees[7] = new Employee("Kennen");
        employees[8] = hrBoss;
        employees[9] = new Manager("Zoe", 100, 10, 10, 10);

        // Casting from Employee to Manager in order to use Manager-specific methods
        Manager financeManager = (Manager) employees[9];
        financeManager.setBonus(60);

        // This is not allowed (Employee is not necessarily a Manager)
        // Manager wrongCast = (Manager) employees[1];

        for (Employee e : employees) {
            System.out.println(
                "ID: " + e.getId() +
                " | Name: " + e.getName() +
                " | Salary: " + e.getSalary() +
                " | Hire date: " + e.getHireDate()
            );
        }
    }
}

class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

