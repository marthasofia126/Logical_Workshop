public class DeliveryFee {
    private static final double DELIVERY_FEE = 5;
    public static void main (String[] args) {
        double subtotal = 50;
        boolean membership = false;
        boolean free_delivery = (subtotal >= 30) && membership || subtotal >= 50;
        if (subtotal < 0){
            System.out.println("Invalid subtotal");
        }else {
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            if (free_delivery){
                System.out.println("Delivery fee: $0.00");
                System.out.printf("Total: $%.2f%n", subtotal);
            }else {
                System.out.printf("Delivery fee: $%.2f%n", DELIVERY_FEE);
                System.out.printf("Total: $%.2f%n", (subtotal + DELIVERY_FEE));
            }
        }
    }
}
