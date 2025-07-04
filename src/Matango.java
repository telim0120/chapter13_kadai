public class Matango {
  private int hp;
  private final int LEVEL = 10;
  private char suffix;
  private int counterDamage = 100;

  public Matango(char suffix, int hp) {
    this.suffix = suffix;
    this.hp = hp;
  }

  public char getSuffix() {
    return this.suffix;
  }

  public int getCounterDamage() {
    return this.counterDamage;
  }

  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }
}