package soundharya;
class mahi
{
    int id;
    String str;
    public void sound()
    {
        System.out.println("my company id: "+id+" and name is:"+str);
    }
}
public class class_02 {
    public static void main(String[] args) {
        mahi rs=new mahi();
        rs.id=45;
        rs.str="ramya";
        rs.sound();


    }
}
