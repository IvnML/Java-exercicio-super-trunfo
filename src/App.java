import java.util.ArrayList;
import java.util.Random;

class Jogador{
    private String  nome;
    private int vitorias = 0;
    private int empates = 0;
    private ArrayList<Carro> cartas;

    Jogador(String nome){
        this.nome = nome;
        cartas = new ArrayList<Carro>();
    }
    String getNome(){
        return nome;
    }
    void adicionaCartas(Carro carros){
        cartas.add(carros);
    }
    int quantidadeCartas(){
        return cartas.size();
    }
    void mostraCarta(){
        if(cartas.isEmpty() == true){
            System.out.println("Jogador não tem cartas");
        }
        else{
            for(int k = 0; k < this.quantidadeCartas(); k++){
                System.out.println("\tCarta - " + (k + 1));
                cartas.get(k).mostraCarro();
                
            }
        }        
    }
    
    void partida(Jogador playerDois){
        for(int i = 0; i < 6; i++){ // o inteiro determinará o atributo a ser comparado            
            switch (i) {
                case 0: // primeiro item a ser comparado...
                    System.out.println("Jogada - " + (i + 1) + " atributo comparado: Velocidade máxima(km/h).");
                    if(cartas.get(i).getVelocidadeMax() > playerDois.cartas.get(i).getVelocidadeMax()){
                        vitorias++;
                        System.out.println("Ganhador: " + nome + " Valores: " + cartas.get(i).getVelocidadeMax() + ">" + playerDois.cartas.get(i).getVelocidadeMax());
                    }
                    else if(cartas.get(i).getVelocidadeMax() < playerDois.cartas.get(i).getVelocidadeMax()){
                        playerDois.vitorias++;
                        System.out.println("Ganhador: " + playerDois.nome + " Valores: " + playerDois.cartas.get(i).getVelocidadeMax() + ">" + cartas.get(i).getVelocidadeMax());
                    }
                    else{
                        empates++;    
                        System.out.println("Empate!");                    
                    }                    
                    break;
                case 1:
                    System.out.println("Jogada - " + (i + 1) + " atributo comparado: Centímetros Cúbicos(Cc).");
                    if(cartas.get(i).getCentimetrosCubicos() > playerDois.cartas.get(i).getCentimetrosCubicos()){
                        vitorias++;
                        System.out.println("Ganhador: " + nome + " Valores: " + cartas.get(i).getCentimetrosCubicos() + ">" + playerDois.cartas.get(i).getCentimetrosCubicos());
                    }
                    else if(cartas.get(i).getCentimetrosCubicos() < playerDois.cartas.get(i).getCentimetrosCubicos()){
                        playerDois.vitorias++;
                        System.out.println("Ganhador: " + playerDois.nome + " Valores: " + playerDois.cartas.get(i).getCentimetrosCubicos() + ">" + cartas.get(i).getCentimetrosCubicos());
                    }
                    else{
                        empates++;
                        System.out.println("Empate!");                    
                    } 
                    break; 
                case 2:
                    System.out.println("Jogada - " + (i + 1) + " atributo comparado: 0 - 100(km/h).");
                    if(cartas.get(i).getZeroACem() > playerDois.cartas.get(i).getZeroACem()){
                        vitorias++;
                        System.out.println("Ganhador: " + nome + " Valores: " + cartas.get(i).getZeroACem() + ">" + playerDois.cartas.get(i).getZeroACem());
                    }
                    else if(cartas.get(i).getZeroACem() < playerDois.cartas.get(i).getZeroACem()){
                        playerDois.vitorias++;
                        System.out.println("Ganhador: " + playerDois.nome + " Valores: " + playerDois.cartas.get(i).getZeroACem() + ">" + cartas.get(i).getZeroACem());
                    }
                    else{
                        empates++;
                        System.out.println("Empate!");                    
                    }   
                    break;
                case 3:
                    System.out.println("Jogada - " + (i + 1) + " atributo comparado: Potência(cv).");   
                    if(cartas.get(i).getPotencia() > playerDois.cartas.get(i).getPotencia()){
                        vitorias++;
                        System.out.println("Ganhador: " + nome + " Valores: " + cartas.get(i).getPotencia() + ">" + playerDois.cartas.get(i).getPotencia());
                    }
                    else if(cartas.get(i).getPotencia() < playerDois.cartas.get(i).getPotencia()){
                        playerDois.vitorias++;
                        System.out.println("Ganhador: " + playerDois.nome + " Valores: " + playerDois.cartas.get(i).getPotencia() + ">" + cartas.get(i).getPotencia());
                    }
                    else{
                        empates++;
                        System.out.println("Empate!");                    
                    } 
                    break;
                case 4:
                    System.out.println("Jogada - " + (i + 1) + " atributo comparado: Comprimento(mm).");
                    if(cartas.get(i).getComprimento() > playerDois.cartas.get(i).getComprimento()){
                        vitorias++;
                        System.out.println("Ganhador: " + nome + " Valores: " + cartas.get(i).getComprimento() + ">" + playerDois.cartas.get(i).getComprimento());
                    }
                    else if(cartas.get(i).getComprimento() < playerDois.cartas.get(i).getComprimento()){
                        playerDois.vitorias++;
                        System.out.println("Ganhador: " + playerDois.nome + " Valores: " + playerDois.cartas.get(i).getComprimento() + ">" + cartas.get(i).getComprimento());
                    }
                    else{
                        empates++;
                        System.out.println("Empate!");                    
                    }  
                    break;
                case 5:
                    System.out.println("Jogada - " + (i + 1) + " atributo comparado: Peso(kg).");
                    if(cartas.get(i).getPeso() > playerDois.cartas.get(i).getPeso()){
                        vitorias++;
                        System.out.println("Ganhador: " + nome + " Valores: " + cartas.get(i).getPeso() + ">" + playerDois.cartas.get(i).getPeso());
                    }
                    else if(cartas.get(i).getPeso() < playerDois.cartas.get(i).getPeso()){
                        playerDois.vitorias++;
                        System.out.println("Ganhador: " + playerDois.nome + " Valores: " + playerDois.cartas.get(i).getPeso() + ">" + cartas.get(i).getPeso());
                    }
                    else{
                        empates++;
                        System.out.println("Empate!");                    
                    }
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }          
        }
        System.out.println("\nResultados:");
        if(vitorias > playerDois.vitorias){
            System.out.println("Vencedor: " + this.nome + " , partidas ganhas - " + vitorias + ", empates - " + empates);
            System.out.println("Perdedor: " + playerDois.nome + ", partidas ganhas - " + playerDois.vitorias);
        }
        else if(vitorias < playerDois.vitorias){
            System.out.println("Vencedor: " + playerDois.nome + " , partidas ganhas - " +playerDois.vitorias + ", empates - " + empates);
            System.out.println("Perdedor: " + this.nome + ", partidas ganhas - " + this.vitorias);
        }
        else{
            System.out.println("Empate técnico!");
        }

    }


}

class Carro{

    private String nome;
    private int velocidadeMax;
    private int centimetrosCubicos;
    private float zeroACem;
    private int potencia;
    private int comprimento;
    private int peso;
    
    Carro(String nome, int velocidadeMax, int centimetrosCubicos, float zeroACem, int potencia, int comprimento, int peso){
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;;
        this.centimetrosCubicos = centimetrosCubicos;
        this.zeroACem = zeroACem;
        this.potencia = potencia;
        this.comprimento = comprimento;
        this.peso = peso;
    } 

    int getVelocidadeMax(){
        return velocidadeMax;
    }
    int getCentimetrosCubicos(){
        return centimetrosCubicos;
    }
    Float getZeroACem(){
        return zeroACem;
    }
    int getPotencia(){
        return potencia;
    }
    int getComprimento(){
        return comprimento;
    }
    int getPeso(){
        return peso;
    }

    void mostraCarro(){
        System.out.println(" *** " + this.nome + " *** ");
        System.out.println("1. Velocidade máxima: " + this.velocidadeMax + " km/h");
        System.out.println("2. Centímetos Cúbicos: " + this.centimetrosCubicos + "Cm³");
        System.out.println("3. 0 - 100: " + this.zeroACem + " seg.");
        System.out.println("4. Potência: " + this.potencia + " cv");
        System.out.println("5. Comprimento: " + this.comprimento + " mm");
        System.out.println("6. Peso: " + this.peso + " kg");
    }   

}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Super trunfo\n\n");
        
        Random aleatorio = new Random();

        // instanciação dos objetos das cartas de carros.
        Carro c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
        c1 = new Carro("Porsche Carrera 911", 293, 2931, 4.2f, 385, 4519, 1855);
        c2 = new Carro("BMW M5 v8 turbo",305, 4395, 3.4f, 600, 4965, 1855);
        c3 = new Carro("Mercedes Benz SLK 55 AMG", 250, 5461, 4.6f, 422, 4146, 1610);
        c4 = new Carro("Lexus LFA v10",325, 4805, 3.8f, 560, 4505, 1580);
        c5 = new Carro("Lamborghini Huracan evo LP 640-4", 325, 5204, 2.9f, 640, 4520, 1422);
        c6 = new Carro("Ferrari F40 v8 biturbo", 324, 2936, 4.1f, 478, 4358, 1100);
        c7 = new Carro("Ferrari Porto Fino M", 320, 3855, 3.45f, 620, 4594, 1664);
        c8 = new Carro("Nissan GTR Premium v6", 320, 3799, 2.8f, 572, 4710, 1752);
        c9 = new Carro("McLaren 540C", 320, 3799, 3.5f, 540, 4530, 1311);
        c10 = new Carro("Agera RS v8", 447, 5000, 2.8f, 1160, 4293, 1395);
        c11 = new Carro("Aston Martin BD11 v8 turbo", 305, 3982, 4.0f, 510, 4750, 1760);
        c12 = new Carro("Chevrolet Camaro SS v8", 290, 6162, 4.2f, 461, 4784, 1709);
               
        
        // instanciação dos objetos jogadores
        Jogador player1 = new Jogador("Jogador 1");
        Jogador player2 = new Jogador("Jogador 2");

        ArrayList<Carro> listaCarros = new ArrayList<Carro>(); // Lista para armazenar as cartas
        listaCarros.add(c1);
        listaCarros.add(c2);
        listaCarros.add(c3);
        listaCarros.add(c4);
        listaCarros.add(c5);
        listaCarros.add(c6);
        listaCarros.add(c7);
        listaCarros.add(c8);
        listaCarros.add(c9);
        listaCarros.add(c10);
        listaCarros.add(c11);
        listaCarros.add(c12);
         
        // Adiciona os objetos carros ao objeto jogador
        System.out.println("\tAdicionando cartas ao jogador 1: " + player1.getNome() + "\n");
        for(int j = 0; j < 6; j++){
            player1.adicionaCartas(listaCarros.get(aleatorio.nextInt(12)));// gera cartas aleatórias em cada posição
        }
        // mostra as cartas que o jogador tem.
        player1.mostraCarta();

        System.out.println("\n\tAdicionando cartas ao jogador 2: " + player2.getNome() + "\n");
        for(int j = 0; j < 6; j++){
            player2.adicionaCartas(listaCarros.get(aleatorio.nextInt(12)));
        }
        player2.mostraCarta();

        System.out.println("\n\t*********** Início da partida ***********");
        player1.partida(player2);



    }


}
