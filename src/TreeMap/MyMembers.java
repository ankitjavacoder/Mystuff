package TreeMap;


public class MyMembers {
    int empNo,salary,age;
    String loc;

    public MyMembers(int empNo, int salary, int age, String loc) {
        this.empNo = empNo;
        this.salary = salary;
        this.age = age;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return  "Location " + this.getLoc() +"  Emplyee No : "+ this.getEmpNo() +" Age : "+ this.getAge() +" Salary: "
                + this.getSalary();
    }

    public MyMembers() {
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
