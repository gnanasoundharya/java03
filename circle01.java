package soundharya;
class arya
{
    int radius;
    public double sound(int r)
    {
        this.radius = r;
        return 3.14*radius*radius;
    }
}

public class circle01 {
    public static void main(String[] args) {
        arya cs=new arya();
        System.out.println(cs.sound(35));
    }
}
