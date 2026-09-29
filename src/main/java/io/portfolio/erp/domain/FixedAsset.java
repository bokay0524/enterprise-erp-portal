package io.portfolio.erp.domain;
import java.math.BigDecimal;
public class FixedAsset {
  private String assetNo,assetName,department,ownerName,locationName,acquisitionDate,assetStatus,lastInspectedDate; private BigDecimal acquisitionCost;
  public String getAssetNo(){return assetNo;} public void setAssetNo(String v){assetNo=v;} public String getAssetName(){return assetName;} public void setAssetName(String v){assetName=v;}
  public String getDepartment(){return department;} public void setDepartment(String v){department=v;} public String getOwnerName(){return ownerName;} public void setOwnerName(String v){ownerName=v;}
  public String getLocationName(){return locationName;} public void setLocationName(String v){locationName=v;} public String getAcquisitionDate(){return acquisitionDate;} public void setAcquisitionDate(String v){acquisitionDate=v;}
  public BigDecimal getAcquisitionCost(){return acquisitionCost;} public void setAcquisitionCost(BigDecimal v){acquisitionCost=v;} public String getAssetStatus(){return assetStatus;} public void setAssetStatus(String v){assetStatus=v;}
  public String getLastInspectedDate(){return lastInspectedDate;} public void setLastInspectedDate(String v){lastInspectedDate=v;}
}
