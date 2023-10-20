package soundharya;

public class evenarray {
    public static void main(String[] args) {
        int [] l={2,4,12,16,3};
        for(int i=0;i<= l.length-1;i++)
        {
            if(l[i]%2==0)
                System.out.println(l[i]);
        }
    }
}
