package exam03;

class MinusException extends RuntimeException {
	MinusException () {	}
	MinusException(String s) {
		super(s);
	}
}

class OverException extends RuntimeException {
	OverException () {	}
	OverException(String s) {
		super(s);
	}
}

class Score {
	void check(int score) {
		if (score < 0) {
			MinusException me = new MinusException("음수값 입력!!!");
			throw me;
		}
		
		if (score > 100) {
			OverException oe = new OverException("100점 초과!!!");
			throw oe;
		}

	}

}

public class Main {

	public static void main(String[] args) {
		Score score = new Score();
		
		score.check(-10);
		
		score.check(200);

	}

}
