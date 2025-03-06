package dim_service.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Task {
    private String taskId;
    private String description;
    private String status;
}
