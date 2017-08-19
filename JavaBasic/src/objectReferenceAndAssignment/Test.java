package objectReferenceAndAssignment;

public class Test {

	  public static void main(String[] args) {
	        Test o = new Test();
	        int baseInt = 1;
	        Integer objInt = 1;
	        System.out.println("baseInt: " + baseInt);
	        System.out.println("objInt: " + objInt);
	        o.changeInt(baseInt);
	        o.changeInteger(objInt);
	        System.out.println("baseInt: " + baseInt);
	        System.out.println("objInt: " + objInt);
	    }

	    public void changeInt(int baseInt) {
	        baseInt = 3;
	    }

	    public void changeInteger(Integer objInt) {
	        objInt = 3;
	    }
}
