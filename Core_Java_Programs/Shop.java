

public class Shop {
    private String shop_no;
    private String city;
    private String owner;
    private String address;
    public void setShop_no(String shop_no) {
        this.shop_no=shop_no;
    }
    public String getShop_no() {
        return  shop_no;
    }
    public void setCity(String city) {
        this.city=city;
    }
    public String getCity() {
        return  city;
    }
    public void setOwner(String owner) {
        this.owner=owner;
    }
    public String getOwner() {
        return  owner;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public String getAddress() {
        return  address;
    }

    public String  addShop(String shop_no,String city,String owner,String address) {
        setShop_no(shop_no);
        setCity(city);
        setOwner(owner);
        setAddress(address);
        return   "shop added successfully";
    }
    public  String removeShop() {
        shop_no="";
        city="";
        owner="";
        address="";
        return   "shop removed successfully";
    }

}
