package constructorIsmat;

public class ReturntypeMethodWithoutParameter {
//return type method without parameter
//   return type is all tyoes of data,void ,class type and object
    // method name  verb+noun/adjectives
// method name should start with lower case
// void is a keyword which is indicate non return type
    // accessmodifier datatyppe methodname /class/object(){ return;}

    public int doSummation(){
        System.out.println("this is dosummation method");
        int num1=20;
        int num2=30;
        int total=num1+num2;
// what is the datatype in method name that should be the return datattype value
        // this method will return us int type of value
        System.out.println("total number is: "      +total);
return total;

    }

   // public void getDisplay(){
        //System.out.println("this is our get display method");
   // }


    public static void main(String[] args) {


        ReturntypeMethodWithoutParameter rp = new ReturntypeMethodWithoutParameter();
// rp.getDisplay();

        rp.doSummation();


    }







}