import java.util.Scanner;
import java.sql.*;
class Employee
{
	String name;
	String id;
	String add;
	double sal;	
	Employee()
	{
		name="abcd";
		id="1016";
		add="muz";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement st=con.createStatement();
			String val="insert into emp values('"+id+"','"+name+"','"+add+"')";
			System.out.println(val);
			st.executeUpdate(val);


			//fatch the data;
			String name=null;
			String val2="select emp_name from emp";			
			ResultSet rs=st.executeQuery(val2);
			while(rs.next())
			{
				name=rs.getString(1);	
			}

			System.out.println("Name="+name);

		}
		catch(Exception e1)
		{
			System.out.println("Exception="+e1);
		}
		
	}
	public static void main(String std[])
	{
		Employee e1=new Employee();
	}


}

