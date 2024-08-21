public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
    
        SmartTv smartTv = new SmartTv();

        //Mostrar estado da SmartTv
        System.out.println("Estado da Smart Tv = " + smartTv.ligada);
        
        //Mostrar volume da SmartTv
        System.out.println("Volume da Smart Tv = " +smartTv.volume);
        
        //Mostrar canal da SmartTv
        System.out.println("Canal da Smart Tv = " +smartTv.canal);

        smartTv.ligar();
        //Mostrar novo estado da SmartTv
        System.out.println("Novo estado da Smart Tv -> " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        //Mostrar novo volume da SmartTv
        System.out.println("Novo volume da Smart Tv -> " + smartTv.volume);

        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        smartTv.mudarCanal();
        
        //Mostrar novo canal da SmartTv
        System.out.println("Novo canal da Smart Tv -> " + smartTv.canal);

    }
}
