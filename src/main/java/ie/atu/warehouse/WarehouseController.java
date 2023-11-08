package ie.atu.warehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseController {

    private final WarehouseService warehouseService;

    public WarehouseController(WarehouseService wService) {
        this.warehouseService = wService;
    }
    
    @PostMapping("/addWh")
    public void addWarehouses() {
        
    }
    
    @GetMapping("/getWh/{id}")
    public Warehouse getWarehousebyId(@PathVariable int id) {

        Warehouse data = warehouseService.getWarehouseById(id);
    
        return data;
    }
}
