import java.util.Map;

import javax.naming.OperationNotSupportedException;

public class Parking {
	private int nbSlots;
	private Car[] cars;

	public Parking() {
		nbSlots = 0;
	}

	public Parking(int nbslots) {
		this.nbSlots = nbslots;
		cars = new Car[nbslots];
	}

	public void park(Car car, int slot) throws IndexOutOfBoundsException,IllegalStateException{
		if (slot >=nbSlots)
			throw new IndexOutOfBoundsException();
		else

		if (cars[slot] != null)
			throw new IllegalStateException();
		else
			cars[slot]=new Car(car);
	}
	public Car unpark(int slot)throws IndexOutOfBoundsException, OperationNotSupportedException{
		if(slot>=nbSlots)
			throw new IndexOutOfBoundsException();
		else
			if(cars[slot]==null)
				throw new OperationNotSupportedException();
			else{
				Car temp=cars[slot];
				cars[slot]=null;
				return temp;
			}
				
	}
	public String toString(){
		String temp="";
		for(int i=0;i<nbSlots;i++)
			temp+="\n Slot["+i+"] = "+(cars[i]==null?"empty":cars[i].getMark());
			return temp;
	}
}
