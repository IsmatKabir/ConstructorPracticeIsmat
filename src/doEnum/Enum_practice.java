package doEnum;

    enum monthOfYear {

    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL;
   }
   enum days{
        SUNDAY,MONDAY,TUESDAY}

   enum colors{ YELLOW,RED,GREEN }






    public class Enum_practice {
        public enum mobileBrand{ IPHONE,SAMSUNG,BLACKBERRY }

    public static void main(String[] args) {
        System.out.println(mobileBrand.BLACKBERRY);
        System.out.println(mobileBrand.IPHONE);
        System.out.println(colors.RED);
        System.out.println(days.SUNDAY);
        }

}
