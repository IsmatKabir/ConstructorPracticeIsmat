package nested;

public class Nested_For_Loop {
    // user will give input and make a right triangle
    // output will be
    //  *
    //  * *
    //  * * *
    // * * * *
    // * * * * *

    public static void main(String[] args) {
        Nested_For_Loop.getRightTriangle();
        Nested_For_Loop.getreverseTriangle(5);
    }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.print("\n");
    //}

           // Nested_For_Loop.getrightTriangle(6);
           // Nested_For_Loop.getReverseTriangle(6);



//    }
//    public  static void getrightTriangle( int rownum) {
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.print("\n");
//
//        }
//    }
//
//   public static void getReverseTriangle(int rownum) {
//        for (int i =rownum; i>=1;i--){
//            for (int k=i;k>=1;k--){
//                System.out.print("*"+" ");
//            }
//            System.out.print("\n");
//        }
//
//   }
//
//
//
//    public static void printCirclePattern(int calNum){
//
//        double rawNum;
//        for (int i=0; i <=2*calNum; i++){
//
//            for (int k=0; k<=2* calNum; k++){
//                rawNum=Math.sqrt((i-calNum)*(i-calNum)+(k-calNum)*(k-calNum));
//                if (rawNum>calNum-0.5 && rawNum<calNum+ 0.5){
//                    System.out.println("*");
//                }else
//                    System.out.println(" ");
//
//            }
//            System.out.println("\n");
//        }
//    }
//
    public static void getRightTriangle(){
        for (int i=0; i<=5;i++){
            for (int j=1; j<=i;j++){
                System.out.print("A"+" ");
            }
            System.out.println();
        }
    }
    public static void getreverseTriangle(int rownum){
        for (int i=rownum;i>=0;i--){
            for (int k=i;k>=1;k--){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }
}