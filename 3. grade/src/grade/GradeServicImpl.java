package grade;

public class GradeServicImpl implements GradeService {
	private GradeDTO[] grades;
	private int count ;
	
	public GradeServicImpl() {
		grades = new GradeDTO[3];
	}
	
	@Override
	public int sum(GradeDTO grade) {
		return grade.getKorean() + grade.getEnglish() + grade.getMath();
	}

	@Override
	public float avg(int sum) {
		return (float)sum / 3 ;
	}

	@Override
	public GradeDTO gradeSort() {
		
		return null;
	}

	@Override
	public void addGrade(GradeDTO grade) {
		grades[count] = grade ;
		count++;
	}

	@Override
	public void updateGrade(GradeDTO grade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGrade(GradeDTO grade) {
		// TODO Auto-generated method stub
		
	}
}
