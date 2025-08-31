package app.domain.ports;

import app.domain.model.Visit;

public interface VisitPort {
	
		public Visit findByDocument(Visit visit) throws Exception;
		public Visit findByUsername(Visit visit) throws Exception;
		public void save(Visit visit) throws Exception;

}
