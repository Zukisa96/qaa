/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phelokazi
 */
import java.util.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println("==========================================================================================================");
            System.out.println("                               Wamkelekile kwi MATHS APP                                                      ");

            System.out.println("===========================================================================================================");
            double x = input_x(); 
            double y = input_Y();
            String Pointname = input_PointName();
      System.out.println("==========================================================================================================");
               double finalResult = Distance(x, y);
                double rflx_X = Reflection1(y);
                double rflx_Y = ReflectionII(x);

                System.out.println("*******************************************************************************************************");
                System.out.println("Imbonakalo X-Axis ngu : (" + x + ",  " + rflx_X + ") Kwinqaku :  " + Pointname);

                System.out.println("Imbonakalo Y-Axis ngu : (" + rflx_Y + " , " + y + ") Kwinqaku :  " + Pointname );
                System.out.println("Ifomula yomgca ochanekileyo yile " + "" + "y = " + ((y - 0) / (x - 0) + "x  + " +  y));
               String Quadrant = Quad(x, y);
                System.out.println("Ulungelelwaniso lwenqaku: " + "'" +Pointname+ "'" + "" + Quadrant );
                System.out.println("Umgama phakathi konxibelelaniso kwa (" + x+ ","+ y+") kunye ( 0,0) :"  + finalResult);
      System.out.println("***********************************************************************************************");
     
        
    }
      static double input_x() { 
                 
             Scanner console = new Scanner(System.in); 
            System.out.println("Nceda ufake uququzelelo x: ");
            double x1 = console.nextDouble();
            return x1;
                    }
        static double input_Y() {  
            Scanner console = new Scanner(System.in);
             System.out.println("Nceda ufake uququzelelo y:");
            double y1 = console.nextDouble();
            return y1;
                    }
        static String input_PointName(){
             Scanner console = new Scanner(System.in);
            System.out.println("Nceda ufake igama lendawo :");
             String cname = console.next();
             return cname;
              }


         private static double Distance(double x1, double y1)

            {
                 double  x2=0;
                 double y2 = 0;

                double temp1 = Math.pow((x1 - y1), 2);

                double temp2 = Math.pow((x2 - y2), 2);

                double result = Math.sqrt(temp1 + temp2);



                return result;

            }
         private static double Reflection1(double y1)

            {
                //x-axis ref
                double refX;
                refX = (-1)*(y1 );
                return refX;

            }


          private static double ReflectionII(double x1)

            {

                //Y-axis ref
                double refY;
                 refY = (-1)*(x1);
                return refY;
            }
      


         static String Quad(double x1, double y1)

            {
                String quadrant= "";
                if (x1 > 0 && y1 > 0){

                    quadrant = (" ilele kwikota yokuqala yokuqala, EMTLA MPUMA.");}



                else if (x1 < 0 && y1 > 0){

                    quadrant = (" ilele kwikota yesibini yesibini, EMTLA MPUMA.");}



                else if (x1 < 0 && y1 < 0){

                    quadrant= (" ilele kwikota yesithathu, EMZANTSI NTSHONA.");}



                else if (x1 > 0 && y1 < 0){

                    quadrant = ( " ilele kwikota yesine, EMZANTSI MPUMA.");}



                else if (x1 == 0 && y1 == 0){

                    quadrant = ( "ISIPHAMBUKA");}
                return quadrant;
           
           }
}
