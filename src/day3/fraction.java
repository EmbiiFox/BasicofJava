package day3;

public class fraction {
	private int numerator;
	private int denominator;
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public fraction(int numerator, int denominator) {
		this.denominator= denominator;
		this.numerator= numerator;
	}
	
	public fraction(fraction A, fraction B, String operator ) {
		switch (operator) {
			case "+":
				add(A,B);
				break;
			case "-":
				minus(A,B);
				break;
			case "x":
			case "X":
			case "*":
			case ".":
				multiple(A,B);
				break;
			case ":":
			case "/":
				divide(A,B);
				break;
			default:
				break;
		}
		this.normalize();
	}	
	
	public String print() {
		return this.getNumerator() + "/" + this.getDenominator();
	}
	
	public int USCLN (int A, int B) {
		if (B==0) return A;
		return USCLN (B, A%B);
	}
	public void normalize() {
		int USCLN = this.USCLN(this.getNumerator(), this.getDenominator());
		this.setNumerator(this.getNumerator()/USCLN);
		this.setDenominator(this.getDenominator()/USCLN);
	}
	public boolean checkNormalize() {
		if (this.USCLN(this.getNumerator(), this.getDenominator())==1) {
			return true;
		}
		return false;
	}
	public void add(fraction A, fraction B) {
		this.denominator= A.getDenominator()*B.getDenominator();
		this.numerator= A.getNumerator()*B.getDenominator()+B.getNumerator()*A.getDenominator();
	}
	public void minus(fraction A, fraction B) {	
		this.denominator= A.getDenominator()*B.getDenominator();
		this.numerator= A.getNumerator()*B.getDenominator()-B.getNumerator()*A.getDenominator();
	}
	public void multiple(fraction A, fraction B) {	
		this.denominator= A.getDenominator()*B.getDenominator();
		this.numerator=A.getNumerator()*B.getNumerator();
	}
	public void divide(fraction A, fraction B) {	
		this.denominator= A.getDenominator()*B.getNumerator();
		this.numerator=A.getNumerator()*B.getDenominator();
	}

	
}

