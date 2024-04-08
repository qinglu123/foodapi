package cn.bdqn.mytest;

import org.junit.jupiter.api.Test;

public class MyTest {
    private  int  a = 1;

    @Test
    public void test1(){
        MyTest m1 = new MyTest();
        m1.swap(m1);
        System.out.println("m1"+m1.a);


//        Class<MyTest> c1 = MyTest.class;
//        Class<? extends MyTest> c2 = new MyTest().getClass();
//        System.out.println(c1 == c2);

//        String s1 = "b";
//        String s2 = new String("b").intern();//intern是在字符串常量池中寻找对应的字符串，如果存在就直接指向，不存在就新建
//        System.out.println(s1==s2);//true

//        Integer i1 = new Integer(128);
//        Integer i2 = new Integer(128);
//        System.out.println(i1==i2); //false
//        Integer i3 = new Integer(-127);
//        Integer i4 = new Integer(-127);
//        System.out.println(i3==i4); //false



//        Integer i5 = new Integer(129);
//        Integer i6 = new Integer(129);
//        System.out.println(i5==i6); //false
//        Integer i7 = new Integer(-128);
//        Integer i8 = new Integer(-128);
//        System.out.println(i7==i8); //false

//        Integer i5 = 128;
//        Integer i6 = 128;
//        System.out.println(i5==i6); //false
//        Integer i7 = 127;
//        Integer i8 = 127;
//        System.out.println(i7==i8); //true


//        Long l1 = Long.valueOf(127);
//        Long l2 = Long.valueOf(127);
//        System.out.println(l1==l2); //true
//        Long l3 = Long.valueOf(128);
//        Long l4 = Long.valueOf(128);
//        System.out.println(l3==l4); //false
//        缓存了-128到127范围内的Long，valueOf方法会从缓存中去拿值，如果命中缓存，会减少资源的开销，parseLong方法没有这个机制

    }

    public void swap(MyTest myTest){
        myTest.a=100;
        System.out.println("myTest"+myTest.a);
    }
}
