package switchCase;

import java.util.Scanner;

public class ExtraCourseNameWithIfElseCondition {
    public static void main(String[] args) {
        ExtraCourseNameWithIfElseCondition.getExtraCourseName();
    }


    public static void getExtraCourseName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your course name");
        String course = scan.nextLine();
        String courseName;
        System.out.println("enter your extra course name");
        String extraCourseName = scan.nextLine();

        switch (course) {
            case "css":
               courseName = "css 101";

//                if (extraCourseName.equalsIgnoreCase("css 111")) {
//                    System.out.println("this is  " +courseName);
//                } else {
//                    System.out.println("this  is not css 111");
//                }
                break;
//            case "java":
//                courseName = "java  202";
//                if (extraCourseName.equalsIgnoreCase("222")) {
//                    System.out.println("this is java 222"+courseName);
//
//                } else {
//                    System.out.println("this is not java 222");
//                }


            case "java":
               courseName = "java  202";
                switch (extraCourseName) {

                    case "java 304":
                        courseName="304A";
                    System.out.println(" this is java " +courseName);
                    break;
                    case "java 305":
                        courseName="305A";
                        System.out.println("this is java "+courseName);
                        break;

                    case "java 306": courseName="306A";
                        System.out.println("this is java " +courseName);
                        break;
                    default:
                        System.out.println("not match");
                        break;



                }
                break;

            default:
                System.out.println("this not applicable");
                break;
        }
       // System.out.println("this is parent switch"+ course);
        }
    }
