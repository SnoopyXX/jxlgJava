public  class Dog {
    /*
        基本数据类型：
            int,byte,boolean,long,short
            char,double,float
        引用类型
            类、接口、集合类、数组
            String
     */

    String color;//颜色
    String name; //成员变量
    final static String type = "狗"; //类变量

    /*
        构造方法
        1、方法名和类名相同
        2、无参数
        3、无返回
     */
    public Dog(String color){
        //this代表当前类的对象
        this.color = color;
    }

    public Dog(){
        super();
    }

    public Dog(String color,String name){
        this.color = color;
        this.name = name;
    }

    /*
        final
        修饰类：类不能够被继承
        修饰变量：在程序执行过程中，变量值不够被修改
        修饰方法：方法不能被重写
     */

    //行为，动作
    void run(Penguin p){
        System.out.println("跑步中...");
    }
}
