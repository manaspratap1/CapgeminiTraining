package controller;


import JDBC.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controllers {

    public void addProduct(int product_id, String product_name, String category,
                           double price, int quantity, double rating, String manufacturer) {

        String query = "INSERT INTO products (product_id, product_name, category, price, quantity, rating, manufacturer) VALUES (" + product_id + ", '" + product_name + "', '" + category + "', " + price + ", " + quantity + ", " + rating + ", '" + manufacturer + "')";

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()) {

            int rows = statement.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Product inserted successfully.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getAllProducts() {

        String query = "SELECT * FROM products";

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            while (rs.next()) {

                System.out.println("ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Rating: " + rs.getDouble("rating"));
                System.out.println("Manufacturer: " + rs.getString("manufacturer"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));
                System.out.println("----------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getProductById(int id) {

        String query = "SELECT * FROM products WHERE product_id = " + id;

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            if (rs.next()) {

                System.out.println("ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Rating: " + rs.getDouble("rating"));
                System.out.println("Manufacturer: " + rs.getString("manufacturer"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));

            } else {
                System.out.println("Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProductById(int id) {

        String query = "DELETE FROM products WHERE product_id = " + id;

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()) {

            int rows = statement.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateProduct(int id, double newPrice, int newQuantity, double newRating, String newManufacturer) {

        String query = "UPDATE products SET price = " + newPrice + ", quantity = " + newQuantity + ", rating = " + newRating + ", manufacturer = '" + newManufacturer + "'" + " WHERE product_id = " + id;

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()) {

            int rows = statement.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Product updated successfully.");
            } else {
                System.out.println("Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateProductPrice(int id, int newPrice){
        String query = "UPDATE products SET price = " + newPrice + " WHERE product_id = " + id;

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement()) {

            int rows = statement.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Product price updated successfully.");
            } else {
                System.out.println("Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void searchByName(String product_name){
        String query = "SELECT * FROM products WHERE product_name = " + product_name;

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            if (rs.next()) {

                System.out.println("ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Rating: " + rs.getDouble("rating"));
                System.out.println("Manufacturer: " + rs.getString("manufacturer"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));

            } else {
                System.out.println("Products not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchByCategory(String category){
        String query = "SELECT * FROM products WHERE category = "+ category;

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            if (rs.next()) {

                System.out.println("ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Rating: " + rs.getDouble("rating"));
                System.out.println("Manufacturer: " + rs.getString("manufacturer"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));

            } else {
                System.out.println("Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void topratedProducts(){

        String query = "SELECT * FROM products ORDER BY rating LIMIT 3";

        try (Connection conn = DBConnection.getConnection();
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery(query)) {

            if (rs.next()) {

                System.out.println("ID: " + rs.getInt("product_id"));
                System.out.println("Name: " + rs.getString("product_name"));
                System.out.println("Category: " + rs.getString("category"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Rating: " + rs.getDouble("rating"));
                System.out.println("Manufacturer: " + rs.getString("manufacturer"));
                System.out.println("Created At: " + rs.getTimestamp("created_at"));

            } else {
                System.out.println("Product not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
