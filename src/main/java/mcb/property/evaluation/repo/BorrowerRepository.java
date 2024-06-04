package mcb.property.evaluation.repo;

import mcb.property.evaluation.entity.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {}
