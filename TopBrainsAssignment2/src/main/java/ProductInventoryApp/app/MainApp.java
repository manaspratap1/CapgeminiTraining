package ProductInventoryApp.app;

import ProductInventoryApp.dao.ProductDAO;
import ProductInventoryApp.model.Product;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();

        int choice;

        do{

            System.out.println("\n===== PRODUCT INVENTORY MENU =====");

            System.out.println("1 Add Product");
            System.out.println("2 View All Products");
            System.out.println("3 View Product By ID");
            System.out.println("4 Update Product Price");
            System.out.println("5 Update Product Quantity");
            System.out.println("6 Delete Product");
            System.out.println("7 Search Product");
            System.out.println("8 Low Stock Products");
            System.out.println("9 Exit");

            choice=sc.nextInt();

            switch(choice){

                case 1:

                    System.out.println("Enter ID:");
                    int id=sc.nextInt();

                    System.out.println("Enter Name:");
                    String name=sc.next();

                    System.out.println("Enter Category:");
                    String cat=sc.next();

                    System.out.println("Enter Price:");
                    double price=sc.nextDouble();

                    System.out.println("Enter Quantity:");
                    int qty=sc.nextInt();

                    System.out.println("Enter Rating:");
                    double rating=sc.nextDouble();

                    Product p=new Product(id,name,cat,price,qty,rating);

                    dao.addProduct(p);

                    break;

                case 2:
                    dao.viewAllProducts();
                    break;

                case 3:

                    System.out.println("Enter ID:");
                    dao.viewProductById(sc.nextInt());
                    break;

                case 4:

                    System.out.println("Enter ID:");
                    int pid=sc.nextInt();

                    System.out.println("Enter new price:");
                    double np=sc.nextDouble();

                    dao.updatePrice(pid,np);
                    break;

                case 5:

                    System.out.println("Enter ID:");
                    int qid=sc.nextInt();

                    System.out.println("Enter new quantity:");
                    int nq=sc.nextInt();

                    dao.updateQuantity(qid,nq);
                    break;

                case 6:

                    System.out.println("Enter ID:");
                    dao.deleteProduct(sc.nextInt());
                    break;

                case 7:

                    System.out.println("Enter keyword:");
                    dao.searchProduct(sc.next());
                    break;

                case 8:
                    dao.lowStock();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");

            }

        }while(choice!=9);
    }
}