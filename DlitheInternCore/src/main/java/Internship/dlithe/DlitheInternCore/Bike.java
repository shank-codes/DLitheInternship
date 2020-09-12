package Internship.dlithe.DlitheInternCore;

public class Bike {
	private String model;
	private Integer year,cc,milage;
	private Double cost;
	
    public Bike() {
		
	}
	public Bike(String model, Integer year, Integer cc, Integer milage, Double cost) {
		super();
		this.model = model;
		this.year = year;
		this.cc = cc;
		this.milage = milage;
		this.cost = cost;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	public Integer getMilage() {
		return milage;
	}
	public void setMilage(Integer milage) {
		this.milage = milage;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Bike [model=" + model + ", year=" + year + ", cc=" + cc + ", milage=" + milage + ", cost=" + cost + "]";
	}
	
	
}
