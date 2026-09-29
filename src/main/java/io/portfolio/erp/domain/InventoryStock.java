package io.portfolio.erp.domain;
import java.math.BigDecimal;
public class InventoryStock {
  private String itemCode,itemName,category,warehouse,updatedAt; private int stockQty,reservedQty; private BigDecimal unitPrice;
  public String getItemCode(){return itemCode;} public void setItemCode(String v){itemCode=v;} public String getItemName(){return itemName;} public void setItemName(String v){itemName=v;}
  public String getCategory(){return category;} public void setCategory(String v){category=v;} public String getWarehouse(){return warehouse;} public void setWarehouse(String v){warehouse=v;}
  public int getStockQty(){return stockQty;} public void setStockQty(int v){stockQty=v;} public int getReservedQty(){return reservedQty;} public void setReservedQty(int v){reservedQty=v;}
  public int getAvailableQty(){return stockQty-reservedQty;} public BigDecimal getUnitPrice(){return unitPrice;} public void setUnitPrice(BigDecimal v){unitPrice=v;}
  public String getUpdatedAt(){return updatedAt;} public void setUpdatedAt(String v){updatedAt=v;}
}
