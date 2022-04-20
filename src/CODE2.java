import java.util.Arrays;
import java.util.concurrent.Callable;

public class CODE2 {
    public int  cyclicadd( String s) {
        int m= s.length();
        int f= Integer.parseInt(s);
        int sum=0;
        while (m>0)
        {
            sum=sum+(f%10)*m;
            f=f/10;
            m--;
        }
        return sum;
    }
}
class main{
    public static void main(String[] args) {
        CODE2 c2= new CODE2();
        if(args.length>3){
            System.exit(0);
        }
        else {
            int a=0;
            for(int i=0;i < args.length;i++){
                a= c2.cyclicadd(args[i]);
                System.out.println(a);
            }
        }
    }
}
