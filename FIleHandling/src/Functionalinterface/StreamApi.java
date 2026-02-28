package Functionalinterface;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
    public static <by> void main(String[] args) {
        List<String> immutableList = Stream.of("red", "green", null, null).toList();
        System.out.println(immutableList);

//        immutableList.add("yellow");

        System.out.println("------------------     ");

        List<String> mutableList = Stream.of("red", "green", null, null).collect(Collectors.toList());
        System.out.println(mutableList);
        mutableList.add("orange");
        mutableList.set(2, "yellow");
        System.out.println(mutableList);
        System.out.println("-----------------       ");

        record Product(String name, String category, int price){
        }
        Stream<Product> products = Stream.of(new Product("bat", "sportsItem", 4000),
                new Product("bells", "sportsItem", 4200),
                new Product("ball", "sportsItem", 3200),
                new Product("mobile", "electronics", 5500),
                new Product("banana", "fruit", 200),
                new Product("apple", "fruit", 400));

// Group by method
//        Map<String, List<Product>> categoryMap = products.collect(Collectors.groupingBy(Product::category));
//        System.out.println(categoryMap);

//        Map<String, Double> pricing = products.collect(Collectors.groupingBy(Product::category, Collectors.averagingDouble(Product::price)));
//        System.out.println(pricing);

//        List<Product> filtered = products.filter(Product->Product.price>2500).collect(Collectors.toList());
//        System.out.println(filtered);

//        var extractfields = products.map(Product::price).toList();
//        System.out.println(extractfields);

//        Map<Boolean, List<Product>> part = products.collect(Collectors.partitioningBy(Product->Product.price>1000));
//        System.out.println(part);

//        System.out.println(products.collect(Collectors.summarizingInt(Product::price)));
    }
}
