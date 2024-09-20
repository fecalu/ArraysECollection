package _04_ListaAtividades.AtvLista_01_classes;

public class Employee {

	private Integer id;
	private String name;
	private double salary;
	
	
	public Employee (Integer id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Integer getId () {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary = (salary * percentage/100) + salary;
	}
	
	public String toString() {
		return id + ", "+ name + ", " + String.format("%.2f",salary);
	}
	
}
