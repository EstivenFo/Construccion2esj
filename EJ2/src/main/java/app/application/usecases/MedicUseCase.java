package app.application.usecases;

import app.domain.model.Order;
import app.domain.model.Record;
import app.domain.services.SearchMedicalRecordByPatient;
import app.domain.services.UpdateRecord;
import app.domain.services.CreateOrder;
import app.domain.model.Patient;
import app.domain.services.CreateRecord;


public class MedicUseCase {
	
	private SearchMedicalRecordByPatient searchMedicalRecordByPatient;
	public void searchMedicalRecordByPatient (Patient patient) throws Exception{
		searchMedicalRecordByPatient.search(patient, null);
	}
   private CreateRecord createRecord;
   public void createRecord (Record record) throws Exception{
	   createRecord.create(null, record,null);
   }
   private UpdateRecord updateRecord;
   public void updateRecord (Record record)throws Exception{
	   updateRecord.updateRecord(null, record, null);
   }
   private CreateOrder crearteOrder;
   public void crearteOrder (Order order)throws Exception{
	   crearteOrder.create(null, null, false, null, order);
   }
   
} 













