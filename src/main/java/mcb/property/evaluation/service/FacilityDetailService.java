package mcb.property.evaluation.service;

import mcb.property.evaluation.entity.FacilityDetail;
import mcb.property.evaluation.repo.FacilityDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityDetailService {
    @Autowired
    private FacilityDetailRepository facilityDetailRepository;

    public FacilityDetail save(FacilityDetail facilityDetail) {
        return facilityDetailRepository.save(facilityDetail);
    }

    public List<FacilityDetail> findAll() {
        return facilityDetailRepository.findAll();
    }

    // Additional methods
}