import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Dog dog1 = new Dog();//创建对象,dog
        //对象名.属性名 操作属性
        dog1.color = "黄色";
        //对象名.方法名 操作方法


        Dog dog2 = new Dog("red");

        Dog dog3 = new Dog("green","snoopy");

        Student student = new Student();
        student.setStuName("zhangsan");
        System.out.println(student.getStuName());


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        /*
            new Penguin() 创建对象
            = 赋值
            Pet p; p看成变量，它是Pet类型
            String s;
         */
        Pet p = new Penguin();
        /*
            引用类型可以作为方法的参数，形参。
            如果类有子类，那么在调用这个方法的时候，
                该类的对象及其子类对象都可以做为
                实参传递到方法里。
             如果该类有父类，其父类的对象不能作为
                实参传递到方法里。除非进行引用类型
                的强制类型转换。
         */
        dog1.run((Penguin) p);
        dog1.run(new Penguin());
        int i =2;
        double z = (double)i;

        Penguin p1 = (Penguin)p;
    }
}
