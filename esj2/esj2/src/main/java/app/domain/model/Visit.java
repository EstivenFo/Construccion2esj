package app.domain.model;

public class Visit {
	private String bloodPressure;
    private double temperature;
    private int pulse;
    private int oxygenLevel;
    private String observations;
    
    public Visit(String bloodPressure, double temperature, int pulse, int oxygenLevel, String observations) {
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.pulse = pulse;
        this.oxygenLevel = oxygenLevel;
        this.observations = observations;
    }

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getPulse() {
		return pulse;
	}

	public void setPulse(int pulse) {
		this.pulse = pulse;
	}

	public int getOxygenLevel() {
		return oxygenLevel;
	}

	public void setOxygenLevel(int oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}
    

}
