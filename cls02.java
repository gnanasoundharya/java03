package soundharya;
class arya01
{
    int radius;
    double area;
    int height;
    public void set(int r,int h)
    {
        this.radius=r;
        this.height=h;
    }
    public double get()
    {
        area=3.14*radius*radius*height;
        return area;
    }
}
public class cls02 {
    public static void main(String[] args) {
        arya01 ar=new arya01();
        ar.set(4,5);
        System.out.println(ar.get());
    }
}
