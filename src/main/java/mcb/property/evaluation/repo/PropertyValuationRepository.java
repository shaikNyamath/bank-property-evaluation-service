package mcb.property.evaluation.repo;

import mcb.property.evaluation.entity.PropertyValuation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyValuationRepository extends JpaRepository<PropertyValuation, Long> {}
