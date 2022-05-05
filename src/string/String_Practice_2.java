package string;

public class String_Practice_2 {
    public static void main(String[] args) {

        String fullNameAddress="Aumi Rahman live in queens";
        System.out.println(fullNameAddress.length());
        System.out.println(fullNameAddress.toLowerCase());
        System.out.println(fullNameAddress.toUpperCase());
        System.out.println(fullNameAddress.charAt(12));
        System.out.println(fullNameAddress.equals("Aumi Rahman live in queens"));
        System.out.println(fullNameAddress.substring(10));
        System.out.println(fullNameAddress.substring(10,15));
        System.out.println(fullNameAddress.equalsIgnoreCase("aunonto"));
        System.out.println(fullNameAddress.equalsIgnoreCase("Aumi Rahman live in queens"));
        System.out.println(fullNameAddress.concat(" and he is a student"));
        System.out.println("he is from ".concat("st jhons"));


        String courseName="my course is:  java";
        System.out.println(courseName.contains(":"));
        System.out.println(courseName.contains("ja"));
        System.out.println(courseName.contains("yu"));

        String studentName="ismat@israt@tahmina@tania@tazwar";

        System.out.println(studentName.split("@",5));// it dosen't work
        String[]demoArray=studentName.split("@",5);
        for (String a: demoArray){
            System.out.println(a);
        }
        for (int i=0;i<demoArray.length;i++){
            System.out.println(demoArray[i]);
        }












    }


}
