package Password_Strength;
public class User_input {
	String userN;
	String pass;
	/*public User_input(String userN,String pass)   //we set the values
	{
		this.userN=userN;
		this.pass=pass;
	}*/  //using setter-getter
	public void setuserN(String userN)
	{
		this.userN=userN;
	}
	public String getuserN()
	{
		return userN;
	}
	public void setpass(String pass)
	{
		this.pass=pass;
	}
	public String getpass()
	{
		return pass;
	}
}
