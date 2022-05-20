public class MyMembers {
    int empId;
    String eName;
    int Salary;
    String location;

    public MyMembers(int empId, String eName, int salary, String location) {
        this.empId = empId;
        this.eName = eName;
        Salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return this.eName +" "+this.empId + " " + this.location + " " + this.Salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
