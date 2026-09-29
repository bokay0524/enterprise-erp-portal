package io.portfolio.erp.domain;
public class UserAccount {
  private String userId; private String passwordSalt; private String passwordHash; private String displayName; private String role; private String department; private boolean active;
  public String getUserId(){return userId;} public void setUserId(String v){userId=v;}
  public String getPasswordSalt(){return passwordSalt;} public void setPasswordSalt(String v){passwordSalt=v;}
  public String getPasswordHash(){return passwordHash;} public void setPasswordHash(String v){passwordHash=v;}
  public String getDisplayName(){return displayName;} public void setDisplayName(String v){displayName=v;}
  public String getRole(){return role;} public void setRole(String v){role=v;}
  public String getDepartment(){return department;} public void setDepartment(String v){department=v;}
  public boolean isActive(){return active;} public void setActive(boolean v){active=v;}
}
