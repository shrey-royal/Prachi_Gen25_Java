class Configuration {
    //system settings
    private final String DB_URL = "DATABASE_URL";
    private final String DB_USERNAME = "DATABASE_USERNAME";
    private final String DB_PASSWORD = "DATABASE_PASSWORD";

    //getter methods
    public String getDB_URL() {
        return DB_URL;
    }

    public String getDB_USERNAME() {
        return DB_USERNAME;
    }

    public String getDB_PASSWORD() {
        return DB_PASSWORD;
    }
}


public class FinalKW {
    public static void main(String[] args) {
        Configuration c = new Configuration();
        System.out.println("Database URL: " + c.getDB_URL());
        System.out.println("Database USERNAME: " + c.getDB_USERNAME());
        System.out.println("Database PASSWORD: " + c.getDB_PASSWORD());
    }
}

/*
If i want something constant, i can use final keyword.

final variables cannot be changed once assigned a value.

Tasks:

Scenario 1: Math Calculations
In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.

Scenario 2: Database Connectivity
In a database connectivity framework, define a class called "DatabaseConnection" with a final variable for the database connection URL. This variable cannot be modified and represents the fixed database connection URL.

Scenario 3: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

Scenario 4: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

*/