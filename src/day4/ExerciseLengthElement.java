package day4;

public class ExerciseLengthElement {
	public static void main (String[] args) {
		String arrString[]= {"Zend 2", "PHP", "Java", "Javascript"};
		//[6,3,4,10]
		int[] arrInt= new int[5];
		int lengthStr= arrString.length;
		String Element;
		int lengthElement;
		for( int i=0; i< lengthStr; i++) {
			Element= arrString[i];
			lengthElement= Element.length();
			arrInt[i]=lengthElement;
			System.out.print(arrInt[i]+"\t");
		}
	}
}
