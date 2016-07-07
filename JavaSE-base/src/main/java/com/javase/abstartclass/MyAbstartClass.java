package com.javase.abstartclass;

/**
 * Created by 廖双龙 on 2016/7/6.
 *
 * 抽象类中可以定义自己的变量，比较灵活，而接口当中定义的变量只能是
 * public static
 */
public abstract  class MyAbstartClass {
    public static String name;
    private static int i;
    public abstract String getName();
    public   MyAbstartClass(){
        System.out.println("抽象类的构造器");
    }//抽象类的构造器，但不能实例化，只能子类实例化
}

class AbstartTest extends  MyAbstartClass {
    public static void main(String[] args) {
    MyAbstartClass myAbstartClass = new AbstartTest();
        System.out.print(myAbstartClass.getName());
}
    @Override
    public String getName() {
        return "获取名字方法";
    }

}
