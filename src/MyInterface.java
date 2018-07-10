/*
    接口
        1、接口里面只能有抽象方法，接口里的抽象方法
            可以不加abstract
        2、接口里面的变量默认为静态变量，可以不用
            加static
        3、接口不能被new实例化。只能使用实现该接口
            类来实例化，然后赋值
        4、类与类之间的关系继承，类与接口之间实现，
            接口与接口之间继承
        5、一个类只能有一个父类，一个类可以实现多个
            接口
            Class A extends Class B implements Interface C
                                               ,Interface D
 */
public interface MyInterface {
    public int i = 1;
    public void add();//抽象方法
}
