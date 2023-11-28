interface OrderProcessor {
    void placeOrder(Order order);
    void cancelOrder(Order order);
}

class Order {
    private int orderId;
    private String orderItem;
    private double amount;

    public Order(int orderId, String orderItem, double amount) {
        this.orderId = orderId;
        this.orderItem = orderItem;
        this.amount = amount;
    }

    void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Item: " + orderItem);
        System.out.println("Amount: " + amount);
    }
}

class CreditCardProcessor implements OrderProcessor {
    @Override
    public void placeOrder(Order order) {
        System.out.println("Processing order with Credit Card...");
        System.out.println("Order Placed successfully with Credit Card.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cancelling order paid with Credit Card...");
        System.out.println("Order cancelled successfully for Credit Card payment.");
    }
}

class PayPalProcessor implements OrderProcessor {
    @Override
    public void placeOrder(Order order) {
        System.out.println("Processing order with PayPal...");
        System.out.println("Order Placed successfully with PayPal.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cancelling order paid with PayPal...");
        System.out.println("Order cancelled successfully for PayPal payment.");
    }
}

public class Interfacess {
    public static void main(String[] args) {
        Order order = new Order(10118, "Cheese Burst Pizza (Large)", 600.00);

        OrderProcessor orderProcessor;

        orderProcessor = new CreditCardProcessor();
        orderProcessor.placeOrder(order);
        orderProcessor.cancelOrder(order);

        orderProcessor = new PayPalProcessor();
        orderProcessor.placeOrder(order);
        orderProcessor.cancelOrder(order);
    }
}

/*
Interface is used to provide a 100% abstraction.
All the methods in an interface are abstract by default. (without body)
All the variables declared in an interface are public, static & final by default.

Tasks: any 5

Scenario 1: Payment Gateway Integration
Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.

Scenario 2: Messaging Service Integration
Develop an interface called "MessagingService" with methods like "sendMessage" and "receiveMessage." Implement classes like "EmailService" and "SMSService" that provide specific implementations for these interface methods.

Scenario 3: Database Connectivity
Create an interface called "DatabaseConnection" with methods like "connect" and "disconnect." Implement classes like "MySQLConnection" and "PostgreSQLConnection" that provide specific implementations for these interface methods.

Scenario 4: Online Ordering System
Design an interface called "OrderProcessor" with methods like "placeOrder" and "cancelOrder." Implement classes like "CreditCardProcessor" and "PayPalProcessor" that provide specific implementations for these interface methods.

Scenario 5: Travel Booking System
Develop an interface called "TravelBooking" with methods like "bookTicket" and "cancelBooking." Implement classes like "FlightBooking" and "HotelBooking" that provide specific implementations for these interface methods.

Scenario 6: Social Media Integration
Create an interface called "SocialMediaIntegration" with methods like "sharePost" and "likePost." Implement classes like "FacebookIntegration" and "TwitterIntegration" that provide specific implementations for these interface methods.

Scenario 7: Geolocation Services
Design an interface called "GeolocationService" with methods like "getCurrentLocation" and "calculateDistance." Implement classes like "GoogleMapsService" and "HereMapsService" that provide specific implementations for these interface methods.

Scenario 8: File Processing Application
Develop an interface called "FileProcessor" with methods like "readFile" and "writeFile." Implement classes like "TextFileProcessor" and "CSVFileProcessor" that provide specific implementations for these interface methods.

Scenario 9: Online Music Streaming
Create an interface called "MusicPlayer" with methods like "playSong" and "stopSong." Implement classes like "SpotifyPlayer" and "AppleMusicPlayer" that provide specific implementations for these interface methods.

Scenario 10: Weather Forecast Service
Design an interface called "WeatherService" with methods like "getCurrentWeather" and "getForecast." Implement classes like "OpenWeatherMapService" and "AccuWeatherService" that provide specific implementations for these interface methods.

*/