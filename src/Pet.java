public abstract class Pet {
    String name;
    int health;
    final static int love = 2;

    /*
        abstract定义一个类  抽象类
            属性
            抽象方法
            非抽象方法
            不能通过new 构造方法创建对象
        abstract定义一个方法 抽象方法
            抽象方法不能有方法体，不能有大括号
     */
    abstract void print();

    String getName(){
        return "";
    }

    int getHealth(){
        return 0;
    }

    int getLove(){
        return 0;
    }
}
