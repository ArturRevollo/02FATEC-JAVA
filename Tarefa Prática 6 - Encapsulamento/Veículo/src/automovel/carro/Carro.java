package automovel.carro;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double motor;

    private double quantidadeTanque;

    private double velocidade = 0;
    private double gasolinaTanque = 0;
    private boolean ligado = false;

    public Carro(String marca, String modelo, int ano, double motor, double quantidadeTanque) {
        this.marca = marca;
        this.motor = motor;
        this.ano = ano;
        this.modelo = modelo;
        this.quantidadeTanque = quantidadeTanque;

    }

    public void girarChaveIgnicao() {
        if (this.motor > 0 && !this.ligado && this.gasolinaTanque > 0) {

            this.ligado = true;
            System.out.println("O Carro ligou...");

        }

        else if (this.motor > 0 && this.ligado && this.gasolinaTanque > 0) {

            this.ligado = false;
            this.velocidade = 0;
            System.out.println("O Carro desligou...");

        }

        else if (this.motor > 0 && !this.ligado && this.gasolinaTanque == 0) {

            System.out.println("O Carro está sem gasolina...");

        }

        else {

            System.out.println("O carro está com algum outro problema sério no motor...");

        }
    }

    public double acelerar() {
		if(this.ligado && this.gasolinaTanque > 0 && this.velocidade < 180) {
		
			this.velocidade += 20;
			this.removerGasolina();
			return this.velocidade;

		}else if(ligado && this.velocidade >= 180){
            this.velocidade = 180;
            System.out.println("O carro já está no limite de velocidade!");

        }else if(ligado){
			this.velocidade = 0;
			this.ligado = false;
			this.gasolinaTanque = 0;
			System.out.println("O seu carro gastou toda gasolina do tanque, abasteça seu carro...");
        }
        
	
		return 0;
	}

    public double frear() {
        if (this.ligado && this.velocidade > 0) {

            this.velocidade -= 20;
            return this.velocidade;

        }

        return 0;
    }

    public double adicionarGasolina(double gasolina, float valor) {

        if (gasolina <= this.quantidadeTanque && gasolina > 0) {
            if (this.gasolinaTanque < this.quantidadeTanque) {
                this.gasolinaTanque += gasolina;
            System.out.println("você gastou " + (valor * gasolina) + " reais");
                return this.gasolinaTanque;
            } else {
                System.out.println("O Tanque está totalmente cheio!");
                return this.gasolinaTanque;
            }
        }else{
            System.out.println("A Quantidade de gasolina é insuficiente!");
            return this.gasolinaTanque;
        }
    }


    public double removerGasolina() {
        this.gasolinaTanque -= 10;
        return this.gasolinaTanque;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getQuantidadeTanque() {
        return quantidadeTanque;
    }

    public void setQuantidadeTanque(double quantidadeTanque) {
        this.quantidadeTanque = quantidadeTanque;
    }

    public double getGasolinaTanque() {
        return gasolinaTanque;
    }
}