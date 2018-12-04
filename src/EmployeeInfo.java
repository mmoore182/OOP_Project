/**
 * Matthew Moore EmployeeInfo.java
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  StringBuilder name;
  String code;
  String deptId;
  Pattern p = Pattern.compile("[A-Z][a-z]{3}[0-9]{2}");
  Scanner in;
  final String defaultCode = "Guest";

  /**
   * Constructor creates a new scanner object and accepts user input for employee name. Employee
   * name is checked for a space then assigned. Constructor also accepts input for department ID and
   * compares to the pattern set above. Department ID is set if valid.
   */

  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  public void setName() {

    System.out.println("Enter First and Last name");
    StringBuilder name = new StringBuilder(inputName());

    if (checkName(name) == true) {
      createEmployeeCode(name);
      return;
    } else {
      code = defaultCode;
      return;
    }
  }

  private void createEmployeeCode(StringBuilder name) {
    char firstLetter = name.charAt(0);

    String surName = name.substring(name.indexOf(" ") + 1);

    code = firstLetter + surName;

    return;
  }

  private String inputName() {
    String nameInput = in.nextLine();
    return nameInput;
  }

  private boolean checkName(StringBuilder name) {
    if (name.toString().contains(" ")) {
      return true;
    } else {
      System.out.println("Invalid Input, enter space between ");
      return false;
    }
  }

  public String getDeptId() {
    System.out.println("Please enter department ID: ");
    String id = in.nextLine();
    return id;
  }

  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = id;
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return this.deptId;
  }

  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    boolean matchFound = matcher.matches();
    return matchFound;
  }

  public String reverseString(String id) {
    if (id.isEmpty()) {
      return id;
    }
    return reverseString(id.substring(1)) + id.charAt(0);
  }

  public String toString() {
    return "Employee Code: " + this.code + "\n" +
        "Department ID: " + this.deptId + "\n";
  }
}
