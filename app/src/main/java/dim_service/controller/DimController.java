package dim_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/domain")
public class DimController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/start-workflow")
    public ResponseEntity<String> startWorkflow(@RequestParam String workOrderId,
                                                @RequestParam String assetId,
                                                @RequestBody String workflowDefinition)
    {
        String platformServiceURL = "http://localhost:8082/platform/workflow/start";
        ResponseEntity<String> response = restTemplate.postForEntity(platformServiceURL + "?workOrderId="+workOrderId+ "&assetId="+assetId, workflowDefinition, String.class);
        return ResponseEntity.of(Optional.of("Workflow started in platform service: " + response.getBody()));
    }
}
