package io.portfolio.erp.domain;
public class AssetChangeRequest {
  private Long requestId; private String assetNo,assetName,requesterId,requestedDepartment,requestedOwner,requestedLocation,reason,requestStatus,requestedAt,decidedBy,decidedAt;
  public Long getRequestId(){return requestId;} public void setRequestId(Long v){requestId=v;} public String getAssetNo(){return assetNo;} public void setAssetNo(String v){assetNo=v;}
  public String getAssetName(){return assetName;} public void setAssetName(String v){assetName=v;} public String getRequesterId(){return requesterId;} public void setRequesterId(String v){requesterId=v;}
  public String getRequestedDepartment(){return requestedDepartment;} public void setRequestedDepartment(String v){requestedDepartment=v;} public String getRequestedOwner(){return requestedOwner;} public void setRequestedOwner(String v){requestedOwner=v;}
  public String getRequestedLocation(){return requestedLocation;} public void setRequestedLocation(String v){requestedLocation=v;} public String getReason(){return reason;} public void setReason(String v){reason=v;}
  public String getRequestStatus(){return requestStatus;} public void setRequestStatus(String v){requestStatus=v;} public String getRequestedAt(){return requestedAt;} public void setRequestedAt(String v){requestedAt=v;}
  public String getDecidedBy(){return decidedBy;} public void setDecidedBy(String v){decidedBy=v;} public String getDecidedAt(){return decidedAt;} public void setDecidedAt(String v){decidedAt=v;}
}
