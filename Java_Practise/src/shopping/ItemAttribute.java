package shopping;

/**
 * Created by sgc on 2/17/16.
 */
public class ItemAttribute {
    public int quantity;
    public double price;
    public String itemCode;
    public String name;
    public ItemAttribute(String itemCode,String name,int quantity,double price){
        this.itemCode=itemCode;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
}
