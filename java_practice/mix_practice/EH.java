/* 
class EH {
    public static void main(String[] ar) {
        System.out.println("softwaves 1");
        int x = Integer.parseInt(ar[0]);
        System.out.println("softwaves 2");
        int y = Integer.parseInt(ar[1]);
        System.out.println("softwaves 3");
        System.out.println(x / y);
        System.out.println("softwaves 4");
    }
}
*/

/* 
class EH {
    public static void main(String[] ar) {
        int x = Integer.parseInt(ar[0]);
        int y = Integer.parseInt(ar[1]);
        try{
        System.out.println(x / y);
        
        }System.out.println("softwaves");
    }
}

*/

class EH {
    public static void main(String[] ar) {

        int x = Integer.parseInt(ar[0]);
        int y = Integer.parseInt(ar[1]);
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println("hii sachin");
        }
        System.out.println("1000 line code");
    }
}
