import java.sql.*;

public class ProductItem {
    private int prodID;
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

}