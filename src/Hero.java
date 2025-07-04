public class Hero {
  private int hp;
  private String name;

  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name == null || name.length() < 2 || name.length() > 8) {
      throw new IllegalArgumentException("名前の長さが不正です。");
    }
    this.name = name;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    if (hp < 0) {
      this.die();
    } else {
      this.hp = hp;
    }
  }

  public void bye() {
    System.out.println("勇者は別れを告げた");
  }

  private void die() {
    System.out.println(this.name + "は死んでしまった！");
    System.out.println("GAME OVERです。");
  }

  public void sleep() {
    this.setHp(100);
    System.out.println(this.name + "は、眠って回復した！");
  }

  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("お化けキノコ" + m.getSuffix() + "から" + m.getCounterDamage() + "ポイントの反撃を受けた");
    this.setHp(this.getHp() - m.getCounterDamage());
  }
}