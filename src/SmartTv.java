public class SmartTv {
    
    //variáveis
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume += 1;
    }

    public void diminuirVolume(){
        volume -= 1;
    }

    public void mudarCanal(){
        canal += 1;

        if (canal == 8)
            canal = 1;
    }

    
}
