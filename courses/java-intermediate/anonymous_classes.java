class Main {
/** The public type Main must be defined in its own file: Java(16777541)
 * it was:
 * public class Main {}
 * so I just removed the `public` and now shows no errors
*/
    public static void main(String[] args) {
        Purchase customer = new Purchase();
        Purchase specialCustomer = new Purchase() {
            // your code goes here
            public int totalAmount (int price) {
                return price-(price*20)/100;
            }
        };

        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
    }
}

class Purchase {
    int price;
    public int totalAmount(int price) {
        return price - (price*10)/100;
    }
}