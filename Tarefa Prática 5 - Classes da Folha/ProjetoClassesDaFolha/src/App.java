import Pacote1.Aguia;
import Pacote10.Predio;
import Pacote2.Cadeira;
import Pacote3.Coelho;
import Pacote4.Fotografia;
import Pacote5.Gravidade;
import Pacote6.Helicoptero;
import Pacote7.HomemAranha;
import Pacote8.Inflacao;
import Pacote9.Jornalista;

public class App {
    public static void main(String[] args) throws Exception {
    
        Predio PD = new Predio();
        PD.altura = 12;
        PD.metragem = 56.76f;
        PD.QuantidadeApartamentos = 48;
        PD.estacionamento = "Cheio de carros estacionados";
        PD.AbrigarPessoas();

        Coelho CO = new Coelho();
        CO.especie = "REX";
        CO.cor = "Marrom";
        CO.sexo = "Macho";
        CO.peso = 3.0f;
        CO.SaltarChão();

        Cadeira CA = new Cadeira();
        CA.tipo = "Ergonômica e Macia";
        CA.material = "Confortável";
        CA.preço = 599.00f;
        CA.CadeiraParada();

        Gravidade GR = new Gravidade();
        GR.densidade = true;
        GR.intensidade = true;
        GR.AfetarTudo();

        HomemAranha HA = new HomemAranha();
        HA.herói = true;
        HA.uniforme = true;
        HA.sentidoAranha = true;
        HA.escalar = true;
        HA.força = true;
        HA.teias = true;
        HA.SalvarPessoas();
        HA.CombaterMal();
        HA.Escalar();
        HA.JogarTeias();

        Helicoptero HE = new Helicoptero();
        HE.hélice = true;
        HE.modelo = true;
        HE.cor = true;
        HE.capacidade = 6;
        HE.Voar();

        Aguia AG = new Aguia();
        AG.especie = "Águia-real";
        AG.penas = "Cor marrom";
        AG.asas = "Fortes";
        AG.bico = "Resistente";
        AG.garras = "Afiadas";
        AG.tamanhoComprimentoCentímetro = 90;
        AG.Caçar();

        Inflacao IN = new Inflacao();        
        IN.valor = 30;
        IN.perído = 5;
        IN.porcentagemJuros = 25;
        IN.aumentarValor();
        IN.diminuirValor();
        IN.estabilizarValor();

        Jornalista JO = new Jornalista();
        JO.matéria = true;
        JO.entrevista = true;
        JO.manchete = true;
        JO.EntregarNotícia();

        Fotografia FO = new Fotografia();
        FO.pixels = "Muitos.";
        FO.tamanhoMegaBytes = 43;
        FO.tipo = "Importante.";
        FO.elementos = "Uma festa surpresa muito legal!";
        FO.cores = "Cores quentes e coloridas.";
        FO.RegistrarMomento();
    }
}