package lambda.exam;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = {
									new Student("�ڵ���", 10, 45),
									new Student("�س���", 100, 100),
									new Student("������", 55, 45)
	};
	
	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("���� ���� ���� : " + engAvg);
		avg(Student::getEngScore);
		avg(Student::getMathScore);
	}

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : students ) {
			sum += function.applyAsInt(student);
		}
		
		return (double) sum / students.length;
		
	}
}
