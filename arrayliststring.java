package soundharya;

import java.util.ArrayList;

public class arrayliststring {
    public static void main(String[] args) {
        ArrayList<String> b=new ArrayList<>();
        b.add("Ramya");
        b.add("Priya");
        b.add("Saranya");
        b.add("soundharya");
        b.add("aditya");
        System.out.println(b);
        b.remove(4);
        System.out.println(b);
    }
}
