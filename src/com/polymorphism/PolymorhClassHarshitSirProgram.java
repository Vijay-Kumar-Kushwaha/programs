package com.polymorphism;

class EducationalInstitute{
	void admitStudent() {
		System.out.println("Edu. inst. takes Admission");
	}
	void conductExams() {
		System.out.println("Edu. inst. conducts exam");
	}
	void conductSpecialActivity() {
        System.out.println("Edu. inst. conducts a special activity");
    }
}
class School extends EducationalInstitute{
	@Override
	void admitStudent() {
		System.out.println("School takes Admission");
	}
	@Override
	void conductExams() {
		System.out.println("School conducts exam");
	}
	void conductFieldTrips() {
		System.out.println("School conducts field trips");
	}
	 @Override
	    void conductSpecialActivity() {
	        System.out.println("School conducts field trips");
	    }
}

class College extends EducationalInstitute{
	@Override
	void admitStudent() {
		System.out.println("College takes Admission");
	}
	@Override
	void conductExams() {
		System.out.println("College conducts exam");
	}
	void conductsInternships() {
		System.out.println("College does not conducts internships");
	}
	 @Override
	    void conductSpecialActivity() {
	        System.out.println("College conducts internships");
	    }
}

class University extends EducationalInstitute{
	@Override
	void admitStudent() {
		System.out.println("University takes Admission");
	}
	@Override
	void conductExams() {
		System.out.println("University conducts exam");
	}
	void conductResearch() {
		System.out.println("University makes Student do research");
	}
    @Override
    void conductSpecialActivity() {
        System.out.println("University conducts research");
    }
}

class Education{
	public static void permit(EducationalInstitute ref) {
		ref.admitStudent();
		ref.conductExams();
		ref.conductSpecialActivity();
	}
}
public class PolymorhClassHarshitSirProgram {
	public static void main(String[] args) {
		EducationalInstitute s = new School();
		EducationalInstitute c = new College();
		EducationalInstitute u = new University();

		Education.permit(s);
		Education.permit(c);
		Education.permit(u);
	}

}
