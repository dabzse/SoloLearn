import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        // set customer's data to object here
        customer.firstName = firstName;
        customer.secondName = secondName;
        customer.age = age;
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
    }
}

class Customer {
    // add all necessary attributes here
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}


/**
 * OR you can use this solution as well

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer(firstName, secondName, age, roomNumber);
        customer.saveCustomerInfo();
    }
}

class Customer {
    // add all necessary attributes here
    String firstName;
    String secondName;
    int age;
    int roomNumber;

    public Customer(String f, String s, int a, int r) {
        firstName = f;
        secondName = s;
        age = a;
        roomNumber = r;
    }

    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
}

*/