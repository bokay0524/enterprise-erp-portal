package io.portfolio.erp.web;
import java.util.*; import org.springframework.web.bind.annotation.*;
@RestController public class ApiController { @GetMapping("/api/health") public Map<String,Object> health(){Map<String,Object> m=new LinkedHashMap<>();m.put("status","UP");m.put("application","enterprise-erp-portal");m.put("framework","Spring MVC");return m;} }
