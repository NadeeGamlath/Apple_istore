package View;

import Controller.CategoryController;
import Controller.ProductController;
import Controller.UserController;
import Controller.UserTypeController;
import Model.Category;
import Model.Product;
import Model.User;
import Model.UserType;
import java.awt.Color;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ManagerView extends javax.swing.JFrame {

    List<Product> productList;
    List<User> userList;
    Product oldproduct;
    User olduser;
    
    public ManagerView() {
        initComponents();
        initilize();
    }

    public void initilize() {
        loadView();
        loadViewUser();
    }

    public void loadForm() {
        List<Category> categories = CategoryController.get();
        Vector gnd = new Vector();
        gnd.add("Select a Category");
        for (Category cat : categories) {
            gnd.add(cat);
        }
        DefaultComboBoxModel<String> catModel = new DefaultComboBoxModel(gnd);
        jComboBox1.setModel(catModel);

    }
    public void loadFormUser() {
        List<UserType> userTypes = UserTypeController.get();
        Vector typ = new Vector();
        typ.add("Select a User Type");
        for (UserType type : userTypes) {
            typ.add(type);
        }
        DefaultComboBoxModel<String> typeModel = new DefaultComboBoxModel(typ);
        jComboBox2.setModel(typeModel);

    }
    public void loadView() {
        productList = ProductController.get(null);
        fillTable(productList);

        List<Category> categoryList = CategoryController.get();
        Vector<Object> categories = new Vector<>();
        categories.add("Select a Category");

        for (Category cat : categoryList) {
            categories.add(cat.getName());
        }

        DefaultComboBoxModel<String> catModel = new DefaultComboBoxModel(categories);
         DefaultComboBoxModel<String> catModel2 = new DefaultComboBoxModel(categories);
        jComboBox1.setModel(catModel);
        jComboBox4.setModel(catModel2);
    }
      public void loadViewUser() {
        userList = UserController.get(null);
        fillTableUser(userList);

        List<UserType> userTypeList = UserTypeController.get();
        Vector<Object> userTypes = new Vector<>();
        userTypes.add("Select a User Type");

        for (UserType type : userTypeList) {
            userTypes.add(type.getName());
        }

        DefaultComboBoxModel<String> typeModel = new DefaultComboBoxModel(userTypes);
        jComboBox2.setModel(typeModel);
    }
    public void fillTable(List<Product> products) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Product pro : products) {
            Vector d = new Vector();
            d.add(pro.getId());
            d.add(pro.getName().toString());
            d.add(pro.getPrice());
            d.add(pro.getQty());
            d.add(pro.getCategory());
            System.out.println(pro.getPrice());

            model.addRow(d);

        }

    }
    public void fillTableUser(List<User> users) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (User usr : users) {
            Vector d = new Vector();
            d.add(usr.getId());
            d.add(usr.getName().toString());
            d.add(usr.getNic());
            d.add(usr.getEmail());
            d.add(usr.getMobile());
            d.add(usr.getUserType());
           
            model.addRow(d);

        }

    }

    public void fillForm(Product product) {
        oldproduct = product;
        txtName.setText(product.getName());
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtQty.setText(String.valueOf(product.getQty()));
        jComboBox1.setSelectedIndex(product.getCategory().getId());

    }
    public void fillFormUser(User user) {
        olduser = user;
        txtNameUser.setText(user.getName());
        txtNicUser.setText(user.getNic());
        txtMobileUser.setText(user.getMobile());
        txtEmailUser.setText(user.getEmail());
        jComboBox2.setSelectedIndex(user.getUserType().getId());

    }
    public void clearForm(){
        JTextField [] arr = {txtName,txtPrice,txtQty,jTextField1,txtSearch};
        for(JTextField x: arr){
            x.setText("");
        x.setBackground(Color.white);
        }
        jComboBox1.setBackground(Color.white);

    }
    public void clearFormUser(){
        JTextField [] arr = {txtNameUser,txtNicUser,txtMobileUser,txtEmailUser,};
        for(JTextField x: arr){
            x.setText("");
            x.setBackground(Color.white);
        }
        jComboBox2.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblSearch1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmailUser = new javax.swing.JTextField();
        txtMobileUser = new javax.swing.JTextField();
        txtNicUser = new javax.swing.JTextField();
        txtNameUser = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnAddUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Category"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setText("search by category");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblSearch1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSearch1.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch1.setText("search by name");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quantity");

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAdd)
                                .addGap(31, 31, 31)
                                .addComponent(btnUpdate)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnDelete)
                                        .addGap(33, 33, 33)
                                        .addComponent(btnClear))
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSearch1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSearch)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton6)))
                                .addGap(11, 11, 11)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearch1)
                            .addComponent(jLabel1)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearch)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(16, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnClear))
                        .addGap(30, 30, 30)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("Product Details", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Type");

        txtNicUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicUserActionPerformed(evt);
            }
        });

        btnAddUser.setText("Add");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setText("Delete");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setText("Update");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "NIC", "Email", "Mobile", "User Type"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton10.setText("clear");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Search By Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAddUser)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteUser)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateUser)
                                .addGap(30, 30, 30)
                                .addComponent(jButton10))
                            .addComponent(txtEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMobileUser, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNicUser, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGap(28, 28, 28))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNicUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMobileUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(btnUpdateUser)
                    .addComponent(btnDeleteUser)
                    .addComponent(btnAddUser))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("User Details", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Product Details");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText(" ");
        txtPrice.setText(" ");
        txtQty.setText("");
        jComboBox1.setSelectedIndex(0);

    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        txtNameUser.setText(" ");
        txtNicUser.setText(" ");
        txtMobileUser.setText(" ");
        txtEmailUser.setText(" ");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Product product = new Product();
        String error = "";
        String name = txtName.getText();
        if (name != "") {
            product.setName(name);
            txtName.setBackground(Color.green);
        } else {
            txtName.setBackground(Color.red);
            error = error + "\n Invalid name";
        }
        String priceText = txtPrice.getText();
        double price;
        try {
            price = Double.parseDouble(priceText);
            if (price < 0) {
                txtPrice.setBackground(Color.red);
                error = error + "\n Invlid price";
            } else {
                txtPrice.setBackground(Color.green);
                product.setPrice(price);
            }
        } catch (NumberFormatException e) {
            txtPrice.setBackground(Color.red);
            error = error + "\n Invlid price";
        }
        String qtyText = txtQty.getText();
        int qty = Integer.parseInt(qtyText) ;
        try{if (qty < 0) {
                txtQty.setBackground(Color.red);
                error = error + "\n Invlid quantity";
            } else {
                txtQty.setBackground(Color.green);
                product.setQty(qty);
            }
        } catch (NumberFormatException e) {
            txtPrice.setBackground(Color.red);
            error = error + "\n Invlid quantity";
        }
        int catIndex = jComboBox1.getSelectedIndex();
        Object catValue = jComboBox1.getSelectedItem();

        if (catIndex != 0) {
            jComboBox1.setBackground(Color.green);
            Category catobj = new Category();
            catobj.setId(catIndex);
            catobj.setName(catValue.toString());
            product.setCategory(catobj);

        } else {
            jComboBox1.setBackground(Color.red);
            error = error + "\n select a category";
        }
        if (error.isEmpty()) {
            String cnfmsg = "Are you sure to save following details ?\n\n";
            cnfmsg = cnfmsg + "\n Name : " + product.getName();
            cnfmsg = cnfmsg + "\n Price : " + product.getPrice();
             cnfmsg = cnfmsg + "\n Quantity : " + product.getQty();
            cnfmsg = cnfmsg + "\n Category : " + product.getCategory().getName();
            int conf = JOptionPane.showConfirmDialog(null, cnfmsg);
            if (conf == 0) {
                String st = ProductController.post(product);
                if (st.equals("1")) {
                    JOptionPane.showMessageDialog(null, "successfully saved");
                    loadView();
                    loadForm();
                }
            }

        } else {
            JOptionPane.showConfirmDialog(null, error);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        User user = new User();
        String error = "";
        String name = txtNameUser.getText();
        if (name != "") {
            user.setName(name);
            txtNameUser.setBackground(Color.green);
        } else {
            txtNameUser.setBackground(Color.red);
            error = error + "\n Invalid name";
        }
        String nic = txtNicUser.getText();
        if (nic != "") {
            user.setNic(nic);
            txtNicUser.setBackground(Color.green);
        } else {
            txtNicUser.setBackground(Color.red);
            error = error + "\n Invalid nic";
        }
        String mobile = txtMobileUser.getText();
        if(mobile.matches("^[0-9]{10}$")){
            user.setMobile(mobile);
            txtMobileUser.setBackground(Color.green);
        }else{
            txtMobileUser.setBackground(Color.red);
            error = error +"\n Invalid Mobile";
        }
        String email = txtEmailUser.getText();
        if (email != "") {
            user.setEmail(email);
            txtEmailUser.setBackground(Color.green);
        } else {
            txtEmailUser.setBackground(Color.red);
            error = error + "\n Invalid Email";
        }
        
        int userIndex = jComboBox2.getSelectedIndex();
        Object userValue = jComboBox2.getSelectedItem();

        if (userIndex != 0) {
            jComboBox2.setBackground(Color.green);
            UserType usrobj = new UserType();
            usrobj.setId(userIndex);
            usrobj.setName(userValue.toString());
            user.setUserType(usrobj);

        } else {
            jComboBox2.setBackground(Color.red);
            error = error + "\n select a User";
        }
        if (error.isEmpty()) {
            String cnfmsg = "Are you sure to save following details ?\n\n";
            cnfmsg = cnfmsg + "\n Name : " + user.getName();
            cnfmsg = cnfmsg + "\n Nic : " + user.getNic();
            cnfmsg = cnfmsg + "\n Mobile : " + user.getMobile();
            cnfmsg = cnfmsg + "\n Email : " + user.getEmail();
            cnfmsg = cnfmsg + "\n UserType : " + user.getUserType().getName();
            int conf = JOptionPane.showConfirmDialog(null, cnfmsg);
            if (conf == 0) {
                String st = UserController.post(user);
                if (st.equals("1")) {
                    JOptionPane.showMessageDialog(null, "successfully saved");
                    loadViewUser();
                    loadFormUser();
                }
            }
            } else {
            JOptionPane.showConfirmDialog(null, error);
        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if (row > -1) {
            Product product = productList.get(row);
            fillForm(product);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Product product = new Product();
        String error = "";
        String updates = "";
        product.setId(oldproduct.getId());

        String name = txtName.getText();

        if (name != "") {
            if (name.equals(oldproduct.getName())) {
                product.setName(oldproduct.getName());
                txtName.setBackground(Color.green);
            } else {
                product.setName(name);
                txtName.setBackground(Color.yellow);
                updates = updates + "\n Name updated";
            }
        } else {
            txtName.setBackground(Color.red);
            error = error + "\n Invalid name";
        }
        String price = txtPrice.getText();
        if (price != "") {
            if (price.equals(oldproduct.getPrice())) {
                product.setPrice(oldproduct.getPrice());
                txtPrice.setBackground(Color.green);
            } else {
                product.setPrice(Double.parseDouble(price));
                txtPrice.setBackground(Color.yellow);
                updates = updates + "\n Price updated";
            }

        } else {
            txtPrice.setBackground(Color.red);
            error = error + "\n Invalid Price";

        }
        String qty = txtQty.getText();
        if (qty != "") {
            if (qty.equals(oldproduct.getQty())) {
                product.setQty(oldproduct.getQty());
                txtQty.setBackground(Color.green);
            } else {
                product.setQty(Integer.parseInt(qty));
                txtQty.setBackground(Color.yellow);
                updates = updates + "\n Qty updated";
            }

        } else {
            txtQty.setBackground(Color.red);
            error = error + "\n Invalid qty";

        }
        int catIndex = jComboBox1.getSelectedIndex();
        Object catValue = jComboBox1.getSelectedItem();
        if (catIndex != 0) {

            Category catObj = new Category();
            catObj.setId(catIndex);
            catObj.setName(catValue.toString());

            if (catObj.getId() == oldproduct.getCategory().getId()) {
                product.setCategory(oldproduct.getCategory());
            } else {
                product.setCategory(catObj);
                jComboBox1.setBackground(Color.yellow);
                updates = updates + "\n Category Updated";
            }
        } else {
            jComboBox1.setBackground(Color.red);
            error = error + "\n Select a Category";
        }
        if (error.isEmpty()) {

            if (!updates.isEmpty()) {
                int resp = JOptionPane.showConfirmDialog(null, "You have following updates\n\n" + updates);
                if (resp == 0) {

                    String status = ProductController.put(product);

                    if (status.equals("1")) {

                        int srow = jTable1.getSelectedRow();
                        loadView();

                        jTable1.setRowSelectionInterval(srow, srow);
                        loadForm();
                        JOptionPane.showMessageDialog(null, "Successfully updated \n\n" + status);


    }//GEN-LAST:event_btnUpdateActionPerformed
    }                   
            }}
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int resp = JOptionPane.showConfirmDialog(null,"\n Are You Sure to delete following person ?\n"+oldproduct.getName());
        if(resp==0){
                String status =ProductController.delete(oldproduct);
            if(status.equals("1")){
                loadView();
                loadForm();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                clearForm();

            }
            else{
                JOptionPane.showMessageDialog(null, "Faild to delete");
    }//GEN-LAST:event_btnDeleteActionPerformed
 }
    }
    private void txtNicUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
      User user = new User();
        String error = "";
        String updates = "";
        user.setId(olduser.getId());

        String name = txtNameUser.getText();
        
        if (name != "") {
            if (name.equals(olduser.getName())) {
                user.setName(olduser.getName());
                txtNameUser.setBackground(Color.green);
            } else {
                user.setName(name);
                txtNameUser.setBackground(Color.yellow);
                updates = updates + "\n Name updated";
            }
        } else {
            txtNameUser.setBackground(Color.red);
            error = error + "\n Invalid name";
        }
        String nic = txtNicUser.getText();
        if (nic != "") {
            if (nic.equals(olduser.getNic())) {
                user.setName(olduser.getNic());
                txtNicUser.setBackground(Color.green);
            } else {
                user.setNic(nic);
                txtNicUser.setBackground(Color.yellow);
                updates = updates + "\n NIC updated";
            }
        } else {
            txtNicUser.setBackground(Color.red);
            error = error + "\n Invalid NIC";
        }
        String mobile = txtMobileUser.getText();
        if (mobile != "") {
            if (mobile.equals(olduser.getMobile())) {
                user.setMobile(olduser.getMobile());
                txtMobileUser.setBackground(Color.green);
            } else {
                user.setMobile(mobile);
                txtMobileUser.setBackground(Color.yellow);
                updates = updates + "\n Mobile updated";
            }
        } else {
            txtMobileUser.setBackground(Color.red);
            error = error + "\n Invalid Mobile";
        }
        String email = txtEmailUser.getText();
        if (email != "") {
            if (email.equals(olduser.getEmail())) {
                user.setEmail(olduser.getEmail());
                txtEmailUser.setBackground(Color.green);
            } else {
                user.setEmail(email);
                txtEmailUser.setBackground(Color.yellow);
                updates = updates + "\n Email updated";
            }
        } else {
            txtEmailUser.setBackground(Color.red);
            error = error + "\n Invalid Email";
        }
        
        int userIndex = jComboBox2.getSelectedIndex();
        Object userValue = jComboBox2.getSelectedItem();
        if (userIndex != 0) {

            UserType usrObj = new UserType();
            usrObj.setId(userIndex);
            usrObj.setName(userValue.toString());

            if (usrObj.getId() == olduser.getUserType().getId()) {
                user.setUserType(olduser.getUserType());
            } else {
                user.setUserType(usrObj);
                jComboBox2.setBackground(Color.yellow);
                updates = updates + "\n User Type Updated";
            }
        } else {
            jComboBox2.setBackground(Color.red);
            error = error + "\n Select a User Type";
        }
        if (error.isEmpty()) {

            if (!updates.isEmpty()) {
                int resp = JOptionPane.showConfirmDialog(null, "You have following updates\n\n" + updates);
                if (resp == 0) {

                    String status = UserController.put(user);

                    if (status.equals("1")) {

                        int srow = jTable2.getSelectedRow();
                        loadViewUser();

                        jTable2.setRowSelectionInterval(srow, srow);
                        loadFormUser();
                        JOptionPane.showMessageDialog(null, "Successfully updated \n\n" + status);
    }                                         
    }                   
            }}
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        int resp = JOptionPane.showConfirmDialog(null,"\n Are You Sure to delete following person ?\n"+olduser.getName());
        if(resp==0){
                String status =UserController.delete(olduser);
            if(status.equals("1")){
                loadViewUser();
                loadFormUser();
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                clearFormUser();

            }
            else{
                JOptionPane.showMessageDialog(null, "Faild to delete");
    }                                         
 }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       int row = jTable2.getSelectedRow();
        if (row > -1) {
            User user = userList.get(row);
            fillFormUser(user);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
    }//GEN-LAST:event_txtSearchKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION);
    
        if (result == JOptionPane.YES_OPTION) {
            LoginView log = new LoginView();
            log.show();
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION);
    
        if (result == JOptionPane.YES_OPTION) {
            LoginView log = new LoginView();
            log.show();
            dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String name = jTextField1.getText();
      Hashtable<String, Object> hash = new Hashtable<>();
       if (!name.isEmpty()) {
            hash.put("name", name);
        }else {
            hash = null;
        }
       userList = UserController.get(hash);
        fillTableUser(userList);
       
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int conf = JOptionPane.showConfirmDialog(null,"Are you sure to clear this form ?");
        if(conf ==0){
            loadViewUser();
            clearForm();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      String name = txtSearch.getText();
        Object cmb = jComboBox4.getSelectedIndex();
        System.out.println(cmb);
        Object category = null;
        Hashtable<String, Object> hash = new Hashtable<>();
        if (!cmb.equals(0)) {
            category = cmb; 
            System.out.println(category);
        }
        if (!name.isEmpty()) {
            hash.put("name", name);
        } else if (category != null) {
            hash.put("category",category);
            System.out.println(category);
        } else {
            hash = null;
        }

        productList = ProductController.get(hash);
        fillTable(productList);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        clearForm();
        loadView();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed
       
        /**
         * @param args the command line arguments
         */
     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSearch1;
    private javax.swing.JTextField txtEmailUser;
    private javax.swing.JTextField txtMobileUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JTextField txtNicUser;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    void hideJPanel2() {
       jTable2.setVisible(false);
       jComboBox2.setEnabled(false);
       btnAddUser.setEnabled(false);
       btnDeleteUser.setEnabled(false);
       btnUpdateUser.setEnabled(false);
       txtNicUser.setEnabled(false);
       txtNameUser.setEnabled(false);
       txtMobileUser.setEnabled(false);
       txtEmailUser.setEnabled(false); 
    }
    void hideJPanel1() {
      jComboBox1.setEnabled(false);
       btnAdd.setEnabled(false);
       btnDelete.setEnabled(false);
       btnUpdate.setEnabled(false);
       txtPrice.setEnabled(false);
       txtName.setEnabled(false);
      
    }
}
