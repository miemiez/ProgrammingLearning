package Day99Java练习17;

import java.util.Objects;

public class Practice03 {
	int i;
	String name;
	public static void main(String[] args) {
		Practice03 p = new Practice03();
		System.out.println(p.toString());
	}
	@Override
	public String toString() {
		return "Practice03 [i=" + i + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(i, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Practice03 other = (Practice03) obj;
		return i == other.i && Objects.equals(name, other.name);
	}
	@Override
	protected void finalize() throws Throwable {
		
	}
}
