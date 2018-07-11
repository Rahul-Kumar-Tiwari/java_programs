import java.sql.*;
class DatabaseTable
{
	DatabaseTable()
	{
		  try
		       {
		     	  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			  Statement st=con.createStatement();
    			  String val="create table emp(emp_id varchar(30),emp_name varchar(30),emp_add varchar(30))";                 
                          st.executeUpdate(val);
                        }
		        catch(Exception e2)
		        {
                          System.out.println("exception="+e2);
		        }


	}
public static void main(String st[])
{
	new DatabaseTable();

}

}

