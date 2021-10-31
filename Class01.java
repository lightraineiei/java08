class Caaa
{
   int a;         // 定義資料成員x
   int b;        // 定義資料成員y
   int c;
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj;
		obj = new Caaa();
		obj.a=5;
		obj.b=3;
		obj.c=obj.a*obj.b;
		System.out.println("obj.a:"+obj.a+" "+ "obj.b:"+obj.b+" "+ "obj.c:"+obj.c );
	}

}
