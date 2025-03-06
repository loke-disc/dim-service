package dim_service.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "work_orders")
@Data
@Builder
public class WorkOrder {
    private String workOrderId;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    private String status;
    private List<Task> tasks;
}
