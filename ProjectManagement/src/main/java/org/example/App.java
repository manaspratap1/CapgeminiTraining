package org.example;

import java.util.Scanner;
import controller.Controllers;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Controllers controller = new Controllers();

        while(true){
            System.out.println("Enter 1 to insert element: ");
            System.out.println("Enter 2 to view all element: ");
            System.out.println("Enter 3 to view product by id: ");
            System.out.println("Enter 4 to delete a product by id: ");
            System.out.println("Enter 5 to update a product by id: ");
            System.out.println("Enter 6 to update product price: ");
            System.out.println("Enter 7 to search by name: ");
            System.out.println("Enter 8 to search by category: ");
            System.out.println("Enter 9 to get top rated product");
            System.out.println("Enter 10 to exit: ");

            int preference = sc.nextInt();

            switch(preference){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Manufacturer: ");
                    String manufacturer = sc.nextLine();

                    controller.addProduct(id, name, category, price, quantity, rating, manufacturer);
                    break;

                case 2:
                    controller.getAllProducts();
                    break;

                case 3:
                    System.out.println("Enter the product id: ");
                    int prod_id = sc.nextInt();
                    controller.getProductById(prod_id);
                    break;

                case 4:
                    System.out.print("Enter Product ID to delete: ");
                    int deleteId = sc.nextInt();
                    controller.deleteProductById(deleteId);
                    break;

                case 5:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new price: ");
                    double newPrice = sc.nextDouble();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = sc.nextInt();

                    System.out.print("Enter Rating: ");
                    double newRating = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Manufacturer: ");
                    String newManufacturer = sc.nextLine();

                    controller.updateProduct(updateId, newPrice, newQuantity, newRating, newManufacturer);
                    break;

                case 6:
                    System.out.println("Enter the product_id: ");
                    int prod_Id = sc.nextInt();

                    System.out.println("Enter the new price of the product: ");
                    int new_price = sc.nextInt();

                    controller.updateProductPrice(prod_Id, new_price);
                    break;

                case 7:
                    System.out.println("Enter the name of product to search : ");

                    String product_name = sc.nextLine();

                    controller.searchByName(product_name);
                    break;

                case 8:
                    System.out.println("Enter the category to search: ");

                    String search_category = sc.nextLine();

                    controller.searchByCategory(search_category);
                    break;

                case 9:
                    controller.topratedProducts();
                    break;

                case 10:
                    System.exit(1);
            }


        }
    }
}
