package Q;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
	int no;
	String name;
	int score;
	String major;
	
	public Student() {
		
	}

	public Student(int no, String name, int score, String major) {
		this.no = no;
		this.name = name;
		this.score = score;
		this.major = major;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + ", major=" + major + "]";
	}
}

public class Q14 {

	public static void main(String[] args) {
		
		try(
			FileReader fr = new FileReader("src/Q/student.txt");
			BufferedReader bf = new BufferedReader(fr);
		) {
			List<Student> list = new ArrayList<>();
			String text;
			while((text = bf.readLine()) != null) {
				String[] arr = text.split("/");
				list.add(new Student(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), arr[3]));
			}
			
			System.out.println("번호 \t 이름 \t 성적 \t 반");
			list.stream()
				.sorted(
						Comparator.comparing(Student::getScore).reversed()
						.thenComparing(Student::getNo)
						)
				.forEach(st -> System.out.println(st.getNo() + "\t" + st.getName() + "\t" + st.getScore() + "\t" + st.getMajor()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
