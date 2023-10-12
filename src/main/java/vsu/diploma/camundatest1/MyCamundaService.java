package vsu.diploma.camundatest1;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyCamundaService {

    @Autowired
    private RuntimeService runtimeService;

    public void startCamundaProcess() {
        runtimeService.startProcessInstanceByKey("payment-retrieval");
    }
}
