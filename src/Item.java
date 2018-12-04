/**
 * Matthew Moore
 * Item.java
 */

import java.util.Date;

public interface Item {

  final String manufacturer = "OracleProduction";

  void setProductionNumber(
      int prodNum);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  public int getSerialNumber();

}

