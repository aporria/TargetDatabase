import java.sql.*;

public class ProductItem {
    private int prodID;
    //private float prodPrice, prodWeight;
    private boolean prodPerishable;
    private String prodDescription;
    private String prodName;
    private String prodPhoto;

    public ProductItem()
    {
        prodID = 0;
        prodPerishable = false;
        prodDescription = "";
        prodName = "";
        prodPhoto = "";
    }

    public ProductItem(int prodID, boolean prodPerishable, String prodDescription, String prodName, String prodPhoto) {
        this.prodID = prodID;
        this.prodPerishable = prodPerishable;
        this.prodDescription = prodDescription;
        this.prodName = prodName;
        this.prodPhoto = prodPhoto;
    }


    public int getProdID(){
        return prodID;
    }

    public boolean isProdPerishable(){
        return prodPerishable;
    }

    public String displayProdDescript(){
        return prodDescription;
    }

    public String displayProdName()
    {
        return prodName;
    }

    public String getProdPhoto() {
        return prodPhoto;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public void setProdPerishable(boolean prodPerishable) {
        this.prodPerishable = prodPerishable;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdPhoto(String prodPhoto) {
        this.prodPhoto = prodPhoto;
    }

    public String dbGetProdName(int ID){
        String result = " ";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jpacio123");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT name FROM mydb.productitem WHERE productID = '" + ID + "'");

            resultSet.next();

            result = resultSet.getString("name");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public String dbGetProdDescription(int ID){
        String result = " ";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jpacio123");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT description FROM mydb.productitem WHERE productID = '" + ID + "'");

            resultSet.next();

            result = resultSet.getString("description");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public String dbGetProdPhoto(int ID){
        String result = " ";
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jpacio123");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT photo FROM mydb.productitem WHERE productID = '" + ID + "'");

            resultSet.next();

            result = resultSet.getString("photo");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public boolean dbGetProdPerishable(int ID){
        boolean result = true;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "jpacio123");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT perishable FROM mydb.productitem WHERE productID = '" + ID + "'");

            resultSet.next();

            result = resultSet.getBoolean("perishable");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args)
    {
        ProductDAO product = new ProductDAO();
        ProductItem prod = new ProductItem();
        prod.setProdID(1017);
        prod.setProdPerishable(true);
        prod.setProdName("bananas");
        prod.setProdPhoto("banana");
        prod.setProdDescription("banana");
        product.add(prod);
    }
}