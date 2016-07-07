package com.javase.javastatic;

/**
 * Created by 廖双龙 on 2016/7/6.
 * Java 当中Static的用法，这也是面试了很多家公司都爱考的东西
 *
 */
public class JavaStatic {
    public static  void main(String[] args){
        ParentClass parentClass = new ChildClass();
    }
}

class ParentClass{
    
    public ParentClass(){
        System.out.println("父类构造器");
    }
    static {
        System.out.println("父类静态块");
    }
}

class ChildClass extends  ParentClass{

    public ChildClass(){
        System.out.println("子类构造器");
    }

    static{
        System.out.println("子类静态块");
    }
}
