package Controller;

import SalesSample.Header;
import SalesSample.HeaderTable;
import SalesSample.Item;
import SalesSample.ItemTable;
import SalesVeiw.MainWeb.App;
import SalesVeiw.MainWeb.ImportNewInvoices;
import SalesVeiw.MainWeb.AddingNewData;
import com.sun.net.httpserver.Headers;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Formatter;
import javax.swing.*;


public class ActionListener implements java.awt.event.ActionListener {

    public static Formatter simpleDataFormat;
    private App appFrame;
    private ImportNewInvoices importNewInvoices;
    private AddingNewData addingNewData;
    private Object exception;
    private String date;
    private Item line;
    private AbstractButton cancelInvoicesButton;

    public ActionListener(App appFrame){this.appFrame=appFrame;}
    public static SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd-MM-YYYY");
    @Override
    public void actionPerformed(ActionEvent e){
        switch (e.getActionCommand()){
            case "Load File":
                loadFile();
                break;
            case "Save File ":
                saveFile();
                break;
            case  "Import New Invoice ":
                importNewInvoices();
            case "Create Invoice ":
                createInvoice(date);
                break;
            case "Cancel Invoice ":
                cancelInvoice();
                break;
            case "Delete Invoice":
                deleteInvoice();
                break;
            case"Add New Data":
                addingNewData();
                break;
            case "Create Line":
                createLine();
                break;
            case  "Cancel Line":
                cancelLine();
                break;
            case "Delete Line":
                deleteLine();
                break;

        }

    }

    private void addingNewData() {

    }

    private void saveFile() {

    }

    private void loadFile(){
        JOptionPane.showMessageDialog(appFrame,"Select Location for Headers file Loading."
                ,"Load Headers",JOptionPane.INFORMATION_MESSAGE);
        JFileChooser fileChooser = new JFileChooser();
        try {
            int response = fileChooser.showOpenDialog(appFrame);
            Object exception1 = exception;
            Object exception12 = exception1;
            Object exception11 = exception12;
            if ((response == JFileChooser.APPROVE_OPTION)){
                File headerFile =fileChooser.getSelectedFile();
                Path headerPath = Paths.get(headerFile.getAbsolutePath());

                ArrayList<Header>headers = new ArrayList<>();
                List<String> allHeaders = Files.readAllLines(headerPath);

                for (String oneHeader :allHeaders){
                    String[] array =oneHeader.split(",");
                    String col1 = array[0];
                    String col2 = array[1];
                    String col3 = array[2];

                    int no = Integer.parseInt(col1);
                    Date date = simpleDateFormat.parse(col2);
                    String customer = col3 ;
                    Header header =new Header(no , date , customer);
                    headers.add(header);
                }

                appFrame.setHeadersArrayList(headers);

                JOptionPane.showMessageDialog(appFrame, "Select Location for Lines file Loading. ",
                        "Load Lines",JOptionPane.INFORMATION_MESSAGE
                );
                response = fileChooser.showOpenDialog(appFrame);
                if (response == JFileChooser.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(appFrame, "CSV File for Line not selected! ","No Lines File",
                            JOptionPane.ERROR_MESSAGE);
                } else if (response== JFileChooser.APPROVE_OPTION) {
                    File lineFile = fileChooser.getSelectedFile();
                    Path linePath = Paths.get(lineFile.getAbsolutePath());

                    ArrayList<Item>items = new ArrayList<>();
                    List<String> allLines = Files.readAllLines(linePath);

                    for (String oneLine : allLines){
                        String[] array = oneLine.split(",");
                        String col1 = array[0];
                        String col2 = array[1];
                        String col3 = array[2];
                        String col4 = array[3];

                        int no = Integer.parseInt(col1);
                        String itemName = col2 ;
                        double itemPrice = Double.parseDouble(col3);
                        int count = Integer.parseInt(col4);
                        Headers header = appFrame.getNo(no);

                        Item Line = new Item(header , itemName , itemPrice , count);
                        boolean add;
                        boolean add1 = header.get().add(line);
                        add = true;

                    }
                    appFrame.setItemsArrayList(items);

                }
                HeaderTable headerTable = new HeaderTable(headers);
                appFrame.setHeaderTable(headerTable);
                appFrame.getInvoicesTable().setModel(headerTable);



            }
            catch (IOException exception12){
                JOptionPane.showMessageDialog(appFrame, "Could not open this file!\n Not a CSV file",
                        "Invalid File",JOptionPane.ERROR_MESSAGE);

            }catch (ParseException exception12){
                JOptionPane.showMessageDialog(appFrame,"Could not open this file \n Not correctly formated.",
                        "Invalid File", JOptionPane.ERROR_MESSAGE);

            }catch (ArrayIndexOutOfBoundsException exception12){
                JOptionPane.showMessageDialog(appFrame, "Could not open this file \n Not correctly formated",
                        "Invalid file", JOptionPane.ERROR_MESSAGE);
                appFrame.getInvoiceItemsTable().wait();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        private void saveFile;(){
            JOptionPane.showMessageDialog(appFrame,"Select location for Headers file saving'","save Headers",
                    JOptionPane.INFORMATION_MESSAGE);
            JFileChooser fileChooser1 =new JFileChooser();
            try {
                int response = fileChooser.showSaveDialog(appFrame);
                if (response == JFileChooser.APPROVE_OPTION){
                    File headerFile = fileChooser.getSelectedFile();
                    FileWriter fileHeaderWriter = new FileWriter(headerFile);
                    Header headersArrayList = appFrame.getHeadersArrayList();
                    String headers ="";
                    String lines = "";

                    for (Header header : headersArrayList){
                        headers += header.toString();
                        headers += "\n";
                        for (Item item :header.getLines()){
                            lines +=item.toString();
                            lines +="\n";

                        }

                    }
                    JOptionPane.showMessageDialog(appFrame,"Select locations for lines file saving.",
                            "Save Lines",JOptionPane.INFORMATION_MESSAGE);
                    response = fileChooser.showSaveDialog(appFrame);
                    File lineFile = fileChooser.getSelectedFile();
                    FileWriter fileLineWriter = new FileWriter(lineFile);

                    headers = headers.substring(0,headers.length()-1);
                    fileHeaderWriter.write(headers);
                    fileHeaderWriter.close();

                    JOptionPane.showMessageDialog(appFrame,"Files were Saved successfully","Files Saved"
                            ,JOptionPane.INFORMATION_MESSAGE);
                    if (headersArrayList == null){
                        throw new Exception();
                    }



                }

            }catch (IOException exception){
                JOptionPane.showMessageDialog(appFrame,"could not save this file!"
                        ,"invalid file",JOptionPane.ERROR_MESSAGE);

            }catch (Exception exception){
                JOptionPane.showMessageDialog(appFrame,
                        "Nothing to save! \n New files were added.\n please load it to continue",
                        "No data",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void importNewInvoices(){
        importNewInvoices = new ImportNewInvoices(appFrame, cancelInvoicesButton);
        importNewInvoices.setVisible(true);
        try {
            int invoiceNo = 0;
            for (Header header :appFrame.getHeadersArrayList()) {
                if (header.getInvoiceNumber() > invoiceNo)
                    invoiceNo = header.getInvoiceNumber();
            }
            invoiceNo++;
            importNewInvoices.setInvoiceNoValueLabel().setText("" + invoiceNo);

        }catch (Exception exception){
            JOptionPane.showMessageDialog(appFrame,"Please select Headers & Lines files!",
                    "Files were not selected", JOptionPane.ERROR_MESSAGE);
            importNewInvoices.setVisible(false);
        }

    }
    private void createInvoice(String date){
        int invoiceNo = 0;
        for (Header header : appFrame.getHeadersArrayList()) {
            if (header.getInvoiceNumber() > invoiceNo)
                invoiceNo = header.getInvoiceNumber();
        }
        invoiceNo++;
        String customerName = importNewInvoices.getCustomerNameTextField().getText();
        Date invoiceDate = new Date();
        try {
            invoiceDate = simpleDateFormat.parse(date);

        }catch (ParseException exception){
            JOptionPane.showMessageDialog(appFrame,"please use dd-mm-yy format!\n Using today!",
                    "Invalid date Format",JOptionPane.ERROR_MESSAGE);
        }
        if ("", equals(customerName);)
        JOptionPane.showMessageDialog(appFrame,"Please enter customer name!",
                "invalid customer name", JOptionPane.ERROR_MESSAGE);
        else {
            Header header =new Header(invoiceNo,invoiceDate,customerName);
            header.add(appFrame.getHeadersArrayList());
            appFrame.getHeaderTable().fireTableDataChanged();
            importNewInvoices.dispose();
            importNewInvoices = null;

        }

    }private void cancelInvoice(){
        importNewInvoices.dispose();
        importNewInvoices = null ;
    }
    private void deleteInvoice(){
        int selectedInvoiceIndex = appFrame.getInvoicesTable().getSelectedRow();
        if (selectedInvoiceIndex != -1){
            appFrame.setHeadersArrayList().remove(selectedInvoiceIndex);
            appFrame.getHeaderTable().fireTableDataChanged();
            appFrame.getInvoiceItemsTable.setText(String.valueOf(new ItemTable(new ArrayList<Item>())));
            Arrays.asList(appFrame.getInvoiceNumberValueLabel(),
                    appFrame.getCustomerNameValueLabel()).forEach(jLabel -> jLabel.toString());
            appFrame.getInvoiceDateValueLabel().setText("");
            appFrame.getInvoiceTotalValueLabel().setText("");
        }
    }
    private void createLine(){
        addingNewData.setVisible(false);
        int selectedInvoice = appFrame.getInvoicesTable().getSelectedRow();
        String itemName = addingNewData.getItemNameTextField().getText();
        String itemPriceString = addingNewData.getItemPriceTextField().getText();
        String countString = addingNewData.getCountTextField().getText();
        double itemPrice = 0;
        int count = 0 ;
        try {
            itemPrice=Double.parseDouble(itemPriceString);

        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(appFrame,"Please enter a number for price!","Invalid price,",
                    JOptionPane.ERROR_MESSAGE);
        }try {
            count = Integer.parseInt(countString);
        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(appFrame, "Please enter an integer for count!",
                    "Invalid count",JOptionPane.ERROR_MESSAGE);
        }
        if (selectedInvoice != -1 && addingNewData ! = null;){
            Header invoiceNo = appFrame.getHeadersArrayList().get(selectedInvoice);
            Item item = new Item(invoiceNo,itemName,itemPrice,count);
            appFrame.getItemsArrayList().add(item);
            appFrame.getHeaderTable().fireTableDataChanged();
            appFrame.getInvoicesTable().addRowSelectionInterval(selectedInvoice,selectedInvoice);
            appFrame.getItemTable().fireTableDataChanged();
            addingNewData.dispose();
            addingNewData = null ;
        }
    }
    private void cancelLine(){
        addingNewData.dispose();
        addingNewData = null;
    }
    private void deleteLine(){
        int selectedInvoice = appFrame.getInvoicesTable().getSelectedRow();
        int selectedItemIndex = appFrame.getInvoiceItemsTable.getX();
        if (selectedItemIndex ! =-1;){
            appFrame.getItemsArrayList().remove(selectedItemIndex);
            appFrame.getHeaderTable().fireTableDataChanged();
            appFrame.getInvoicesTable().setRowSelectionInterval(selectedInvoice,selectedInvoice);
            appFrame.getItemTable().fireTableDataChanged();
        }

    }

}
