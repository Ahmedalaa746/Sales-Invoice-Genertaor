package SalesVeiw.MainWeb;


import Controller.Headers;
import Controller.InvoiceSelectionListener;
import SalesSample.Header;
import SalesSample.HeaderTable;
import SalesSample.Item;
import SalesSample.ItemTable;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.GroupLayout.PREFERRED_SIZE;


public class App<createNewLine> extends JFrame{

    private JPanel invoicesTablePanel;
    private JScrollPane jscrollpane1;
    private JTable invoicesTable;
    private JPanel invoiceHeaderPanel;
    private JLabel invoiceNumberLabel;
    private JLabel invoiceDateLabel;
    private JLabel invoiceTotalLabel;
    private JLabel invoiceNumberValueLabel;
    private JLabel invoiceDataValueLabel;
    private JLabel invoiceTotalValueLabel;
    private JTable invoiceItemTable;
    private JButton deleteInvoiceButton;
    private JButton deleteLineButton;
    private JMenuBar jMenuBar1;
    private JMenu fileMenu;
    private Component invoicesTabelPanel;
    private GroupLayout invoicesTabelPanelLayout;
    private GroupLayout invoiceTabelPanelLayout;
    private Component invoiceDataLabel;
    private JLabel invoiceDateValueLabel;
    private Object Shot;
    private GroupLayout InvoiceHeaderPabelLayout;
    private Object invoiceTotal;
    private AbstractButton invoiceItemsTable;
    private Container invoiceItemsPanel;
    private JScrollPane JScrollPane2;
    private ActionListener actionsListener;
    private JComponent loadFileMenu;
    private Component invoiceTabelPanel;
    private Component InvoiceItemsPanel;
    private Component createNewLineBUtton;
    private JLabel invoiceNumberValueLbel;
    private String createNewInvoice;
    private createNewLine createNewLine;

    public App(){initComponents();
        invoiceItemsable = null;
    };

    private void initComponents(){

        invoicesTablePanel = new JPanel();
        jscrollpane1 = new JScrollPane();
        invoicesTable = new JTable();
        invoiceHeaderPanel =new JPanel();
        invoiceNumberLabel = new JLabel();
        invoiceDateLabel = new JLabel();
        customerNameLabel = new JLabel();
        invoiceTotalLabel =new JLabel();
        invoiceNumberValueLabel = new JLabel();
        invoiceDataValueLabel = new JLabel();
        customerNameValueLabel = new JLabel();
        invoiceTotalValueLabel = new JLabel();
        invoiceItemTable = new JTable();
        deleteInvoiceButton = new JButton();
        createNewInvoiceButton = new JButton();
        deleteLineButton = new JButton();
        createNewLineButton = new JButton();
        jMenuBar1= new JMenuBar();
        fileMenu = new JMenu();
        loadFileMenuItem = new JMenuItem();
        saveFileMenuItem = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(new Point(350,150));
        setPreferredSize(new Dimension(1100,650));
        setSize(new Dimension(1100,650));

        invoicesTabelPanel.getBounds();
        invoicesTable.setModel(new DefaultTableModel(
                new Object[][]{
                } ,
                new String[]{
                        "No.", "Date", "customer", "Total"
                }
        ));
        invoicesTable.getSelectionModel().addListSelectionListener(invoiceSelectionListener.get());
        jScrollPane1.setViewportView(invoicesTable);
        GroupLayout InvoicesTablePanelLayout = new GroupLayout(invoicesTablePanel);
        Dimension size = invoicesTabelPanel.size();
        invoicesTabelPanelLayout.setHorizontalGroup(
                invoiceTabelPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(GroupLayout.DEFAULT_SIZE)
                        .addComponent(jScrollPane1 , PREFERRED_SIZE, 500, PREFERRED_SIZE)
                        .addGap(0));
        invoicesTabelPanelLayout.setVerticalGroup(
                invoicesTabelPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE,430,Short.MAX_VALUE)
                        .addGap(0));

        invoiceNumberLabel.setText("Invoice Number");
        invoiceDataLabel.setVisible(Boolean.parseBoolean("InvoiceDate"));
        customerNameLabel.setText("Customer Name");
        invoiceTotalLabel.setText("Invoice Total");
        GroupLayout invoiceHeaderPanelLayout = new GroupLayout(invoiceHeaderPanel);
        InvoicesTablePanelLayout.linkSize();
        Object MAX_VALUE = null;
        invoiceHeaderPanelLayout.setHorizontalGroup(
                invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                                                                        .addGap(5,5,5)
                                                                        .addComponent(invoiceNumberLabel , PREFERRED_SIZE,100, PREFERRED_SIZE)
                                                                )
                                                ).addComponent(invoiceDateLabel, GroupLayout.Alignment.TRAILING, PREFERRED_SIZE,100, PREFERRED_SIZE)
                                ).addComponent(customerNameLabel, GroupLayout.Alignment.TRAILING, PREFERRED_SIZE,97, PREFERRED_SIZE))

                        ).addComponent(invoiceTotalLabel, GroupLayout.Alignment.TRAILING, PREFERRED_SIZE,97, PREFERRED_SIZE));
               // .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                 //       .addGroup(GroupLayout.Alignment.TRAILING,invoiceHeaderPanelLayout.createSequentialGroup()
                   //             .addGap(10,10,10)
                     //           .addGroup(invoiceHeaderPanelLayout,
                                 //       PREFERRED_SIZE,
                                   //     135,
                                     //   PREFERRED_SIZE;))
                       // .addGroup(invoiceHeaderPanelLayout.createParallelGroup())
                       // .addGroup(invoiceHeaderPanelLayout.createSequentialGroup())
                        //.addGap(10,10,10)
                        //.addComponent(invoiceNumberValueLabel, PREFERRED_SIZE,135, PREFERRED_SIZE))
                //.addGroup(GroupLayout.Alignment.TRAILING,invoiceHeaderPanelLayout.createSequentialGroup()
                  //      .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    //    .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING,false)
                      //          .addGroup(customerNameValueLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,short.MAX_VALUE)
                        //        .addGroup(invoiceTotalValueLabel,
                                      //  GroupLayout.DEFAULT_SIZE,
                                       // 138,
          //                              MAX_VALUE)))))
        //.addGap(285,Short.MAX_VALUE);

        //)InvoiceHeaderPabelLayout.setVerticalGroup(
                invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceNumberValueLabel)
                                        .addComponent(invoiceNumberLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(invoiceDateValueLabel)
                                        .addComponent(invoiceDataLabel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(invoiceHeaderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(customerNameValueLabel)
                                        .addComponent(customerNameLabel))
        ).addGap(LayoutStyle.ComponentPlacement.RELATED.ordinal())
                        .addComponent(invoiceTotalValueLabel);
            //    .addGroup(invoiceHeaderPanelLayout.createSequentialGroup()
              //          .addGap(80,80,80)
                //        .addGroup(invoiceTotal.Label));
        addGap(GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE);

        invoiceItemsPanel.setBounds(null);
        invoiceItemsTable.setModel(new DefualtTabelModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        JScrollPane2.setViewportView(invoiceItemsTable);

        GroupLayout invoiceItemPanelLayout =new GroupLayout(invoiceItemsPanel);
        invoiceItemsPanel.size();
        invoiceItemPanelLayout.setHorizontalGroup(
                invoiceItemPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0,0,Short.MAX_VALUE)
                        .addGroup(invoiceItemPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING))
                        .addGroup(invoiceItemPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE,485,Short.MAX_VALUE)
                                .addContainerGap()));
        deleteInvoiceButton.setText("Delete Invoice");
        deleteInvoiceButton.addActionListener(actionsListener);

        createNewInvoiceButton.setText("Create New Invoice");
        createNewInvoiceButton.addActionListener(actionsListener);
        createNewLineButton.setText("Create New Line");
        createNewLineButton.addActionListener(actionsListener);

        deleteLineButton.setText("Delete Line");
        deleteLineButton.addActionListener(actionsListener);

        fileMenu.setText("File");

        loadFileMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0,
                InputEvent.CTRL_DOWN_MASK));
        loadFileMenu.setVisible(Boolean.parseBoolean("Load File"));
        loadFileMenuItem.addActionListener(actionsListener);
        fileMenu.add(loadFileMenuItem);

        saveFileMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,
                InputEvent.CTRL_DOWN_MASK));
        saveFileMenuItem.setText("save File");
        saveFileMenuItem.addActionListener(actionsListener);
        fileMenu.add(saveFileMenuItem);

        jMenuBar1.add(fileMenu);
        setJMenuBar(jMenuBar1);

        GroupLayout layout= new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(invoiceTabelPanel , PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(invoiceItemsPanel , GroupLayout.DEFAULT_SIZE , GroupLayout.DEFAULT_SIZE ,Short.MAX_VALUE)
                                )
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70,70,70)
                                .addComponent(createNewInvoiceButton)
                                .addGap(105,105,105)
                                .addComponent(deleteInvoiceButton)
                                .addGap(230,230,230)
                                .addComponent(createNewLineButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                                .addComponent(deleteLineButton)
                                .addGap(80,80,80))
                        );layout.setVerticalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING ,false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(invoiceHeaderPanel, PREFERRED_SIZE,100 ,
                                                                        PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(InvoiceItemsPanel, GroupLayout.DEFAULT_SIZE,
                                                                        GroupLayout.DEFAULT_SIZE ,Short.MAX_VALUE))
                                                        .addComponent(invoicesTabelPanel, PREFERRED_SIZE ,
                                                                GroupLayout.DEFAULT_SIZE, PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(createNewInvoiceButton)
                                                                .addComponent(createNewLineBUtton)
                                                                .addComponent(deleteLineButton))
                                                        .addComponent(deleteInvoiceButton))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE ,Short.MAX_VALUE))

        );
                        pack();
    }

    private void addGap(int i, short maxValue) {

    }


    public static void main (String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);}
        });

    }

    private JButton createNewLineButton;
    private JButton createNewInvoiceButton;
    private JButton DeleteInvoiceButton;
    private JButton DeleteLineButton;
    private JPanel InvoiceHeaderPanel;
    private JPanel InvoiceItemPanel;
    private JPanel InvoiceTablePanel;
    private JLabel InvoiceDateLabel;
    private JLabel customerNameLabel;
    private JLabel InvoiceDateValueLabel;
    private JLabel customerNameValueLabel;
    private JLabel InvoiceNumberLabel;
    private JLabel InvoiceNumberValueLabel;
    private JLabel InvoiceTotalLabel;
    private JLabel InvoiceTotalValueLabel;
    private JTable InvoicesTable;
    private JTable InvoiceItemsTable;
    private JMenu FileMenu;
    private JMenuBar jMenuBar;
    private JMenuItem loadFileMenuItem;
    private JMenuItem saveFileMenuItem;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;

    private ActionListener actionListener= e -> {

    };

    private final ThreadLocal<InvoiceSelectionListener> invoiceSelectionListener = new ThreadLocal<InvoiceSelectionListener>();

    private ArrayList<Item> itemsArrayList;
    private ArrayList<Headers> headersArrayList;
    private HeaderTable headerTable =new HeaderTable();
    private ItemTable itemTable=new ItemTable();
    private AbstractButton cancelInvoicesButton;
    ImportNewInvoices importNewInvoices =new ImportNewInvoices (this, cancelInvoicesButton);
    AddingNewData addingNewData =new AddingNewData(this);
    public ActionListener getActionListener() {return actionListener;}
    public ArrayList<Item> getItemsArrayList(){return itemsArrayList;}
    public void setItemsArrayList(ArrayList<Item>itemsArrayList){this.itemsArrayList=itemsArrayList;}
    public void setActionListener(ActionListener actionListener){this.actionListener=actionListener;}
    public void  setHeadersArrayList(ArrayList<Headers>headersArrayList){this.headersArrayList=headersArrayList;}
    public ArrayList<Headers> getHeadersArrayList(){
        ArrayList<Headers> headersArrayList1 = headersArrayList;
        return headersArrayList1;}
    public Headers getNo(int no) {
        for (Headers headers : headersArrayList) {
            Object o = null;
            if (headers.get(o) == no) {
                return headers;
            }
        }
        return null;
    }
    public JTable getInvoicesTable() {return InvoicesTable ;}

    public void setInvoiceTable (JTable invoicesTable) {this.InvoicesTable =invoicesTable;}

    public void setHeaderTable (HeaderTable headerTable) {this. headerTable = headerTable;}

    public HeaderTable getHeaderTable() {
        return headerTable;
    }


    public ItemTable getItemTable() {
        return itemTable;
    }

    public  void  setItemTable() {
    }
    public JLabel getCustomerNameValueLabel(){return customerNameValueLabel;}
    public void  setCustomerNameValueLabel (JLabel customerNameValueLabel){ this.customerNameValueLabel=customerNameValueLabel;}
    public  JLabel getInvoiceDateValueLabel;
    private final Object invoiceDatavaluelabel = null;

    {
        Object invoiceDatavaluelabel1 = invoiceDatavaluelabel;
        Object invoiceDatavaluelabel11 = invoiceDatavaluelabel1;
        }
    public void setInvoiceDateValueLabel(JLabel invoiceDateValueLabel) {this.invoiceDataValueLabel =invoiceDateValueLabel;}

    public JLabel getInvoiceNumberValueLabel() {return invoiceNumberValueLbel;}
    public void setInvoiceNumberValueLabel (JLabel invoiceNumberValueLabel){this.invoiceNumberValueLabel =invoiceNumberValueLabel;}

    public JLabel getInvoiceTotalValueLabel(){return invoiceTotalValueLabel;}

    public void setInvoiceTotalValueLabel(JLabel invoiceTotalValueLabel){this.invoiceTotalValueLabel =invoiceTotalValueLabel;}
    public JLabel getInvoiceItemsTable;
    private Object invoiceItemsable = null;

    {
        AbstractButton invoiceItemsTable1 = invoiceItemsTable;
        Object invoiceItemsable1 = invoiceItemsable;
        ;}

    public void setInvoiceItemsTable(JLabel invoiceItemsTable){this.invoiceItemTable=invoiceItemTable;}

    public String getCreateNewInvoice() {
        return createNewInvoice;
    }

    public void setCreateNewInvoice(String createNewInvoice) {
        this.createNewInvoice = createNewInvoice;
    }

    public createNewLine AddingNewDatagetCreateNewLine() {
        return createNewLine;
    }

    public void setCreateNewLine() {
        setCreateNewLine(null);
    }

    public void setCreateNewLine(AddingNewData createNewLine){this.addingNewData=createNewLine;}

    public List<Object> setHeadersArrayList() {
        return null;
    }

    public ActionListener getActionsListener() {
        return actionsListener;
    }

    public void setActionsListener(ActionListener actionsListener) {
        this.actionsListener = actionsListener;
    }

    public Object getInvoiceItemsTable() {
        Object o = null;
        return o;
    }

    public JLabel getInvoiceDateValueLabel() {
        return invoiceDateValueLabel;
    }

    public Header[] getHeadersArrayList(Object o) {
        return new Header[0];
    }

    private class DefualtTabelModel implements ButtonModel {
        public DefualtTabelModel(Object[][] objects, String[] strings) {
        }

        @Override
        public boolean isArmed() {
            return false;
        }

        @Override
        public boolean isSelected() {
            return false;
        }

        @Override
        public boolean isEnabled() {
            return false;
        }

        @Override
        public boolean isPressed() {
            return false;
        }

        @Override
        public boolean isRollover() {
            return false;
        }

        @Override
        public void setArmed(boolean b) {

        }

        @Override
        public void setSelected(boolean b) {

        }

        @Override
        public void setEnabled(boolean b) {

        }

        @Override
        public void setPressed(boolean b) {

        }

        @Override
        public void setRollover(boolean b) {

        }

        @Override
        public void setMnemonic(int key) {

        }

        @Override
        public int getMnemonic() {
            return 0;
        }

        @Override
        public void setActionCommand(String s) {

        }

        @Override
        public String getActionCommand() {
            return null;
        }

        @Override
        public void setGroup(ButtonGroup group) {

        }

        @Override
        public void addActionListener(ActionListener l) {

        }

        @Override
        public void removeActionListener(ActionListener l) {

        }

        @Override
        public Object[] getSelectedObjects() {
            return new Object[0];
        }

        @Override
        public void addItemListener(ItemListener l) {

        }

        @Override
        public void removeItemListener(ItemListener l) {

        }

        @Override
        public void addChangeListener(ChangeListener l) {

        }

        @Override
        public void removeChangeListener(ChangeListener l) {

        }
    }
};

























