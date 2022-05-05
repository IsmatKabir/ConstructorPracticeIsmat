package doEnum;

public class Enum {
          // enum declaration can be outside of a class or inside of a class but not inside of a method

         // enum have attributes just like a class and methods
         // enum constant are public static final unchangable cannot override
         // enum can not be used to create objects and it can not extends  other classes but it can implement interfaces
          // use enums when u know the values are not going to change
         // ex days , colors
         public static void main(String[] args) {
             System.out.println(day.THURSDAY);
             System.out.println(color.valueOf("green"));
             System.out.println(color.BLUE);
             System.out.println(mobileBrand.BLACKBERRY);
             System.out.println(Level.levelInfo());
             System.out.println(Level.HIGH.name);
             System.out.println(Level.LOW.age);
         }

       public Enum (){

        }

//  public  void display(){
//           enum LEVEL{
//           }
//  }

public enum day {
           MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
       }
       public enum  mobileBrand {
            IPHONE,SAMSUNG,NOKIA,MOTOROLA,BLACKBERRY
       }
}
enum color{
    GREEN,YELLOW,RED,BLUE,PURPLE
}