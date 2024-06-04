package mcb.property.evaluation.service;

import mcb.property.evaluation.entity.PropertyValuation;
import mcb.property.evaluation.repo.PropertyValuationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyValuationService {

    @Autowired
    private PropertyValuationRepository propertyValuationRepository;

    public PropertyValuation createEvaluation(PropertyValuation evaluation) {
        // generate FOS reference
        evaluation.setFosReference(generateFosReference(evaluation));
        return propertyValuationRepository.save(evaluation);
    }

    private String generateFosReference(PropertyValuation evaluation) {
        // Implement the logic to generate FOS Reference
        return "FOS" + System.currentTimeMillis();
    }

    public List<PropertyValuation> getAllEvaluations() {
        return propertyValuationRepository.findAll();
    }
}
