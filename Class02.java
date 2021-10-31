package java08hw;

class Cbbb
{
   double x;         // 定義資料成員x
   double y;        // 定義資料成員y
   
}

public class Class02
{
   public static void main(String args[])
   {
      Cbbb obj1,obj2,avg;       // 宣告指變數ob1, ob2
      obj1=new Cbbb();         // 建立物件ob1
      obj2=new Cbbb();         // 建立物件ob2
      avg= new Cbbb();
      
      obj1.x=5.2;              // 設定ob1的x
      obj1.y=3.9;              // 設定ob1的y

      obj2.x=6.5;              // 設定ob2的x
      obj2.y=4.6;     		  // 設定ob2的y
   
      avg.x =(obj1.x+obj2.x)/2;
      avg.y =(obj1.y+obj2.y)/2;
      System.out.println("obj1.x: "+obj1.x+" "+ obj1.y);
      System.out.println(obj2.y+" "+ obj2.y);
      System.out.println(avg.x+" "+ avg.y);
 
   }
}
