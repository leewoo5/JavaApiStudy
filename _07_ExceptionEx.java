package study;

public class _07_ExceptionEx {

	public static void main(String[] args) {
		try {
			int result = subtract(10, 100);
			System.out.println(result);
		} catch (_07_invalidInputException e) {
			System.out.println(e.getMessage());
			e.WrongInput();
		}
	}
	
	private static int subtract(int a, int b) throws _07_invalidInputException {
		
		if (a < b) {
			throw new _07_invalidInputException(a, b);
		}
		return a-b;
		
	}

}
