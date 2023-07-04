package Day12Iterator;

import java.util.List;

public class MyIterator {
	private List<String> list;
	private int count = 0;
	
	public MyIterator(List<String> list) {
		this.list = list;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String myNext() {
		if(list == null) {
			throw new MyIteratorException("List is null");
		}
		if(count >= list.size()) {
			throw new MyIteratorException("索引出界");
		}
		return list.get(count++);
	}
	
	public boolean myHasNext() {
		return count != list.size();
	}
}
