package dim_service.activities;

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface DimActivities {
    @ActivityMethod
    boolean processAIML(String taskId);

    @ActivityMethod
    boolean processCJARVIS(String taskId);
}
