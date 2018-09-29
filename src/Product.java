/**
 * Matthew Moore
 * Product.java
 */

import java.util.Date;

public abstract class Product implements Item {

  int serialnumber;
  String manufacturer;
  Date manufacturedOn;
  String name;
  static Integer currentProductionNumber = 0;

  /**
   * Constructor takes product name and sets the field name.
   * Assigns manufacturer and serial number then
   * increments production number by 1.
   * Sets manufacturedOn to current date and time.
   */

  public Product(String name) {
    this.name = name;
    this.manufacturer = Item.manufacturer;
    serialnumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date(System.currentTimeMillis());
  }

  public void setProductionNumber(int prodNum) {
    currentProductionNumber = prodNum;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;              // Project requires you to return a date.
  }

  public int getSerialnumber() {
    return serialnumber;
  }


  /**
   * toString returns Manufacturer, Serial number, Date, and product name in organized table.
   */

  @Override
  public String toString() {
    return "Manufacturer: " + manufacturer + "\n"
        + "Serial Number: " + serialnumber + "\n"
        + "Date: " + manufacturedOn + "\n"
        + "Name: " + name + "\n";

  }
}
