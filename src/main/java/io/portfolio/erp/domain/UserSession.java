package io.portfolio.erp.domain;
import java.io.Serializable; import java.util.HashSet; import java.util.Set;
public class UserSession implements Serializable {
  private static final long serialVersionUID=1L;
  private String userId; private String displayName; private String role; private String department; private Set<String> permissions=new HashSet<>();
  public String getUserId(){return userId;} public void setUserId(String v){userId=v;}
  public String getDisplayName(){return displayName;} public void setDisplayName(String v){displayName=v;}
  public String getRole(){return role;} public void setRole(String v){role=v;}
  public String getDepartment(){return department;} public void setDepartment(String v){department=v;}
  public Set<String> getPermissions(){return permissions;} public void setPermissions(Set<String> v){permissions=v;}
  public boolean hasPermission(String code){return permissions!=null && permissions.contains(code);}
}
