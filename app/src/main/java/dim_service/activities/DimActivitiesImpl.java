package dim_service.activities;

import org.springframework.stereotype.Service;

@Service
public class DimActivitiesImpl implements DimActivities {
    @Override
    public boolean processAIML(String taskId) {
        System.out.println("Process AIML task");
        return true;
    }

    @Override
    public boolean processCJARVIS(String taskId) {
        System.out.println("Process CJARVIS task");
        return true;
    }
}
