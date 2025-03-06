package dim_service.repository;

import dim_service.entity.WorkOrder;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface WorkOrderRepository extends MongoRepository<WorkOrder, String> {
    Optional<WorkOrder> findByWorkOrderId(String workOrderId);
}
