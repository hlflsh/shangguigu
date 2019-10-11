package com.atguigu.test;

/**-128 到 127 之间的数会从 IntegerCache 中取，然后比较，所以第二段代码（100 在这个范围之内）的结果是 true，
 * 而第三段代码（200 不在这个范围之内，所以 new 出来了两个 Integer 对象）的结果是 false
 * @author hlf
 * @create 2019-10-01 14:37
 */
public class Test01 {

    public static void main(String[] args) {
        int e = 1000;
        Integer a = 1000 ;//自动装箱 Integer.valueOf(10)
        Integer b = 1000;
        System.out.println(a==b);//
        System.out.println(a.equals(b));//true
        System.out.println(a==e);//a自动拆箱 再和基本数据类型比较值 true
        Integer c = new Integer(10);
        Integer d = new Integer(10);
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true
        System.out.println(c==a);//false
        System.out.println(c.equals(a));//true

        System.out.println("------------------------");

        /*
        因为 x 和 y 指向的是同一个引用，所以 == 也是 true，而 new String()方法则重写开辟了内存空间，
        所以 == 结果为 false，而 equals 比较的一直是值，所以结果都为 true。
        总体来说，== 对于基本类型来说是值比较，对于引用类型来说是比较的是引用；而 equals 默认情况下是引用比较，
        只是很多类重写了 equals 方法，比如 String、Integer 等把它变成了值比较，
        所以一般情况下 equals 比较的是值是否相等。

        String x = "string";实现过程：首先栈区创建str引用，然后在String池（独立于栈和堆而存在，存储不可变量）
        中寻找其指向的内容为"abcd"的对象，如果String池中没有，则创建一个，然后str指向String池中的对象，
        如果有，则直接将str1指向"abcd""；
         */
        String x = "string";
        String y = "string";
        String g = "string";
        String z = new String("string");//
        System.out.println(x==g); // false
        System.out.println(x==y); // true
        System.out.println(x==z); // false
        System.out.println(x.equals(y)); // true
        System.out.println(x.equals(z)); // true

    }

}
