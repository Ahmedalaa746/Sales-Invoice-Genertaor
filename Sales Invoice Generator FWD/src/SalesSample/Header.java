package SalesSample;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;


public class Header {

    private int invoiceNumber;

    private Date invoiceDate;

    private String customer;

    private ArrayList<Item> lines ;
    private Formatter simpleDataFormat;
    private LogRecord Date;

    public Header(){
    }

    public Header(int invoiceNumber,Date invoiceDate,String customer){
        this.invoiceNumber=invoiceNumber;
        this.invoiceDate=invoiceDate;
        this.customer=customer;

    }
    public int getInvoiceNumber(){return invoiceNumber;}

    public String getInvoiceDate(){return String.valueOf(invoiceDate);}

    public String getCustomer(){return customer;}

    public void setInvoiceNumber(int invoiceNumber){this.invoiceNumber=invoiceNumber;}

    public void setInvoiceDate(Date invoiceDate){this.invoiceDate=invoiceDate;}

    public void setCustomer(String customer){this.customer=customer;}

    public void setLines(ArrayList<Item>lines){this.lines=lines;}


    public ArrayList<Item>getLines(){
        if (lines==null){
            lines=new ArrayList<>();
        }
        return lines;

    }

    public double getTotal(){
        double total=0.0;
        for (int i=0 ;i<getLines().size();i++){
            total+= getLines().get(i).getItemTotal();
        }
        return total;
    }
    @SuppressWarnings("UnresolvedClassReferenceRepair")
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(invoiceNumber);
        stringBuilder.append(",");
        StringBuilder append = stringBuilder.append(simpleDataFormat.format(Date));
        stringBuilder.append(",");
        stringBuilder.append(customer);
        String s = stringBuilder.toString();
        return s;
    }


    public void add(Header headersArrayList) {

    }

    public Header get(int selectedInvoice) {
        Header header = null;
        return header;
    }

    public void add(ArrayList headersArrayList) {
    }
}
