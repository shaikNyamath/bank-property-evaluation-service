package mcb.property.evaluation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class FacilityDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeOfFacility;
    private String category;
    private String purposeOfPropertyValuation;
    private int term;
    private String ccy;
    private double amount;
}
