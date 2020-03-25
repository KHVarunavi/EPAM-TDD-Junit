package epam.tasks.junit;

public class RemoveA{

	public String remove(String string) {
		int n=string.length();
		StringBuilder answer = new StringBuilder();
		for(int i=0;i<n;i++) {
			char x = string.charAt(i);
			if((i<2 && x!='A') || i>=2) {
				answer.append(x);
			}
		}
		return (new String(answer));
	}

}
