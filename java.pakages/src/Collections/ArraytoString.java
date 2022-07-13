package Collections;

public class ArraytoString {

	private int eid;
	private String name;
	private String desg;
	private int deskno;
	public ArraytoString(int eid, String name, String desg, int deskno) {
	
		this.eid = eid;
		this.name = name;
		this.desg = desg;
		this.deskno = deskno;
	}
	@Override
	public String toString() {
		return "ArraytoString [eid=" + eid + ", name=" + name + ", desg=" + desg + ", deskno=" + deskno + "]";
	}
	

}
