package com.company;
import java.util.Scanner;

public class Main {

    static public class Product {
        String name;
        String id;
        float price;
        int quantiiy;
        int selfNuml;
    }
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
    Product p = new Product();
    Product p2 = new Product();
    Product p3 = new Product();
    Product p4 = new Product();

    p.name = "milk";p2.name = "juice"; p3.name = "rice";p4.name = "suger";
    p.price = 10; p2.price = 5;p3.price = 15; p4.price = 17;
     p.id = "3432";p2.id = "332"; p3.id = "125"; p4.id = "102";
    p.quantiiy = 100; p2.quantiiy = 150;p3.quantiiy = 70;p4.quantiiy = 160;
    p.selfNuml = 6; p2.selfNuml = 1;p3.selfNuml = 5;p4.selfNuml = 9;

    // creating array contains the for products;
    Product[] products = {p, p2, p3, p4};
    System.out.println("What do you want to do\n 1: Buy\n 2: Search");
    int choice = in.nextInt();
    switch(choice){
        case 1:
            int sum = 0;
            while(true) {
                int i = 1;
                for (Product a : products) {
                    System.out.println(i + " --> " + a.name + "  price( " + a.price + ")");
                    i++;
                }
                System.out.println("Enter the number of price  OR Enter to -1 to finish shopping");
                int productNum = in.nextInt();
                if(productNum == -1)
                    break;
                Product temp = products[productNum - 1];
                System.out.println("Enter the amount of the product");
                int productQuantity = in.nextInt();
                sum += temp.price * productQuantity;

            }
            System.out.println("you have pay " + sum + "LE");
            break;
        case 2:
            in.nextLine();
            System.out.println("Enter the product name");
            String name = in.nextLine();
            for(Product a: products){
                if(a.name.equalsIgnoreCase(name)){
                    System.out.println("product name  " + a.name +"\n"+"product price " + a.price + "\n" +"product locations at self number   " + a.selfNuml);
                }
            }
            break;

        default:
            System.out.println("invalid choice");
            break;
    }
}
}
