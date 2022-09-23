package SalesSample;

import com.sun.net.httpserver.Headers;

public class Item {
    private Header header;

    private String itemName;

    private double itemPrice;

    private int itemCount;

    public Item(Headers header, String itemName, double itemPrice, int count){

    }
    public Item(Header header,String itemName, Double itemPrice , int itemCount){
        this.header=header;
        this.itemName=itemName;
        this.itemPrice=itemPrice;

    }

    public  Header getHeader(){return  header;}

    public  String getItemName(){return itemName;}

    public double getItemPrice(){return itemPrice;}

    public int getItemCount() {
        return itemCount;
    }

    public void setHeader(Header header){this.header=header;}

    public void setItemName(String itemName){this.itemName=itemName;}

    public void setItemPrice(double itemPrice){this.itemPrice=itemPrice;}

    public void setItemCount(int itemCount){this.itemCount=itemCount;}

    public double getItemTotal(){return  itemPrice*itemCount;}
    @Override
    public String toString(){return header.getInvoiceNumber() + "," + itemName +","+itemPrice + "," + itemCount;}

}
