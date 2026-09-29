package io.portfolio.erp.mapper;
import io.portfolio.erp.domain.FixedAsset; import io.portfolio.erp.domain.AssetChangeRequest; import java.util.List; import org.apache.ibatis.annotations.Param;
public interface AssetMapper {
  List<FixedAsset> searchAssets(@Param("keyword") String keyword); FixedAsset findAsset(@Param("assetNo") String assetNo);
  int insertChangeRequest(AssetChangeRequest request); List<AssetChangeRequest> findRequests(@Param("status") String status); AssetChangeRequest findRequest(@Param("requestId") Long requestId);
  int updateRequestDecision(@Param("requestId") Long requestId,@Param("status") String status,@Param("decidedBy") String decidedBy,@Param("decidedAt") String decidedAt);
  int applyAssetChange(@Param("assetNo") String assetNo,@Param("department") String department,@Param("owner") String owner,@Param("location") String location);
  int insertInspection(@Param("assetNo") String assetNo,@Param("inspectorId") String inspectorId,@Param("result") String result,@Param("remark") String remark,@Param("inspectedAt") String inspectedAt);
  int updateInspectionDate(@Param("assetNo") String assetNo,@Param("inspectedDate") String inspectedDate); int countPendingRequests(); int countUninspectedAssets();
}
