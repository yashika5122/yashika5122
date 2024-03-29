package SampleProgram;

interface Clickable{
	default void click(){
		System.out.println("click");
	}
 
	default void print(){
		System.out.println("Clickable");
	}
}
 
interface Accessible{
	default void access(){
		System.out.println("access");
	}
 
	default void print(){
		System.out.println("Accessible");
	}
}
 
public class Button implements Clickable, Accessible {
 
	public void print(){
		System.out.println("inside");
		Clickable.super.print();
		Accessible.super.print();
	}
 
	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		button.access();
		button.print();
	}
}