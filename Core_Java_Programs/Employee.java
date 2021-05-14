public class Employee {
private String eid;
private String ename;
private String sex;
private String salary;
private String shift;
private String e_addr;
private String e_mob;
public void setEid(String eid){
    this.eid=eid;
}
public String getEid(){
    return eid;
}
public void setEname(String ename){
    this.ename=ename;
}
public String getEname(){
    return ename;
}
public void setSex(String sex){
    this.sex=sex;
}
public String getSex(){
    return sex;
}
public void setSalary(String salary){
    this.salary=salary;
}
public String getSalary(){
    return salary;
}
public void setShift(String shift){
    this.shift=shift;
}
public String getShift(){
    return shift;
}
    public void setE_addr(String e_addr){
        this.e_addr=e_addr;
    }
    public String getE_addr(){
        return e_addr;
    }
    public void setE_mob(String e_mob){
        this.e_mob=e_mob;
    }
    public String getE_mob(){
        return e_mob;
    }
    public String viewproduct(String eid,String ename,String sex,String salary,String shift,String e_addr,String e_mob){
    setEid(eid);
    setEname(ename);
    setSex(sex);
    setSalary(salary);
    setSalary(salary);
    setE_addr(e_addr);
    setE_mob(e_mob);
    return "view product successfully";
    }
    public String viewcustomer(){
    return "view customer successfully";
    }
    public String viewsupplier(){
    return "view supplier successfully";
    }
}
