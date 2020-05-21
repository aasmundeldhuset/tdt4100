package classes;

public interface IMyArrayListObserver {
	void numberAdded(int number);
	void numberChanged(int index, int oldNumber, int newNumber);
}
