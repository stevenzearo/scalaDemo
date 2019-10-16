package java.steve.java.demo;

import javax.swing.*;
import java.util.List;

/**
 * @author java.steve
 */
class Single{
    private static Single single= new Single();
    static int count1;
    static int count2=123;


    public Single(){
        count1++;
        count2++;
        System.out.println("count1(new):" + count1);
        System.out.println("count2(new):" + count2);
    }

    public static Single getInstance(){
        return Single.single;
    }
}
public class MyClass {

    public static void main(String[] args) {

        Single single= Single.getInstance();
        System.out.println("count1的值为："+Single.count1);
        System.out.println("count2的值为："+Single.count2);

        /*
        * 执行顺序 初始化 count1 = 0; count2 = 0; -> single= new Single(); 此时 count1 = 1; count2 = 1; -> count2=123;
        *
        * 加载——>连接（验证准备解析）——>类初始化——>类实例化——>使用——>卸载
        * */
    }
}