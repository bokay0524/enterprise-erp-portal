package io.portfolio.erp.mapper;
import io.portfolio.erp.domain.UserAccount; import java.util.List; import org.apache.ibatis.annotations.Param;
public interface UserMapper { UserAccount findById(@Param("userId") String userId); List<String> findPermissions(@Param("userId") String userId); }
