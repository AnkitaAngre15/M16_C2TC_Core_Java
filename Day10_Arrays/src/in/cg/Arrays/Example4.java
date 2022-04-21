package in.cg.Arrays;


class Employee{
	public int id;
	public String emp_name;
Employee(int id,String emp_name)
{
	this.id=id;
	this.emp_name=emp_name;
}
}

public class Example4 {

	public static void main(String[] args) {
		
      Employee arr[];
      arr=new Employee[3];
      arr[0]=new Employee(101,"Rangini");
      arr[1]=new Employee(102,"Ankita");
      arr[2]=new Employee(103,"Prema");
      for(int i=0;i<=arr.length;i++) {
    	  System.out.println("Element at "+i+":"+arr[i].id+" "
                      +arr[i].emp_name);
      }
	}

}

