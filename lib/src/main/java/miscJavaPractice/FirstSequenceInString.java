package miscJavaPractice;

public class FirstSequenceInString {

	public static void main(String[] args) {
		
		String sequence = "rag";
		
		String mainStr = "Chirag Bangera";
		
		int idx = findFirstSequenceIndex(sequence, mainStr);
		
		System.out.println("Index of first sequence in String => " + idx);
		
	}
	
	public static int findFirstSequenceIndex(String sequence, String mainStr) {
		return mainStr.indexOf(sequence);
	}
	
}
