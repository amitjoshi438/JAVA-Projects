package machine;
import java.util.*;
public class CoffeeMachine {

        static int water = 400;
        static int milk = 540;
        static int beans = 120;
        static int cups = 9;
        static int money = 550;
    static void menu(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner sc = new Scanner(System.in);
        String action = sc.next();
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                display();
            case "exit":
                break;
            default:
                break;
        }
    }
    static void display () {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
        System.out.println();
        menu();
    }

    
    static void buy () {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        
        switch (choice) {
            case "1":
                if(water >= 250 && beans >= 16 && cups >= 1){
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    cups -= 1;
                }
                else
                    System.out.println("Sorry, not enough water!");
                break;
            case "2":
                if(water >= 350 && beans >= 20 && cups >= 1 && milk >= 75){
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    cups -= 1;
                }
                else
                  System.out.println("Sorry, not enough water!");  
                break;
            case "3":
                if(water >= 200 && beans >= 12 && cups >= 1 && milk >= 100){
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    cups -= 1;
                }
                else
                  System.out.println("Sorry, not enough water!"); 
                break;
            case "back":
                break;
            default:
                break;
        } 
        menu();    
    }
  
    static void fill () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int waterFill = sc.nextInt();
        water += waterFill;
        System.out.println("Write how many ml of milk do you want to add:");
        int milkFill = sc.nextInt();
        milk += milkFill;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beansFill = sc.nextInt();
        beans += beansFill;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int cupsFill = sc.nextInt() ;
        cups += cupsFill;
        menu();
    }
    
    static void take(){
        System.out.println("I gave you " + money);
        System.out.println();
        money = 0;
        menu();
    }
    
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        
        menu();
    }
}
