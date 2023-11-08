package ie.atu.warehouse;

import java.beans.JavaBean;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {
    
    @JsonProperty
    public int WarehouseById;

    @JsonProperty
    public String location;

    @JsonProperty
    public int capacity;
}
