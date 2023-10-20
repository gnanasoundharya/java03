package soundharya;

import java.io.IOException;

class calculator01
{
    public static void add(int a, int b) {
        //int c = a+b;
        System.out.println(a + b);

    }
    public static void sub(int x, int y) {
        //int z = x - y;
        System.out.println(x-y);
    }

    public static void multi(int p,int q) {
        //int r=p*q;
        System.out.println(p*q);

    }

    public static void div(int m,int n) {
       // int o=m/n;
        System.out.println(m/n);
    }

    public static void div01(int i,int j) {
        //int k=i%j;
        System.out.println(i%j);
    }
}
public class cls_methodcalculator {
    public static void main(String[] args) throws IOException {

        calculator01 cal=new calculator01();
        cal.add(17,51);
        cal.sub(70,60);
        cal.multi(45,34);
        cal.div(70,35);
        cal.div01(67,12);
    }
}
