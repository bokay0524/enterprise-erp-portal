package io.portfolio.erp.mapper;
import io.portfolio.erp.domain.SalesPerformance; import java.util.List; import java.math.BigDecimal; import org.apache.ibatis.annotations.Param;
public interface SalesMapper { List<SalesPerformance> findPerformance(@Param("period") String period,@Param("department") String department); BigDecimal sumTarget(@Param("period") String period); BigDecimal sumActual(@Param("period") String period); }
