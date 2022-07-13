package Comparablesandcomparators;


class Author implements Comparable<Author>{
	String firstname;
	String lastname;
	String booknamel;
	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		int last = this.lastname.compareTo(lastname);
		return last==0 ? this.firstname.compareTo(o.firstname):last;
	}
}

public class Sortauthorname {

}
