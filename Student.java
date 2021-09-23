package java_practice;

	public class Student {
		private int StudentId;
		private String StudentName;
		private String CollegeName;
		private String Branch;
		private String ContactNumber;
		private String Address;
		
		public int getStudentId() {
			return this.StudentId;
		}
		public void setStudentId(int StudentId) {
			this.StudentId = StudentId;
		}
		public String getStudentName() {
			return this.StudentName;
		}
		public void setStudentName(String StudentName) {
			this.StudentName = StudentName;
		}
		public String getCollegeName() {
			return this.CollegeName;
		}
		public void setCollegeName(String CollegeName) {
			this.CollegeName = CollegeName;
		}
		public String getBranch() {
			return this.Branch;
		}
		public void setBranch(String Branch) {
			this.Branch = Branch;
		}
		public String getContactNumber() {
			return this.ContactNumber;
		}
		public void setContactNumber(String ContactNumber) {
			this.ContactNumber = ContactNumber;
		}
		public String getAddress() {
			return this.Address;
		}
		public void setAddress(String Address) {
			this.Address = Address;
		}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student mohit = new Student();
		mohit.setStudentId(1);
		mohit.setStudentName("Sagar Chopdar");
		mohit.setContactNumber("9730771669");
		mohit.setCollegeName("sinhgad institute management pune");
		mohit.setBranch("Information Technology");
		mohit.setAddress("Pune");
		
		System.out.println(mohit.getStudentId());
		System.out.println(mohit.getStudentName());
		System.out.println(mohit.getContactNumber());
		System.out.println(mohit.getAddress());
		System.out.println(mohit.getCollegeName());
		System.out.println(mohit.getBranch());

	}

}
