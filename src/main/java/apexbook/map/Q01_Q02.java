package apexbook.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q01_Q02 {


//    There is a Map which contains product names as key and number of the products as value.
//    Type code to find the total number of products.

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Collection<Integer> num = product.values();

        int sum = 0;
        for (int w : num) {
            sum += w;
        }
        System.out.println("sum = " + sum);


        Set<String> name = product.keySet();
        System.out.println("name = " + name);

//        There is a Map which contains product names as key and number of the products as value.
//        Type code to check if ‘Laptop’ is among the products.

        String productKey = "Mobile";

        if (name.contains(productKey)) {
            System.out.println(productKey + " exists in the Map");
        } else {
            System.out.println(productKey + " doesn't exist");
        }

    }
}
