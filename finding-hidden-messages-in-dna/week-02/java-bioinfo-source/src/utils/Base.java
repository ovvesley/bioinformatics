package utils;

public enum Base {
	CYTOSINE('C'), GUANINE('G'), TIMINE('T'), ADENINE('A');

	private final char base;

	Base(char base) {
		this.base = base;
	}

	public char getBase() {
		return this.base;
	}

}
