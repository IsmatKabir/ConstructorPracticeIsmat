package switchCase;

import javax.print.DocFlavor;
import java.util.Scanner;

public class CourseName_switch_case {
    public static void main(String[] args) {
      CourseName_switch_case.getCourseName();
    }
   public static void getCourseName() {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter your course name");
       String courseName=scan.nextLine();
       String courseInfo;
       System.out.println("enter your extraCourse");
       String extraCourse= scan.next();
       switch (courseName) {
           case "css" :
               courseInfo = "css 101";
               break;
           case "java":
               courseInfo = "java 301";
               switch (extraCourse){
                   case "java 333":
                       System.out.println("this is java 333");
                       break;
                   case "java 334":
                       System.out.println("this is 334");
                       break;

               }
               break;
           case "sql":
               courseInfo = "sql 303";
               break;
           case "selenium":
               courseInfo = "selenium 404";
               break;
           default:
               courseInfo = "not applicable";
               break;
       }

       System.out.println("my course is "+""+courseInfo);

   }






}
