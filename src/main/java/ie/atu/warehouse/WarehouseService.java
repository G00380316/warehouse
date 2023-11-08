package ie.atu.warehouse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
    
    private Warehouse warehouse;
    List<Warehouse> dataList = new ArrayList<>();

    public WarehouseService(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    
    public Warehouse getWarehouseById(int id) {
        Warehouse warehouse = getWarehouseById(id);

        return warehouse;
    }
}
