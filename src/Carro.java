
/**
 * Exercício Definição de classe Carro
 *
 */
class Carro {
    /**
     * Definição de atributos(cor, modelo e capacidadeTanque) à classe Carro
     */
    String cor;
    String modelo;
    int capacidadeTanque;

    //Construtor aqui (sobrecarga)
    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //gets e sets

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }


    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //metodo do total para encher o tanque
    double totalvalorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
