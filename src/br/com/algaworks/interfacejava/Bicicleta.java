package br.com.algaworks.interfacejava;

public interface Bicicleta {
	
	void changeGear(int newValue);
    void changeCadence(int newValeu);
    void speedUp(int increment);
    void applyBreaks(int decrement);
    void printStates();
}
