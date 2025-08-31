package app.domain.ports;

import app.domain.model.MedicalInsurance;

import java.util.List;

public interface InsurancePort {
	
    public void save(MedicalInsurance insurance) throws Exception;
    public MedicalInsurance findByPolicyNumber(MedicalInsurance insurance) throws Exception;
    public List<MedicalInsurance> findByPatientId(MedicalInsurance insurance) throws Exception;
    
}
