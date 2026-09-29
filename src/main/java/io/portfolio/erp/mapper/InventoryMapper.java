package io.portfolio.erp.mapper;
import io.portfolio.erp.domain.InventoryStock; import java.util.List; import org.apache.ibatis.annotations.Param;
public interface InventoryMapper { List<InventoryStock> search(@Param("keyword") String keyword,@Param("warehouse") String warehouse); int countLowStock(); }
