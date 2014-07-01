
public class Car {
	private String mark;

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Car(Car car) {
		// TODO Auto-generated constructor stub
		this.mark=car.mark;
	}
	public Car(String mark){
		this.mark=mark;
	}
}
