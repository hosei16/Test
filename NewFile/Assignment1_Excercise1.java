public class Assignment1_Excercise1 
{    /**     * @param args the command line arguments     */    
 public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= (-2 * i + 12); j=j+2)
                System.out.print("*");
                
            for(int j = 0; j < (-2 * i)+10; j++)
                System.out.print("/");
            for(int j = 2; j < 2 * i; j++)
                System.out.print("\\");
                
            for(int j = 1; j <=(-2 * i +12); j=j+2)
                System.out.print("*");
                
            System.out.println();
        }
    }
}

  
