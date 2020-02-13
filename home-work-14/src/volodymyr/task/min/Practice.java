package volodymyr.task.min;

import java.util.Comparator;

public class Practice implements Comparable<Practice>{

	private String name;
	private int age;
	
	public Practice(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Practice [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Practice o) {
		return this.name.compareTo(o.getName());
	}

	
}
