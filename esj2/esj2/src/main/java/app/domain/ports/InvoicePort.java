package app.domain.ports;

import app.domain.model.Invoice;

public interface InvoicePort {
	
	public Invoice findByDocument(Invoice invoice) throws Exception;
	public Invoice findByUsername(Invoice invoice) throws Exception;
	public void save(Invoice invoice) throws Exception;

}
