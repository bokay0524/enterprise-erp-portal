package io.portfolio.erp.service;
import io.portfolio.erp.domain.InventoryStock; import io.portfolio.erp.mapper.InventoryMapper; import java.util.List; import org.springframework.stereotype.Service;
@Service public class InventoryService { private final InventoryMapper mapper; public InventoryService(InventoryMapper m){mapper=m;} public List<InventoryStock> search(String keyword,String warehouse){return mapper.search(keyword,warehouse);} }
