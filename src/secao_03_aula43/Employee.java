package secao_03_aula43;

public class Employee {
	
	public String name;
	public double crossSalary;
	public double tax;
	
	public double netSalary(){
		return this.crossSalary - this.tax;
	}
	
	public void increaseSalary(double percentual){
		this.crossSalary += this.crossSalary * (percentual / 100);
	}
	
	@Override
	public String toString() {
		return this.name +
				", " +
				String.format("%.2f", this.netSalary());
	}
}
