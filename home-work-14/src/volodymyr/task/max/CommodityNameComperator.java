package volodymyr.task.max;

import java.util.Comparator;

public class CommodityNameComperator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}
		return 0;
	}
}