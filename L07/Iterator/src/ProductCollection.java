import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private final List<Product> products = new ArrayList<>();
  public void add(Product product) {
    products.add(product);
  }

}
