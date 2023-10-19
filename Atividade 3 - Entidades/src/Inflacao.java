public class Inflacao {
    float valor;
    float perído;
    float porcentagemJuros;

    void aumentarValor(){
        if(valor > 0 && perído > 0 && porcentagemJuros > 0);
        valor = valor + (valor*porcentagemJuros) / 100;
        System.out.println("A inflacao subiu no gráfico representativo");
    }

    void diminuirValor(){
         if(valor > 0 && perído > 0 && porcentagemJuros > 0);
        valor = valor - (valor*porcentagemJuros) / 100;
        System.out.println("A inflacao desceu no gráfico representativo");
    }

    void estabilizarValor(){
         if(valor > 0 && perído > 0 && porcentagemJuros > 0);
        valor = valor - (valor*0.1f);
        System.out.println("A inflacao estabilizou");
    }

}