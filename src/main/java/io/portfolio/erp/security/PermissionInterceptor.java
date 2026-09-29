package io.portfolio.erp.security;
import io.portfolio.erp.domain.UserSession; import javax.servlet.http.*; import org.springframework.web.method.HandlerMethod; import org.springframework.web.servlet.HandlerInterceptor;
public class PermissionInterceptor implements HandlerInterceptor {
  @Override public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws Exception {
    if(!(handler instanceof HandlerMethod)) return true; HandlerMethod hm=(HandlerMethod)handler; RequirePermission rp=hm.getMethodAnnotation(RequirePermission.class); if(rp==null) rp=hm.getBeanType().getAnnotation(RequirePermission.class); if(rp==null) return true;
    UserSession user=(UserSession)req.getSession().getAttribute("loginUser"); if(user!=null && user.hasPermission(rp.value())) return true;
    if(req.getRequestURI().contains("/api/")){res.setStatus(403);res.setContentType("application/json;charset=UTF-8");res.getWriter().write("{\"message\":\"permission denied\"}");}else{res.sendRedirect(req.getContextPath()+"/forbidden");} return false;
  }
}
