package dim_service.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;

@Document(collection = "assets")
@Data
@Builder
public class Asset {
    @Id
    private String assetId;
    private String name;
    private Map<String, String> identifiers;
    private String location;
    //private List<WorkOrder> workOrders;
}
