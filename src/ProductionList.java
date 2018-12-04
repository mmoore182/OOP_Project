/**
 * Matthew Moore
 * ProductionList.java
 * Creates and sorts an ArrayList containing products produced
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductionList {

  static List<Product> productList = new ArrayList<>();

  public ProductionList() {
    productList = new ArrayList<>();
  }

  public static void addProduct(Product p) {
    productList.add(p);
  }

  public static void removeProduct(Product p) {
    productList.remove(p);
  }

  /**
   * sortList sorts the product list by Serial number in ascending order.
   */

  public void sortList() {
    Collections.sort(productList, new Comparator<Product>() {
    @Override
    public int compare(Product p1, Product p2) {
      return p2.serialnumber - p1.serialnumber;
    }
  });
}

  /**
   * Prints the ordered contents of productList with name & serial number.
   */

  public static void print() {
    for (Product str: productList) {
      System.out.println(str);
    }
  }

}
