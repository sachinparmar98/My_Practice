
class Sample {
   public static void main(String[] args) {

      for (int i = 0; i < 2147483647; i++) {
         System.out.println("         " + i + "  " + (++i) + "  " + (++i));
         try {
            Thread.sleep(40);
         } catch (Exception e) {
            System.out.println("caught");
            System.exit(0);
         }

      }
   }
}