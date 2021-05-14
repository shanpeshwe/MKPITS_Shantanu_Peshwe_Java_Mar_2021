import java.util.Scanner;

public class Customer {
   private String cid;
   private String cname;
    private String c_addr;
    private String  c_mob;
    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCid() {
        return cid;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCname() {
        return cname;
    }
    public void setC_addr(String c_addr) {
        this.c_addr = c_addr;
    }
    public String getC_addr() {
        return c_addr;
    }
    public void setC_mob(String c_mob) {
        this.c_mob = c_mob;
    }
    public String getC_mob() {
        return c_mob;
    }
    public String placeorder(String cid,String cname,String c_addr,String c_mob){
        setCid(cid);
        setCname(cname);
        setC_addr(c_addr);
        setC_mob(c_mob);
        return "place order successfully";
    }
    public String receiveproduct(){
        return "receive product successfully";
    }
}
