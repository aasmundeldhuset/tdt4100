package collections;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String text = "Java is a programming language originally developed by James Gosling at Sun Microsystems (which has since merged into Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++ but has a simpler object model and fewer low-level facilities. Java applications are typically compiled to bytecode (class file) that can run on any Java Virtual Machine (JVM) regardless of computer architecture. Java is a general-purpose, concurrent, class-based, object-oriented language that is specifically designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA), meaning that code that runs on one platform does not need to be recompiled to run on another. Java is currently[date missing] one of the most popular programming languages in use, particularly for client-server web applications, with a reported 10 million users.[9][10] The original and reference implementation Java compilers, virtual machines, and class libraries were developed by Sun from 1995. As of May 2007, in compliance with the specifications of the Java Community Process, Sun relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java and GNU Classpath.";
		String[] words = text.split(" ");
		for (String word : words) {
			if (map.containsKey(word)) {
				int value = map.get(word);
				map.put(word, value + 1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		for (String word : map.keySet()) {
			System.out.println(word + ": " + map.get(word));
		}
	}
}
