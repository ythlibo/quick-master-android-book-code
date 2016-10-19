package cn.woblog.book.android;

public class Main {

    public static void main(String[] args) {
        //获取整型的最大值和最小值
        System.out.println("byte 最小值：" + Byte.MIN_VALUE + ",最大值：" + Byte.MAX_VALUE);
        System.out.println("short 最小值：" + Short.MIN_VALUE + ",最大值：" + Short.MAX_VALUE);
        System.out.println("int 最小值：" + Integer.MIN_VALUE + ",最大值：" + Integer.MAX_VALUE);
        System.out.println("long 最小值：" + Long.MIN_VALUE + ",最大值：" + Long.MAX_VALUE);

//获取浮点型的最大值和最小值
        System.out.println("float 最小值：" + Float.MIN_VALUE + ",最大值：" + Float.MAX_VALUE);
        System.out.println("double 最小值：" + Double.MIN_VALUE + ",最大值：" + Double.MAX_VALUE);

        double a = 1.0 / 0;
        double b = -1.0 / 0;
        double c = 0.0 / 0;
        System.out.println(a); //Infinity
        System.out.println(b);//-Infinity
        System.out.println(c);//NaN

//判断是否是无穷大，或NaN
        System.out.println(Double.isInfinite(a)); //true
        System.out.println(Double.isInfinite(b));//true
        System.out.println(Double.isNaN(c));//true

        //浮点数运算误差运算
        System.out.println(2.0 - 1.1);

//字符类型
        char c1 = 'A';
        System.out.println(c1); //A

//打印字符A的ascii码值
        System.out.println(String.format("%d", (int) c1)); //65

//同时，字符可以和int直接相互转换的
        int i1 = 66;

//将66转为char类型，用String类的format方法格式化输出char类型
        System.out.println(String.format("%c", (char) i1)); //B

//打印一个换行符
        System.out.println('\n');

//打印一个反斜线
        System.out.println('\\');

//boolean类型
        System.out.println(3 > 2); //true
    }
}
