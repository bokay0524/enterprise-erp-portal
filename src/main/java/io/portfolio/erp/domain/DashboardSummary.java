package io.portfolio.erp.domain;
import java.math.BigDecimal;
public class DashboardSummary {
  private BigDecimal targetAmount=BigDecimal.ZERO, actualAmount=BigDecimal.ZERO; private int lowStockCount,pendingAssetRequests,uninspectedAssets;
  public BigDecimal getTargetAmount(){return targetAmount;} public void setTargetAmount(BigDecimal v){targetAmount=v;} public BigDecimal getActualAmount(){return actualAmount;} public void setActualAmount(BigDecimal v){actualAmount=v;}
  public int getLowStockCount(){return lowStockCount;} public void setLowStockCount(int v){lowStockCount=v;} public int getPendingAssetRequests(){return pendingAssetRequests;} public void setPendingAssetRequests(int v){pendingAssetRequests=v;}
  public int getUninspectedAssets(){return uninspectedAssets;} public void setUninspectedAssets(int v){uninspectedAssets=v;}
}
