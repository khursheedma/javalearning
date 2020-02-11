package Java.Day11;

import java.io.IOException;

// errors -> can't be handled
// exceptions -> expected and can be handled


public class ErrorsAndExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*try {
			// whatever goes wrong will be handled in catch
		} catch (Exception e) {
			// we can have mutliple catches
		} catch (IOException e) {
			// we can have mutliple catches
		} catch (FileAlreadyExistsException e) {
			// we can have mutliple catches
		}
		finally {
			// statements
		}
		// statements
*/		
		
		System.out.println("L0");
		int i = 0;
		int j = 100;
		// double m = j/i;
		
		try {
			System.out.println("L1");
			double k = j/i;
		} catch (Exception e) {
			System.out.println("L3");
			throw e;
		}  /*catch (IOException e) {
			System.out.println("L4");
		} */finally {
			System.out.println("L5");
		}
		System.out.println("L2");  
	}

}
