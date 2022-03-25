
public class MemberData {

	private String uname,email,password,phone;
	//private long phone;
	
	public MemberData() {
		super();
	}
	
	public MemberData(String uname, String email, String password, String phone) {
		super();
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	public MemberData( String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	

	public String getUname() {
		return uname;
	}

	

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
