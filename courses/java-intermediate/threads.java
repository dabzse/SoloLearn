class Main {
    public static void main(String[ ] args) {
        Name name = new Name();
        // set priority
        name.setPriority(1);

        Welcome welcome = new Welcome();
        // set priority
        welcome.setPriority(10);

        name.start();
        welcome.start();
    }
}

// extend the Thread class
class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}

// extend the Thread class
class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}