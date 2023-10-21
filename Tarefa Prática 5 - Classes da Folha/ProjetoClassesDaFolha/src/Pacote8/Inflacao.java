package Pacote8;

public class Inflacao {
    public float valor;
    public float perído;
    public float porcentagemJuros;

    public void aumentarValor(){
        if(valor > 0 && perído > 0 && porcentagemJuros > 0);
        valor = valor + (valor*porcentagemJuros) / 100;
        System.out.println("A inflaçãoo subiu no gráfico representativo");
    }

    public void diminuirValor(){
         if(valor > 0 && perído > 0 && porcentagemJuros > 0);
        valor = valor - (valor*porcentagemJuros) / 100;
        System.out.println("A inflação desceu no gráfico representativo");
    }

    public void estabilizarValor(){
         if(valor > 0 && perído > 0 && porcentagemJuros > 0);
        valor = valor - (valor*0.1f);
        System.out.println("A inflação estabilizou");
    }
}