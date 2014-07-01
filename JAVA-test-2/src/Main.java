import javax.naming.OperationNotSupportedException;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car("BMW");
		Car car2=new Car("Mercedes");
		Car car3=new Car("Renault");
		Car car4=new Car("Nissan");
		
		Parking parking=new Parking(10);
		parking.park(car4, 1);
		
		//java.lang.IllegalStateException
		parking.park(car4, 1);
		
		//java.lang.IndexOutOfBoundsException
		parking.park(car3, 121);
		try {
			parking.unpark(1);
			//javax.naming.OperationNotSupportedException
			parking.unpark(6);
		} catch (IndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OperationNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(parking);
	}

}
