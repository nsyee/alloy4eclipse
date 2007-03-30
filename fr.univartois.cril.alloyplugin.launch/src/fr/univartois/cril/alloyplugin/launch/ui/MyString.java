package fr.univartois.cril.alloyplugin.launch.ui;

public class MyString {
	String string;
	MyString(String s){
		update(s);
	}
	public String toString(){
		return string;	
	}

	public void update(String s){
		assert(s!=null);
		string=s;
	}
}
