
class Cddd
{
  String name;
  double height;
  double weight;
}
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cddd student;
		student = new Cddd();
		student.name ="Sandy";
		student.height =165.5;
		student.weight = 58.2;
		
		System.out.println("student.name:"+student.name+" "+"BMI:"+(student.weight)/((student.height)/100*(student.height)/100) );
	}

}
