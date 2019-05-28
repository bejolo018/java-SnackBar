package snackBarApp;

;

public class Customer {
  // fields
  private static int maxId = 0;
  private int id;
  private String name;
  private double cash;

  // constructors
  public Customer(String name, double cash) {
    maxId++;
    id = maxId;

    this.name = name;
    this.cash = cash;
  }

  // methods
  public String getName() {
    return name;
  }

  public double getCash() {
    return cash;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCash(double cash) {
    this.cash = cash;
  }

}