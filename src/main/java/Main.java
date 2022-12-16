import com.google.protobuf.Value;

import javax.lang.model.element.Name;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        ProductUtil.getAllProducts()
                .stream()
                .forEach(product -> System.out.println(product));

        ProductUtil.updateProducts(2, "CocaCola_Zero");

        ProductUtil.getAllProducts()
                .stream()
                .forEach(product -> System.out.println(product));


        Map<String, Integer> product = new HashMap<>();

    }
}