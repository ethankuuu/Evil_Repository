package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;

	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big red dog";
	}
	public Dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(int b) {
		name = "Clifford";
		age = b;
		breed = "dog dog";
	}
	public Dog(String a, String c) {
		name = a;
		age = 1;
		breed = c;
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int b){
		age = b;
	}
	public void setBreed(String c){
		breed = c;
	}
	public String getName(){
		return name;
		
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public boolean isSleeping(){
		if (Math.random()>0.5){
			return true;
		}else{
			return false;
	}}
	public void bark(){
		System.out.println(name + " Barks");
	}
}
