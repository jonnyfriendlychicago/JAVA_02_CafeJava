public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, "; 
        String pendingMessage = ", your order will be ready shortly"; 
        String readyMessage = ", your order is ready"; 
        String displayTotalMessage = "Your total is $"; 

        double mochaPrice = 3.5; 
        double dripCoffee = 2.01; 
        double coffeeLatte = 500.5; 
        double cappuccino = 10000.9; 

        double twoCapps = cappuccino * 2; 

        double latteMinusCoffee = coffeeLatte - dripCoffee; 

        String customer1 = "Cindhuri"; 
        String customer2 = "Sam"; 
        String customer3 = "Jimmy"; 
        String customer4 = "Noah"; 

        boolean isReadyOrder1 = false; 
        boolean isReadyOrder2 = false; 
        boolean isReadyOrder3 = true; 
        boolean isReadyOrder4 = true; 

        // System.out.println(generalGreeting + customer1); 
        System.out.println(customer1 + pendingMessage); 

        System.out.println("next taskbox-------------------"); 

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage); 
            System.out.println(displayTotalMessage + cappuccino); 
        }

        else {
            System.out.println(customer4 + pendingMessage); 
        }

        System.out.println("next taskbox-------------------"); 

        System.out.println(displayTotalMessage + twoCapps); 
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage); 
        }

        else {
            System.out.println(customer2 + pendingMessage); 
        }
        
        System.out.println("next taskbox-------------------"); 

        System.out.println(displayTotalMessage + latteMinusCoffee); 


    }
}