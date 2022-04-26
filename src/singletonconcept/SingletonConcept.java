package singletonconcept;

public class SingletonConcept {
// we are allow to create one instance of a class at a time in singletone
  // using private constructor we  can ensure that no more than one object can be created at a time
  // singleton concept work with the default constructor only

  public   SingletonConcept() {}


    public static void main(String[] args) {

      SingletonConcept single= new SingletonConcept();
      SingletonConcept single1= new SingletonConcept();


    }


}
