class person{
    private String name;
    private String email;
    private int phone;
    public person(String name, String email, int phone){
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }

    
}



class student extends person{
          private int id;
          private String branch;
          private int year;

    public student(String name, String email, int phone,int id,String branch, int year) {
        super(name, email, phone);
        this.id=id;
        this.branch=branch;
        this.year=year;
       
    }



    void showstudent(){
        System.out.println("***************** student info ********************");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getPhone());
        System.out.println(id);
        System.out.println(branch);
        System.out.println(year);
    }
    
}


public class singleinheritance {
    public static void main(String[] args) {
        student st=new student("Rajesh", "rajeshrathod9230@gmail.com", 708888888, 22, "computer science and enginnering", 3);
        st.showstudent();
    }
}
