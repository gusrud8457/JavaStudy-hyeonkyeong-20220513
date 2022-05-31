package j17_스태틱.싱글톤.factory;

//정보를 담는 class
public class Car {
	private int seriaNumber;
	private String company;
	private String model;
	
	public Car() { }
	
	
	public Car(int seriaNumber, String company, String model) {
		super();
		this.seriaNumber = seriaNumber;
		this.company = company;
		this.model = model;
	}


	public int getSeriaNumber() {
		return seriaNumber;
	}
	public void setSeriaNumber(int seriaNumber) {
		this.seriaNumber = seriaNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Car [seriaNumber=" + seriaNumber + ", company=" + company + ", model=" + model + "]";
	}




	

}
