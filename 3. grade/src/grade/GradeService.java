package grade;

public interface GradeService {
	public int sum(GradeDTO grade);
	public float avg(int sum);
	public GradeDTO gradeSort();
	public void addGrade(GradeDTO grade);
	public void updateGrade(GradeDTO grade);
	public void deleteGrade(GradeDTO grade);
	
}
