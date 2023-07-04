// be attentive to access modifiers
class Standard {
    protected void draw() {
        System.out.println("Drawing");
    }
    public void write() {
        System.out.println("Writing");
    }
}

// fix the class
class Pro extends Standard {
    protected void useEffects() {
        System.out.println("Using Effects");
    }

    protected void changeResolution() {
        System.out.println("Changing Resolution");
    }
}

class Main {
/** The public type Main must be defined in its own file: Java(16777541)
 * it was:
 * public class Main {}
 * so I just removed the `public` and now shows no errors
*/
    public static void main(String[] args) {
        Standard standard1 = new Standard();
        Pro pro1 = new Pro();

        // standard version
        standard1.draw();
        standard1.write();
        // Pro version
        pro1.draw();
        pro1.write();
        pro1.useEffects();
        pro1.changeResolution();
    }
}