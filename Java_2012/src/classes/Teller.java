package classes;

import java.util.Iterator;

public class Teller implements Iterator<Integer> {
	private int teller;
	private int max;
	
	public Teller(int min, int max) throws LimitException {
		if (min > max)
			throw new LimitException(min, max);
		teller = min - 1;
		this.max = max;
	}
	
	public void tell() {
		if (teller < max)
			teller++;
	}
	
	public int hentVerdi() {
		return teller;
	}
	
	public Integer next() {
		if (teller < max)
			teller++;
		return teller;
	}
	
	public boolean hasNext() {
		return teller < max;
	}
	
	public void remove() {
	}
}
