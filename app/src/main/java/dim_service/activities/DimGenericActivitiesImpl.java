package dim_service.activities;

import org.springframework.stereotype.Service;
import platform.activities.GenericActivities;

@Service
public class DimGenericActivitiesImpl implements GenericActivities {

    @Override
    public boolean executeTask(String taskName, String taskId) {
        switch (taskName) {
            case "processAIML":
                return processAIML(taskId);
            case "processCJARVIS":
                return processCJARVIS(taskId);
            default:
                throw new IllegalArgumentException("Unknown task -"+taskName);
        }
    }

    private boolean processAIML(String taskId) {
        System.out.println("Process AIML task");
        return true;
    }

    private boolean processCJARVIS(String taskId) {
        System.out.println("Process CJARVIS task");
        return true;
    }
}
