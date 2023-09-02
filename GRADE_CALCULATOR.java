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
        int one,two,three,four,five;
        System.out.println("WELCOME TO GRADE CALCULATOR");
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS OUT OF 100");
        System.out.print("ENTER 1ST SUBJECT MARKS: ");
        one=sc.nextInt();
        System.out.print("ENTER 2ND SUBJECT MARKS: ");
        two=sc.nextInt();
        System.out.print("ENTER 3RD SUBJECT MARKS: ");
        three=sc.nextInt();
        System.out.print("ENTER 4TH SUBJECT MARKS: ");
        four=sc.nextInt();
        System.out.print("ENTER 5TH SUBJECT MARKS: ");
        five=sc.nextInt();
        int total_marks=one+two+three+four+five;
        int avg_percent=(total_marks/5);
        CALCULATE_GRADE s1=new CALCULATE_GRADE();
        System.out.println("TOTAL MARKS= "+total_marks);
        System.out.println("AVERAGE PERCENTAGE= "+avg_percent+"%");
        System.out.print("YOUR GRADE IS: ");
        s1.grades(avg_percent);
    }
}