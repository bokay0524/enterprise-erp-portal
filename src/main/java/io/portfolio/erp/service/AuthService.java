package io.portfolio.erp.service;
import io.portfolio.erp.domain.*; import io.portfolio.erp.mapper.UserMapper; import io.portfolio.erp.security.PasswordHasher; import org.springframework.stereotype.Service; import java.util.HashSet;
@Service
public class AuthService {
  private final UserMapper userMapper; private final PasswordHasher hasher;
  public AuthService(UserMapper userMapper,PasswordHasher hasher){this.userMapper=userMapper;this.hasher=hasher;}
  public UserSession authenticate(String userId,String password){UserAccount a=userMapper.findById(userId); if(a==null||!a.isActive()||!hasher.matches(password,a.getPasswordSalt(),a.getPasswordHash())) return null; UserSession s=new UserSession();s.setUserId(a.getUserId());s.setDisplayName(a.getDisplayName());s.setRole(a.getRole());s.setDepartment(a.getDepartment());s.setPermissions(new HashSet<>(userMapper.findPermissions(userId)));return s;}
}
