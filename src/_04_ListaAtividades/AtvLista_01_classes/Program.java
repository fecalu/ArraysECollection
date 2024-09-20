package _04_ListaAtividades.AtvLista_01_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Fzer um programa com uma classe Pessoas onde 
		
		List<Employee> listPeople = new ArrayList<>();
		
		System.out.println("How many employees will be registered ?");
		int amountEmployees = sc.nextInt();
		
		for (int i = 0; i < amountEmployees; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("ID:");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine(); 
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			Employee emp = new Employee(id, name, salary);
			
			listPeople.add(emp);
		}
		
		
		;
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();
		
		Integer position = positionId(listPeople,idIncrease);
		if (position == null) {
			System.out.println("Id does not exist");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			listPeople.get(position).increaseSalary(percent);
		}
		
		System.out.println();		
		System.out.println("List of employees: ");
		for (Employee x : listPeople) {
			System.out.println(x);
		}
		
		sc.close();

	}
	
	public static Integer positionId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
}
