package questions;

import java.util.ArrayList;
import java.util.List;

public class InitializerVsConstructor {
	private List<String> a;
	private List<String> b;
	private List<String> c = new ArrayList<>();

	public InitializerVsConstructor(List<String> a) {
		this.a = a;
		this.b = new ArrayList<>();
	}
}
