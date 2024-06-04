package mcb.property.evaluation.controller;

import mcb.property.evaluation.entity.PropertyValuation;
import mcb.property.evaluation.service.PropertyValuationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluations")
public class PropertyValuationController {

    @Autowired
    private PropertyValuationService propertyValuationService;

    @PostMapping
    public ResponseEntity<PropertyValuation> createEvaluation(@RequestBody PropertyValuation evaluation) {
        return ResponseEntity.ok(propertyValuationService.createEvaluation(evaluation));
    }

    @GetMapping
    public ResponseEntity<List<PropertyValuation>> getAllEvaluations() {
        return ResponseEntity.ok(propertyValuationService.getAllEvaluations());
    }
}
