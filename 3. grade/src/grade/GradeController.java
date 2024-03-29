package grade;

public class GradeController {
	private GradeService gradeService;

	public GradeController() {
		gradeService = new GradeServicImpl();
	}

	public int getSum(GradeDTO grade) {
		return gradeService.sum(grade);
	}

	public float getAvg(int sum) {
		return gradeService.avg(sum);
	}

	public GradeDTO getGradeSort() {
		return gradeService.gradeSort();
	}

	public void postGrade(GradeDTO grade) {
		gradeService.addGrade(grade);
	}

	public void putGrade(GradeDTO grade) {
		gradeService.updateGrade(grade);
	}

	public void deleteGrade(GradeDTO grade) {
		gradeService.deleteGrade(grade);
	}
}