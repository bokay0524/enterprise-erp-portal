package io.portfolio.erp.service;
import io.portfolio.erp.domain.SalesPerformance; import io.portfolio.erp.mapper.SalesMapper; import java.util.List; import org.springframework.stereotype.Service;
@Service public class SalesService { private final SalesMapper mapper; public SalesService(SalesMapper m){mapper=m;} public List<SalesPerformance> search(String period,String dept){return mapper.findPerformance(period,dept);} }
