import java.util.*;

class CALCULATE_GRADE
{
    void grades(int avg_percent)
    {
        if(avg_percent>=90)
            System.out.println("O");
        else if(avg_percent>=80)
            System.out.println("A+");
        else if(avg_percent>=70)
            System.out.println("A");
        else if(avg_percent>=60)
            System.out.println("B+");
        else if(avg_percent>=50)
            System.out.println("B");
        else if(avg_percent>=40)
            System.out.println("C");
        else
            System.out.println("F");
    }
}

public class GRADE_CALCULATOR
{
    public static void main(String[] args)
    {
        int sub_marks,total_marks=0;
        System.out.println("WELCOME TO GRADE CALCULATOR");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF SUBJECTS");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println("ENTER SUBJECT"+i+" MARKS");
            sub_marks=sc.nextInt();
            total_marks=total_marks+sub_marks;
        }
        int avg_percent=(total_marks/5);
        CALCULATE_GRADE s1=new CALCULATE_GRADE();
        System.out.println("TOTAL MARKS= "+total_marks);
        System.out.println("AVERAGE PERCENTAGE= "+avg_percent+"%");
        System.out.print("YOUR GRADE IS: ");
        s1.grades(avg_percent);
    }
}
