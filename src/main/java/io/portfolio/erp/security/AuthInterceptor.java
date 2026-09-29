package io.portfolio.erp.security;
import io.portfolio.erp.domain.UserSession; import javax.servlet.http.*; import org.springframework.web.servlet.HandlerInterceptor;
public class AuthInterceptor implements HandlerInterceptor {
  @Override public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws Exception {
    UserSession user=(UserSession)req.getSession().getAttribute("loginUser"); if(user!=null) return true;
    if(req.getRequestURI().contains("/api/")){res.setStatus(401); res.setContentType("application/json;charset=UTF-8"); res.getWriter().write("{\"message\":\"authentication required\"}");} else {res.sendRedirect(req.getContextPath()+"/login");} return false;
  }
}
