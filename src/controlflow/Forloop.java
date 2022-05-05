package controlflow;

public class Forloop {


    public static void main(String[] args) {
        Forloop forloop = new Forloop();
// forloop.display();
        //  for ( int i=0;i<9;i++) {
        // System.out.println("hello ");
        //}

        //for (int i=3;i>2;i++){
        //   System.out.println("ismat"); // continue looping (haha virus/cpmputer crashed)
        // }
        // loop is allowing us to execute the block of code multiple times

//   for (int i=5;i>4; i--){

//    System.out.println("aunonto");
//  }
        for (int i = 0; i < 10; i++) {
            System.out.println("we are learning");
            i++; //it will decrease +1 and +1
        }
        for (int i = 17; i > 15; i -= 2) {    //-2 is counting as iterator//i-- or i-=2 is same
            System.out.println("hello");       //i++ 0r i+=2 is same
        }
//public void display(){
//
//    System.out.println(" this is  display method");// call it in main method with the object name
//}
        int a=5;
        int b=3;
        b += 9;  // 3+9
        System.out.println(b);
        b-=17;  //12-17
        System.out.println(b);


    }


}
