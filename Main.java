/*
   Sebastien Kaku Ap Cs Random obj
*/
import java.util.Random;
class Main{
   public static void main(String[] args){
      Random rand = new Random();
      int[] fnl = {MathRandom(),MathRandom(),MathRandom(),RandomClass(rand),RandomClass(rand),RandomClass(rand)};
      printArray(fnl);
   }
   // Creates a random number with Math.random
   public static int MathRandom(){
      int t = (int) (Math.random()*50);

      return t;    
   }
   // Creates a random number with the class
   public static int RandomClass(Random r){
      return r.nextInt(51);
   }
   // prints an array
   public static void printArray(int[] v){
      for(int i = 0; i < v.length; i++){
         System.out.println(v[i]);
      }
   }
}