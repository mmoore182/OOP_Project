/**
 * Matthew Moore CollectionsDriver.java Demonstrates the productList ArrayListt
 */

public class CollectionsDriver {

  public static void testCollect() {
    MoviePlayer mp = new MoviePlayer("DBPOWER MK101", new Screen("720x480", 40, 22), MonitorType.LCD);
    AudioPlayer ap = new AudioPlayer("Pyle PDV156BK", "Specification");

    ProductionList.addProduct(mp);
    ProductionList.addProduct(ap);
    ProductionList.addProduct(new MoviePlayer("DBPOWER MK101", new Screen("720x480", 40, 22), MonitorType.LCD));
    ProductionList.addProduct(new AudioPlayer("Pyle PDV156BK", "Spec"));

    ProductionList.print();
  }
}

