package io.portfolio.erp.web;
import io.portfolio.erp.domain.UserSession; import io.portfolio.erp.service.AuthService; import javax.servlet.http.*; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.web.bind.annotation.*;
@Controller public class AuthController { private final AuthService auth; public AuthController(AuthService a){auth=a;}
  @GetMapping("/") public String root(){return "redirect:/dashboard";} @GetMapping("/login") public String login(){return "login";}
  @PostMapping("/login") public String login(@RequestParam String userId,@RequestParam String password,HttpSession session,Model model){UserSession u=auth.authenticate(userId,password);if(u==null){model.addAttribute("error","아이디 또는 비밀번호를 확인해주세요.");return "login";}session.setAttribute("loginUser",u);return "redirect:/dashboard";}
  @GetMapping("/logout") public String logout(HttpSession s){s.invalidate();return "redirect:/login";} @GetMapping("/forbidden") public String forbidden(){return "forbidden";}
}
