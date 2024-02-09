	package Data;
	
	import javax.persistence.*;
	
	@Entity
	public class Patient_Data 
	{
		 @Id
		    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "your_entity_seq")
		    @SequenceGenerator(name = "your_entity_seq", sequenceName = "your_entity_sequence", allocationSize = 100)
		private long Id;
		private String Pname;
		private int age;
		private String dob;
		private String gender;
		private long Phno;
		private String mail_id;
		private String Password;
		
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getPname() {
			return Pname;
		}
		public void setPname(String pname) {
			Pname = pname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public long getPhno() {
			return Phno;
		}
		public void setPhno(long phno) {
			Phno = phno;
		}
		public String getMail_id() {
			return mail_id;
		}
		public void setMail_id(String mail_id) {
			this.mail_id = mail_id;
		}
		
	
	}
