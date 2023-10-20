package soundharya;
class hello
{
    String regex="^[a-zA-Z]+$";
    String name;
    public void set(String str) {
      if(str.matches(regex))
      {
          System.out.println("correct name is set");
          this.name=str;

      }
      else {
          System.out.println("wrong name is given");
      }

    }
}
public class code01 {
    public static void main(String[] args) {
     hello ho=new hello();
     ho.set("ramya");
    }
}
