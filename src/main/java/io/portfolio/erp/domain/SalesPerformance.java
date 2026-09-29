package io.portfolio.erp.domain;
import java.math.BigDecimal;
public class SalesPerformance {
  private Long id; private String period; private String divisionName; private String departmentName; private BigDecimal targetAmount; private BigDecimal actualAmount;
  public Long getId(){return id;} public void setId(Long v){id=v;} public String getPeriod(){return period;} public void setPeriod(String v){period=v;}
  public String getDivisionName(){return divisionName;} public void setDivisionName(String v){divisionName=v;} public String getDepartmentName(){return departmentName;} public void setDepartmentName(String v){departmentName=v;}
  public BigDecimal getTargetAmount(){return targetAmount;} public void setTargetAmount(BigDecimal v){targetAmount=v;} public BigDecimal getActualAmount(){return actualAmount;} public void setActualAmount(BigDecimal v){actualAmount=v;}
  public BigDecimal getAchievementRate(){ if(targetAmount==null||targetAmount.signum()==0||actualAmount==null) return BigDecimal.ZERO; return actualAmount.multiply(new BigDecimal("100")).divide(targetAmount,1,java.math.RoundingMode.HALF_UP); }
}
