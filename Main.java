package Assign9_3;

import java.util.ArrayList;
import java.util.Comparator;

class HDTV{
	String brandName;
	int size;
	
	public HDTV(String brandName, int size) {
		this.brandName = brandName;
		this.size = size;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof HDTV) {
			HDTV tv = (HDTV) o;
			return (this.brandName.equals(tv.brandName) && this.size == tv.size);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return size + " inch " + brandName + " TV";
	}
}

public class Main {
	public static void main(String[] args) {
		ArrayList<HDTV> tvs = new ArrayList<HDTV>();
		
		tvs.add(new HDTV("LG", 32));
		tvs.add(new HDTV("Sony", 55));
		tvs.add(new HDTV("Samsung", 44));
		
		
		System.out.println("TV's before sort");
		for (HDTV hdtv : tvs) {
			System.out.println(hdtv);
		}
		System.out.println();
		
		tvs.sort(new Comparator<HDTV>(){
			public int compare(HDTV a, HDTV b) {
				if (a == null) {
					return 1;
				} else if (b == null) {
					return -1;
				} else if (a.size == b.size){
					return a.brandName.compareTo(b.brandName);
				} else {
					return (a.size < b.size) ? -1: 1;
				}
			}
		});
		
		System.out.println("TV's after sort");
		for (HDTV hdtv : tvs) {
			System.out.println(hdtv);
		}
		System.out.println();
	}
}