import java.util.Scanner;

public class HotelMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int quantity = 0;
        float price = 0;

        System.out.println("---------------------------------");
        System.out.println("Welcome to the Hotel California!");
        System.out.println("---------------------------------");
        System.out.println("1. Breakfast Menu");
        System.out.println("2. Lunch Menu");
        System.out.println("3. Dinner Menu");
        System.out.println("4. Snacks Menu");
        System.out.println("5. Dessert Menu");
        System.out.println("6. Drinks Menu");
        System.out.print("Please select an option from the menu: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("--------------------");
                System.out.println("Breakfast Menu");
                System.out.println("--------------------");
                System.out.println("1. Dosa");
                System.out.println("2. Upma");
                System.out.println("3. Idli");
                System.out.println("4. Poha");
                System.out.println("5. Paratha");
                System.out.print("Please select an option from the menu: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Dosa -> $7.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*7.99;
                        System.out.println("You've ordered " + quantity + " plates of dosa. and your total is $" + price);
                        break;

                    case 2:
                        System.out.println("Upma -> $5.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*5.99;
                        System.out.println("You've ordered " + quantity + " plates of upma. and your total is $" + price);
                        break;

                    case 3:
                        System.out.println("Idli -> $6.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*6.99;
                        System.out.println("You've ordered " + quantity + " plates of idli. and your total is $" + price);
                        break;

                    case 4:
                        System.out.println("Poha -> $4.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*4.99;
                        System.out.println("You've ordered " + quantity + " plates of poha. and your total is $" + price);
                        break;

                    case 5:
                        System.out.println("Paratha -> $8.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*8.99;
                        System.out.println("You've ordered " + quantity + " plates of paratha. and your total is $" + price);
                        break;

                    default:
                        System.out.println("Invalid choice for breakfast menu.");
                }
                break;  
            // ending case 1

            case 2:
                System.out.println("--------------------");
                System.out.println("Lunch Menu");
                System.out.println("--------------------");
                System.out.println("1. Dal Makhani");
                System.out.println("2. Paneer Butter Masala");
                System.out.println("3. Chole Bhature");
                System.out.println("4. Rajma Chawal");
                System.out.println("5. Kadhi Chawal");
                System.out.print("Please select an option from the menu: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Dal Makhani -> $9.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*9.99;
                        System.out.println("You've ordered " + quantity + " plates of dal makhani. and your total is $" + price);
                        break;

                    case 2:
                        System.out.println("Paneer Butter Masala -> $11.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*11.99;
                        System.out.println("You've ordered " + quantity + " plates of paneer butter masala. and your total is $" + price);
                        break;

                    case 3:
                        System.out.println("Chole Bhature -> $8.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*8.99;
                        System.out.println("You've ordered " + quantity + " plates of chole bhature. and your total is $" + price);
                        break;

                    case 4:
                        System.out.println("Rajma Chawal -> $10.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*10.99;
                        System.out.println("You've ordered " + quantity + " plates of rajma chawal. and your total is $" + price);
                        break;

                    case 5:
                        System.out.println("Kadhi Chawal -> $9.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*9.99;
                        System.out.println("You've ordered " + quantity + " plates of kadhi chawal. and your total is $" + price);
                        break;

                    default:
                        System.out.println("Invalid choice for lunch menu.");
                }
                break;
            // ending case 2

            case 3:
                System.out.println("--------------------");
                System.out.println("Dinner Menu");
                System.out.println("--------------------");
                System.out.println("1. Veg Biryani");
                System.out.println("2. Chana Masala");
                System.out.println("3. Curd Rice");
                System.out.println("4. Aloo Paratha");
                System.out.println("5. Veg Pulao");
                System.out.print("Please select an option from the menu: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Veg Biryani -> $12.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*12.99;
                        System.out.println("You've ordered " + quantity + " plates of veg biryani. and your total is $" + price);
                        break;

                    case 2:
                        System.out.println("Chana Masala -> $9.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*9.99;
                        System.out.println("You've ordered " + quantity + " plates of chana masala. and your total is $" + price);
                        break;

                    case 3:
                        System.out.println("Curd Rice -> $7.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*7.99;
                        System.out.println("You've ordered " + quantity + " plates of curd rice. and your total is $" + price);
                        break;

                    case 4:
                        System.out.println("Aloo Paratha -> $8.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*8.99;
                        System.out.println("You've ordered " + quantity + " plates of aloo paratha. and your total is $" + price);
                        break;

                    case 5:
                        System.out.println("Veg Pulao -> $11.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*11.99;
                        System.out.println("You've ordered " + quantity + " plates of veg pulao. and your total is $" + price);
                        break;

                    default:
                        System.out.println("Invalid choice for dinner menu.");
                }
                break;
            // ending case 3

            case 4:
                System.out.println("--------------------");
                System.out.println("Snacks Menu");
                System.out.println("--------------------");
                System.out.println("1. Samosa");
                System.out.println("2. Vada Pav");
                System.out.println("3. Pani Puri");
                System.out.println("4. Bhel Puri");
                System.out.println("5. Pav Bhaji");
                System.out.print("Please select an option from the menu: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Samosa -> $3.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*3.99;
                        System.out.println("You've ordered " + quantity + " plates of samosa. and your total is $" + price);
                        break;

                    case 2:
                        System.out.println("Vada Pav -> $4.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*4.99;
                        System.out.println("You've ordered " + quantity + " plates of vada pav. and your total is $" + price);
                        break;

                    case 3:
                        System.out.println("Pani Puri -> $5.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*5.99;
                        System.out.println("You've ordered " + quantity + " plates of pani puri. and your total is $" + price);
                        break;

                    case 4:
                        System.out.println("Bhel Puri -> $6.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*6.99;
                        System.out.println("You've ordered " + quantity + " plates of bhel puri. and your total is $" + price);
                        break;

                    case 5:
                        System.out.println("Pav Bhaji -> $7.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*7.99;
                        System.out.println("You've ordered " + quantity + " plates of pav bhaji. and your total is $" + price);
                        break;

                    default:
                        System.out.println("Invalid choice for snacks menu.");
                }
                break;
            // ending case 4

            case 5:
                System.out.println("--------------------");
                System.out.println("Dessert Menu");
                System.out.println("--------------------");
                System.out.println("1. Gulab Jamun");
                System.out.println("2. Rasgulla");
                System.out.println("3. Kheer");
                System.out.println("4. Jalebi");
                System.out.println("5. Kulfi");
                System.out.print("Please select an option from the menu: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Gulab Jamun -> $3.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*3.99;
                        System.out.println("You've ordered " + quantity + " plates of gulab jamun. and your total is $" + price);
                        break;

                    case 2:
                        System.out.println("Rasgulla -> $4.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*4.99;
                        System.out.println("You've ordered " + quantity + " plates of rasgulla. and your total is $" + price);
                        break;

                    case 3:
                        System.out.println("Kheer -> $5.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*5.99;
                        System.out.println("You've ordered " + quantity + " plates of kheer. and your total is $" + price);
                        break;

                    case 4:
                        System.out.println("Jalebi -> $6.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*6.99;
                        System.out.println("You've ordered " + quantity + " plates of jalebi. and your total is $" + price);
                        break;

                    case 5:
                        System.out.println("Kulfi -> $7.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*7.99;
                        System.out.println("You've ordered " + quantity + " plates of kulfi. and your total is $" + price);
                        break;

                    default:
                        System.out.println("Invalid choice for dessert menu.");
                }
                break;
            // ending case 5

            case 6:
                System.out.println("--------------------");
                System.out.println("Drinks Menu");
                System.out.println("--------------------");
                System.out.println("1. Water");
                System.out.println("2. Soda");
                System.out.println("3. Juice");
                System.out.println("4. Milkshake");
                System.out.println("5. Coffee");
                System.out.print("Please select an option from the menu: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Water -> $1.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*1.99;
                        System.out.println("You've ordered " + quantity + " bottles of water. and your total is $" + price);
                        break;

                    case 2:
                        System.out.println("Soda -> $2.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*2.99;
                        System.out.println("You've ordered " + quantity + " bottles of soda. and your total is $" + price);
                        break;

                    case 3:
                        System.out.println("Juice -> $3.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*3.99;
                        System.out.println("You've ordered " + quantity + " bottles of juice. and your total is $" + price);
                        break;

                    case 4:
                        System.out.println("Milkshake -> $4.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*4.99;
                        System.out.println("You've ordered " + quantity + " bottles of milkshake. and your total is $" + price);
                        break;

                    case 5:
                        System.out.println("Coffee -> $5.99");
                        System.out.print("Please enter the quantity you would like to order: ");
                        quantity = sc.nextInt();
                        price += quantity*5.99;
                        System.out.println("You've ordered " + quantity + " bottles of coffee. and your total is $" + price);
                        break;

                    default:
                        System.out.println("Invalid choice for drinks menu.");
                }
                break;
            // ending case 6

            default:
                System.out.println("Invalid choice for menu.");
        }
        // ending switch statement
    }
}


/*
Task:


--------------------------------------------------
Welcome to the Exquisite Spice Indian Restaurant!
--------------------------------------------------
1. Appetizers
2. Main Courses
3. Desserts
4. Beverages
5. Exit
Please select an option from the menu: 1
--------------------
Appetizers Menu
--------------------
1. Samosa
2. Pakora
3. Aloo Tikki
4. Paneer Tikka
5. Spring Rolls
Please select an option from the menu: 3
Aloo Tikki -> $5.99

--------------------------------------------------
Welcome to the Exquisite Spice Indian Restaurant!
--------------------------------------------------
1. Appetizers
2. Main Courses
3. Desserts
4. Beverages
5. Exit
Please select an option from the menu: 2
--------------------
Main Courses Menu
--------------------
1. Butter Chicken
2. Biryani
3. Saag Paneer
4. Tandoori Roti
5. Chana Masala
Please select an option from the menu: 1
Butter Chicken -> $14.99

--------------------------------------------------
Welcome to the Exquisite Spice Indian Restaurant!
--------------------------------------------------
1. Appetizers
2. Main Courses
3. Desserts
4. Beverages
5. Exit
Please select an option from the menu: 3
--------------------
Desserts Menu
--------------------
1. Gulab Jamun
2. Rasgulla
3. Kheer
4. Jalebi
5. Kulfi
Please select an option from the menu: 2
Rasgulla -> $4.99

--------------------------------------------------
Welcome to the Exquisite Spice Indian Restaurant!
--------------------------------------------------
1. Appetizers
2. Main Courses
3. Desserts
4. Beverages
5. Exit
Please select an option from the menu: 4
--------------------
Beverages Menu
--------------------
1. Masala Chai
2. Mango Lassi
3. Fresh Coconut Water
4. Rose Sharbat
5. Coffee
Please select an option from the menu: 5
Coffee -> $3.99

--------------------------------------------------
Welcome to the Exquisite Spice Indian Restaurant!
--------------------------------------------------
1. Appetizers
2. Main Courses
3. Desserts
4. Beverages
5. Exit
Please select an option from the menu: 5
Thank you for dining with us!
*/