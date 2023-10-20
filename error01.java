package soundharya;
public class error01 {
    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("code failed due to space"+e);
        }

    }
}
