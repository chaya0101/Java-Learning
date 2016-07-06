package com.javase.abstartclass;

/**
 * Created by 廖双龙 on 2016/7/6.
 * 接口当中的变量默认为public static
 * 必须初始化一个值，不初始化会报错
 */
public interface MyInterface {
   String name = "你好";
   public static String age = "23" ;//其实这个public static 是不需要的，编译器会给个警告，不会报错

    /**
     * Java8 的接口的默认方法，可以实现的默认方法,可以有多个
     * 由于不是static的，所以不能用接口来调用只能用实现类来调用
     * 这样接口和抽象类的差别就没原来那么大
     */
   default void hello(){
      System.out.println("Java8 当中接口可以自带默认的实现方法，而子类不用重写这个默认方法");
   }
   default void say(){
   }
}

class InterfaceTest implements MyInterface{
   static String age = MyInterface.age + MyInterface.name;
   public static void main(String[] args) {
      MyInterface test = new InterfaceTest();
      test.hello();
      System.out.println(age);
   }
}
