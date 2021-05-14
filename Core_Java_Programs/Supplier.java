import java.util.Scanner;

public class Supplier {
   private String sup_id;
   private String sup_name;
   private String sup_address;
   private String pname;
   private String  cp;
   private String pid;
    public void setSup_id(String sup_id) {
        this.sup_id = sup_id;
    }
    public String getSup_id() {
        return sup_id;
    }
    public void setSup_name(String sup_name) {
        this.sup_name = sup_name;
    }
    public String getSup_name() {
        return sup_name;
    }
    public void setSup_address(String sup_address) {
        this.sup_address = sup_address;
    }
    public String getSup_address() {
        return sup_address;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPname() {
        return pname;
    }
    public void setcp(String cp) {
        this.cp = cp;
    }
    public String getCp() {
        return cp;
    }
    public void setPid(String pid){
        this.pid=pid;
    }
    public String getPid(){
        return pid;
    }
    public String addsupplier(String sup_id,String sup_name,String sup_address,String pname,String cp,String pid){
        setSup_id(sup_id);
        setSup_name(sup_name);
        setSup_address(sup_address);
        setPname(pname);
        setcp(cp);
        setPid(pid);
        return "supplier added succescfully";
    }
    public String removesupplier(){
        sup_id="";
        sup_name="";
        sup_address="";
        pname="";
        cp="";
        pid="";
        return "remove supplier successfully";
    }
    public String updatesupplier(){
        return "update supplier succesfully";
    }
    public String suppliedproduct(){
        return "supplied product successfully";
    }
    }

