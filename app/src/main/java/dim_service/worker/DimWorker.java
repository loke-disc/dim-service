package dim_service.worker;

import dim_service.activities.DimActivitiesImpl;
import io.temporal.client.WorkflowClient;
import io.temporal.worker.Worker;
import io.temporal.worker.WorkerFactory;

public class DimWorker {
    private final WorkflowClient workflowClient;

    public DimWorker(WorkflowClient workflowClient) {
        this.workflowClient = workflowClient;
    }

    public void start() {
        WorkerFactory factory = WorkerFactory.newInstance(workflowClient);
        Worker worker = factory.newWorker("dim-task-queue");
        worker.registerActivitiesImplementations(new DimActivitiesImpl());
        factory.start();
        System.out.println("Dim worker started for dim-task-queue");
    }
}
