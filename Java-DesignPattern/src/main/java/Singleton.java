/**
 *
 * 单例模式 :
 * 1. 分为懒汉模式和饿汉模式
 * 2. 其中懒汉模式分为线程安全和线程不安全
 * 3. 饿汉模式分为双重锁
 * Created by 廖双龙 on 2017/4/17.
 * @author 廖双龙
 */
public class Singleton {
    private static Singleton singleton;

    private  Singleton(){}

    /**
     * 线程不安全的饿汉模式
     * @return Singleton
     */
    public  Singleton getInstance(){
        if (singleton == null){
           singleton = new Singleton();
        }
        return  singleton;
    }

}

/**
 * 饿汉模式
 */
class  SignLeton2{

}