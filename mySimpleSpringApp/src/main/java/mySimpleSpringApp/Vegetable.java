package mySimpleSpringApp;

public class Vegetable {
	private String myName;

	public String talkAboutYourself() {
		String speech = "Hi, I am a vegetable!";
		if(myName != null && myName != "") {
			speech = speech + "My name is " + myName;
		}
		return speech;
	}


	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}



}
