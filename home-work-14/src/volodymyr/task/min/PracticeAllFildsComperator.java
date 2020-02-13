package volodymyr.task.min;

import java.util.Comparator;

public class PracticeAllFildsComperator implements Comparator<Practice>{

	@Override
	public int compare(Practice o1, Practice o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}else 
			{ if(o1.getAge()>o2.getAge()) {
			return 1;
		}else if(o1.getAge()<o2.getAge()) {
			return -1;
		}
			}
		return 0;
	}

}
