package statepattern;

public class TVUpdateState implements State {

	@Override
	public void doAction() {

		System.out.println("TV updated to latest version of Android");

	}

}
