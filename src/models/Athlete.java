package models;

public class Athlete {

  private String name;
  private int points;
  private boolean isStarter;
  public Athlete(String name, int ponts, boolean isStarter) {
    this.name = name;
    this.points = ponts;
    this.isStarter = isStarter;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPoints() {
    return points;
  }
  public void setPoints(int ponts) {
    this.points = ponts;
  }
  public boolean isStarter() {
    return isStarter;
  }
  public void setStarter(boolean isStarter) {
    this.isStarter = isStarter;
  }

  @Override
  public String toString() {
    return "Athlete [name=" + name + ", ponts=" + points + ", isStarter=" + isStarter + "]";
  }

}
