package io.portfolio.erp.security;
import org.springframework.stereotype.Component; import javax.crypto.SecretKeyFactory; import javax.crypto.spec.PBEKeySpec; import java.security.MessageDigest; import java.util.Base64;
@Component
public class PasswordHasher {
  public boolean matches(String raw,String saltBase64,String expectedBase64){
    try{byte[] salt=Base64.getDecoder().decode(saltBase64); PBEKeySpec spec=new PBEKeySpec(raw.toCharArray(),salt,120000,256); byte[] actual=SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256").generateSecret(spec).getEncoded(); byte[] expected=Base64.getDecoder().decode(expectedBase64); return MessageDigest.isEqual(actual,expected);}catch(Exception e){throw new IllegalStateException("Password verification failed",e);}
  }
}
