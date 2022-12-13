import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
 

 
public class Test
{
    public static void main(String[] args)
    {
        String x = "good boy chiru good boy chiru good boy chiru";
        long start = java.lang.System.currentTimeMillis();
        String y = run(x);
        long end = java.lang.System.currentTimeMillis();
        System.out.print("Speed : " +(60/((end-start)/1000))*9+"WPM; "); 
        char[] t = x.toCharArray();
        char[] g = y.toCharArray(); 
        double errors = 0;
        double total = 0;
        for (int i = 0; i < g.length; i++) {
           if(t[i] != g[i]){
            errors++;
           }
           total++;
        }
        System.out.print(errors+" Typos;   ");
        errors = total-errors;
        int as = (int) (((errors/total)*100));
        System.out.print("ACU : "+as+"%");
        //System.out.println(errors+"+"+ total);
           
    }
    public static String run(String x)
    {
        System.out.println(x);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}