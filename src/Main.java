import java.util.*;
class Salary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hours[]=new int[7];
        int salary =0;
        int totalhours=0;
        for(int i=0;i<7;i++)
        {
            hours[i]=sc.nextInt();
            salary+=hours[i]*100;
            if(i==0&&hours[i]>0)
            {
                salary+=((hours[i]*100)*0.5);
            }
            else if(i==6&&hours[i]>0)
            {
                salary+=((hours[i]*100)*0.25);
            }
            else
            {
                totalhours+=hours[i];
            }
            if(hours[i]>8)
            {
                int extra_hr=hours[i]-8;
                salary+=extra_hr*15;
            }
        }
        if(totalhours>40)
        {
            salary+=((totalhours-40)*25);
        }
        System.out.println(salary);
    }
}