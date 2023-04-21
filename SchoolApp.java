package oophwclassrom;

public class SchoolApp {
	public static void main(String[] args) {
		Year year10 = new Year();
		year10.id = 1;
		year10.name = "First year";

		Year year11 = new Year();
		year11.id = 1;
		year11.name = "Second year";

		Year year12 = new Year();
		year12.id = 1;
		year12.name = "Third year";

		Semester sem1 = new Semester();
		sem1.id = 1;
		sem1.name = "HK 1";
		sem1.schoolYear = year10;

		Semester sem2 = new Semester();
		sem2.id = 2;
		sem2.name = "HK 2";
		sem2.schoolYear = year10;

		Semester sem3 = new Semester();
		sem3.id = 3;
		sem3.name = "HK 1";
		sem3.schoolYear = year11;

		Semester sem4 = new Semester();
		sem4.id = 4;
		sem4.name = "HK 2";
		sem4.schoolYear = year11;

		Semester sem5 = new Semester();
		sem5.id = 5;
		sem5.name = "HK 1";
		sem5.schoolYear = year12;

		Semester sem6 = new Semester();
		sem6.id = 6;
		sem6.name = "HK 2";
		sem6.schoolYear = year12;

		Room room1 = new Room();
		room1.id = 1;
		room1.name = "Room 1 Floor 1";

		Teacher teacherDung = new Teacher();
		teacherDung.id = 1;
		teacherDung.name = "Dung";

		Teacher teacherTri = new Teacher();
		teacherTri.id = 2;
		teacherTri.name = "Tri";

		Clazz clazz10A1 = new Clazz();
		clazz10A1.id = 1;
		clazz10A1.name = "10A1";
		clazz10A1.locatedRoom = room1;
		clazz10A1.primaryTeacher = teacherDung;

		/*
		 * Clazz clazz10A2=new Clazz(); clazz10A2.id=2; clazz10A2.name="10A2";
		 * clazz10A2.locatedRoom=room1; clazz10A2.primaryTeacher=teacherTri;
		 */

		Student student1 = new Student();
		student1.id = 1;
		student1.name = "Nghi";
		student1.studyingClazz = clazz10A1;

		Subject subjectMath = new Subject();
		subjectMath.id = 1;
		subjectMath.name = "Math";
		subjectMath.multiplication = 2;

		Subject subjectHis = new Subject();
		subjectHis.id = 2;
		subjectHis.name = "History";
		subjectHis.multiplication = 1;

		TeacherxSubject triTeachHis = new TeacherxSubject();
		triTeachHis.teacher = teacherTri;
		triTeachHis.teachingSubject = subjectHis;

		TeacherxSubject dungTeachMath = new TeacherxSubject();
		dungTeachMath.teacher = teacherDung;
		dungTeachMath.teachingSubject = subjectMath;

		TeacherxSubject triTeachMath = new TeacherxSubject();
		triTeachMath.teacher = teacherTri;
		triTeachMath.teachingSubject = subjectMath;

		// Exam Year 1
		Examination examFinalSem1Math = new Examination();
		examFinalSem1Math.id = 1;
		examFinalSem1Math.name = "Math Final Exam Sem 1";
		examFinalSem1Math.subject = subjectMath;
		examFinalSem1Math.multiplication = 2;
		examFinalSem1Math.semester = sem1;

		Examination examFinalSem2Math = new Examination();
		examFinalSem2Math.id = 2;
		examFinalSem2Math.name = "Math Final Exam Sem 2";
		examFinalSem2Math.subject = subjectMath;
		examFinalSem2Math.multiplication = 2;
		examFinalSem2Math.semester = sem2;

		Examination examOralSem1Math = new Examination();
		examOralSem1Math.id = 3;
		examOralSem1Math.name = "Math Oral Exam Sem 1";
		examOralSem1Math.subject = subjectMath;
		examOralSem1Math.multiplication = 1;
		examOralSem1Math.semester = sem1;

		Examination examOralSem2Math = new Examination();
		examOralSem2Math.id = 4;
		examOralSem2Math.name = "Math Oral Exam Sem 2";
		examOralSem2Math.subject = subjectMath;
		examOralSem2Math.multiplication = 1;
		examOralSem2Math.semester = sem2;

		Examination examOralSem1His = new Examination();
		examOralSem1His.id = 5;
		examOralSem1His.name = "History Oral Exam Sem 1";
		examOralSem1His.subject = subjectHis;
		examOralSem1His.multiplication = 1;
		examOralSem1His.semester = sem1;

		Examination examOralSem2His = new Examination();
		examOralSem2His.id = 6;
		examOralSem2His.name = "History Oral Exam Sem 2";
		examOralSem2His.subject = subjectHis;
		examOralSem2His.semester = sem2;
		examOralSem2His.multiplication = 1;

		Examination examFinalSem1His = new Examination();
		examFinalSem1His.id = 7;
		examFinalSem1His.name = "History Final Exam Sem 1";
		examFinalSem1His.subject = subjectHis;
		examFinalSem1His.semester = sem1;
		examFinalSem1His.multiplication = 1;

		Examination examFinalSem2His = new Examination();
		examFinalSem2His.id = 8;
		examFinalSem2His.name = "History Final Exam Sem 2";
		examFinalSem2His.subject = subjectHis;
		examFinalSem2His.semester = sem2;
		examFinalSem2His.multiplication = 1;

		/// Year 2
		Examination examFinalSem1MathY2 = new Examination();
		examFinalSem1MathY2.id = 9;
		examFinalSem1MathY2.name = "Math Final Exam Sem 1";
		examFinalSem1MathY2.subject = subjectMath;
		examFinalSem1MathY2.multiplication = 2;
		examFinalSem1MathY2.semester = sem3;

		Examination examFinalSem2MathY2 = new Examination();
		examFinalSem2MathY2.id = 10;
		examFinalSem2MathY2.name = "Math Final Exam Sem 2";
		examFinalSem2MathY2.subject = subjectMath;
		examFinalSem2MathY2.multiplication = 2;
		examFinalSem2MathY2.semester = sem4;

		Examination examFinalSem1HisY2 = new Examination();
		examFinalSem1HisY2.id = 11;
		examFinalSem1HisY2.name = "History Final Exam Sem 1";
		examFinalSem1HisY2.subject = subjectHis;
		examFinalSem1HisY2.semester = sem3;
		examFinalSem1HisY2.multiplication = 1;

		Examination examFinalSem2HisY2 = new Examination();
		examFinalSem2HisY2.id = 12;
		examFinalSem2HisY2.name = "History Final Exam Sem 2";
		examFinalSem2HisY2.subject = subjectHis;
		examFinalSem2HisY2.semester = sem4;
		examFinalSem2HisY2.multiplication = 1;

		// Year 3
		Examination examFinalSem1MathY3 = new Examination();
		examFinalSem1MathY3.id = 13;
		examFinalSem1MathY3.name = "Math Final Exam Sem 1";
		examFinalSem1MathY3.subject = subjectMath;
		examFinalSem1MathY3.multiplication = 2;
		examFinalSem1MathY3.semester = sem5;

		Examination examFinalSem2MathY3 = new Examination();
		examFinalSem2MathY3.id = 14;
		examFinalSem2MathY3.name = "Math Final Exam Sem 2";
		examFinalSem2MathY3.subject = subjectMath;
		examFinalSem2MathY3.multiplication = 2;
		examFinalSem2MathY3.semester = sem6;

		Examination examFinalSem1HisY3 = new Examination();
		examFinalSem1HisY3.id = 15;
		examFinalSem1HisY3.name = "History Final Exam Sem 1";
		examFinalSem1HisY3.subject = subjectHis;
		examFinalSem1HisY3.semester = sem5;
		examFinalSem1HisY3.multiplication = 1;

		Examination examFinalSem2HisY3 = new Examination();
		examFinalSem2HisY3.id = 16;
		examFinalSem2HisY3.name = "History Final Exam Sem 2";
		examFinalSem2HisY3.subject = subjectHis;
		examFinalSem2HisY3.semester = sem6;
		examFinalSem2HisY3.multiplication = 1;

		// Point Y1
		/*
		 * Point point1 = new Point(); point1.student = student1; point1.value = 6;
		 * point1.exam = examOralSem1Math; point1.multiPoint = multiPointcal(point1,
		 * examOralSem1Math);
		 * 
		 * Point point2 = new Point(); point2.student = student1; point2.value = 8;
		 * point2.exam = examOralSem2Math; point2.multiPoint = multiPointcal(point2,
		 * examOralSem2Math);
		 */

		Point point3 = new Point();
		point3.student = student1;
		point3.value = 4;
		point3.exam = examFinalSem1Math;
		point3.multiPoint = multiPointcal(point3, examFinalSem1Math);

		Point point4 = new Point();
		point4.student = student1;
		point4.value = 9;
		point4.exam = examFinalSem2Math;
		point4.multiPoint = multiPointcal(point4, examFinalSem2Math);

		/*
		 * Point point5 = new Point(); point5.student = student1; point5.value = 8;
		 * point5.exam = examOralSem1His; point5.multiPoint = multiPointcal(point5,
		 * examOralSem1His);
		 * 
		 * 
		 * Point point6 = new Point(); point6.student = student1; point6.value = 8;
		 * point6.exam = examOralSem2His; point6.multiPoint = multiPointcal(point5,
		 * examOralSem2His);
		 */

		Point point7 = new Point();
		point7.student = student1;
		point7.value = 8;
		point7.exam = examFinalSem1His;
		point7.multiPoint = multiPointcal(point7, examFinalSem1His);

		Point point8 = new Point();
		point8.student = student1;
		point8.value = 5;
		point8.exam = examFinalSem2His;
		point8.multiPoint = multiPointcal(point8, examFinalSem2His);

		// PointY2
		Point point9 = new Point();
		point9.student = student1;
		point9.value = 8;
		point9.exam = examFinalSem1MathY2;
		point9.multiPoint = multiPointcal(point9, examFinalSem1MathY2);

		Point point10 = new Point();
		point10.student = student1;
		point10.value = 10;
		point10.exam = examFinalSem2MathY2;
		point10.multiPoint = multiPointcal(point10, examFinalSem2MathY2);

		Point point11 = new Point();
		point11.student = student1;
		point11.value = 6;
		point11.exam = examFinalSem1HisY2;
		point11.multiPoint = multiPointcal(point11, examFinalSem1HisY2);

		Point point12 = new Point();
		point12.student = student1;
		point12.value = 6;
		point12.exam = examFinalSem2HisY2;
		point12.multiPoint = multiPointcal(point12, examFinalSem2HisY2);

		// Y3
		Point point13 = new Point();
		point13.student = student1;
		point13.value = 9;
		point13.exam = examFinalSem1MathY3;
		point13.multiPoint = multiPointcal(point13, examFinalSem1MathY3);

		Point point14 = new Point();
		point14.student = student1;
		point14.value = 6;
		point14.exam = examFinalSem2MathY3;
		point14.multiPoint = multiPointcal(point14, examFinalSem2MathY3);

		Point point15 = new Point();
		point15.student = student1;
		point15.value = 8;
		point15.exam = examFinalSem1HisY3;
		point15.multiPoint = multiPointcal(point15, examFinalSem1HisY3);

		Point point16 = new Point();
		point16.student = student1;
		point16.value = 8;
		point16.exam = examFinalSem2HisY3;
		point16.multiPoint = multiPointcal(point16, examFinalSem2HisY3);

		Year[] years = { year10, year11, year12 };
		Semester[] semesters = { sem1, sem2, sem3, sem4, sem5, sem6 };
		Student[] students = { student1 };
		Teacher[] teachers = { teacherDung, teacherTri };
		Room[] rooms = { room1 };
		Clazz[] clazzs = { clazz10A1 };
		Subject[] subjects = { subjectHis, subjectMath };
		TeacherxSubject[] teacherxsub = { dungTeachMath, triTeachHis, triTeachMath };
		Examination[] exams = { examFinalSem1Math, examFinalSem2Math, examOralSem1Math, examOralSem2Math,
				examOralSem1His, examOralSem2His, examFinalSem1His, examFinalSem2His, examFinalSem1MathY2,
				examFinalSem2MathY2, examFinalSem1HisY2, examFinalSem2HisY2, examFinalSem1MathY3, examFinalSem2MathY3,
				examFinalSem1HisY3, examFinalSem2HisY3 };
		Point[] points = { point3, point4, point7, point8, point9, point10, point11, point12, point13, point14, point15,
				point16 };

		/*
		 * for (Clazz clazz : clazzs) { System.out.println("Class: " + clazz.name);
		 * System.out.println("Room:" + clazz.locatedRoom.name);
		 * System.out.println("Primary teacher: " + clazz.primaryTeacher.name); for
		 * (TeacherxSubject teacher : teacherxsub) { System.out.println("Teacher: " +
		 * teacher.teacher.name + " - Subject: " + teacher.teachingSubject.name); }
		 */
		for (Student student : students) {

			System.out.println("Student id: " + student.id);
			System.out.println("Student name: " + student.name);
			System.out.println("Student's class: " + student.studyingClazz.name);
			for (Year year : years) {

				double yearTotalScore = 0.0;

				System.out.println("School year: " + year.name);
				for (Semester semester : semesters) {

					if (semester.schoolYear.name.equals(year.name)) {
						double semesterTotalScore = 0.0;
						int semesterTotalMultiplication = 0;
						double semesterAvg = 0;
						System.out.println("Semester: " + semester.name);

						for (Subject subject : subjects) {
							double subjectTotalScore = 0.;
							int subjectTotalMultiplication = 0;

							for (Point point : points) {

								if (point.exam.semester.name.equals(semester.name)
										&& point.exam.subject.name.equals(subject.name)
										&& point.exam.semester.schoolYear.name.equals(year.name)) {

									System.out.println(point.exam.name + ": " + point.value);

									subjectTotalScore += point.multiPoint;
									subjectTotalMultiplication += point.exam.multiplication;

								}
							}

							double subjectAvg = subjectTotalScore / subjectTotalMultiplication;
							System.out.println("The subject average point: " + subjectAvg);
							System.out.println("--------------");
							semesterTotalScore += subjectTotalScore;
							semesterTotalMultiplication += subject.multiplication;

							semesterAvg = semesterTotalScore / semesterTotalMultiplication;

						}
						System.out.printf("Average semester point for %s: %.2f%n", semester.name, semesterAvg);
						System.out.println("-----------");
						;
						yearTotalScore += semesterAvg;

					}
				}
				double yearAvg = yearTotalScore / 2;
				System.out.printf("Whole year average score: %.2f%n", yearAvg);
				System.out.println("--------------");
			}

		}

	}

	public static double multiPointcal(Point point, Examination examination) {
		double multiP = point.value * examination.multiplication;
		return multiP;
	}

}
