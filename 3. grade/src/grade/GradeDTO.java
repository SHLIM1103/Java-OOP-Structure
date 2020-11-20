package grade;

public class GradeDTO {
	private String name;
	private int korean, english, math, sum;
	private float avg;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAve() {
		return avg;
	}
	public void setAve(double ave) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		return "GradeDTO [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + ", sum="
				+ sum + ", avg=" + avg + "]";
	}
}