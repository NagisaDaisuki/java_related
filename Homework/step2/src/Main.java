// ==========================================
// 1. 封装 (Encapsulation)：保护私有财产
// ==========================================

class Hero {
  // 封装： 属性全部 private，防止外部直接修改
  private String name;
  private int hp;

  // this的用处：区分局部变量和成员变量
  public Hero(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }

  // 开放 public 的方法給外部调用
  public void attack() {
    System.out.println(this.name + " 挥舞物理武器攻击！");
  }

  // final的用处（修饰方法）：绝对防御！
  // 加上 final 后，任何继承 Hero 的子类，都绝对不准重写（篡改）死亡逻辑
  public final void die() {
    System.out.println(this.name + " 的 HP 归零，化作了光...");
  }
}

// ==========================================
// 2. 继承 (Inheritance)：子承父业
// ==========================================
// Mage（法师）继承了 Hero（英雄），自动拥有了 name 和 hp

class Mage extends Hero {
  private int mana; // 法师独有的蓝量

  public Mage(String name, int hp, int mana) {
    // super 的用处1：调用父类的构造方法
    // 既然继承了爹，初始化时必须先帮爹把属性弄好，这句必须放在第一行！
    super(name, hp);
    this.mana = mana;
  }

  // ==========================================
  // 3. 多态 (Polymorphism) 的核心：方法重写 (Override)
  // ==========================================

  @Override
  public void attack() {
    // super 的用处2：保留父类的基础行为
    super.attack();
    // 然后加上子类独有的行为
    System.out.println("并且消耗 " + this.mana + " 点发力，追加了一发爆裂魔法！");
  }
}

// final 的用处（修饰类）：断子绝孙！
// 加上 final 后，再也没有任何类能继承 Boss 了（比如 Java 里的 String 类就是 final 的）

final class Boss extends Hero {
  public Boss(String name, int hp) {
    super(name, hp);
  }
}

// 由于 java 只允许单继承 extends ，避免出现 c++ 中的 “菱形继承问题”
// 但是现实世界中确实存在“多重身份”的需求。比如一个 “超级英雄”既是一个
// “人类”，又是一个“飞行者”
//
// Java 使用 接口替代继承实现多继承（实现多个接口）

// 父类（亲爹）只能有一个
class Human {
  public void eat() {
    System.out.println("吃饭");
  }
}

// 技能包（接口，可以有无数个）
interface Flyable {
  void fly(); // 接口里只有规则没有具体的逻辑实现
}

interface Shootable {
  void shoot();
}

// 超级英雄：继承一个亲爹，挂载多个技能包
class SuperHero extends Human implements Flyable, Shootable {
  // 继承了爹的 eat()，不用重写

  // 必须自己实现干爹们规定的技能
  @Override
  public void fly() {
    System.out.println("披上斗篷飞！");
  }

  @Override
  public void shoot() {
    System.out.println("发射激光！");
  }
}

public class Main {
  public static void main(String[] args) {
    // 多态的终极展现：父类引用，指向子类对象！
    // 电脑只知道 p1 和 p2 都是英雄，但真正运行的时候，它们展现除了不同的形态。
    Hero p1 = new Hero("普通剑士", 100);
    Hero p2 = new Mage("近战法师", 80, 500);

    System.out.println("--- 攻击阶段 ---");
    p1.attack();
    p2.attack(); // 这里触发了多态
    System.out.println("--- 死亡阶段 ---");
    p1.die();
    p2.die(); // 这里 不可能被 Mage 类重写die函数，因为 die()函数是 final的
  }
}
