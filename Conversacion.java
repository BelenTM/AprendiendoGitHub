public class Conversacion {
    private Saludo saludo;
    private Despedida despedida;

    public Conversacion(){
        saludo = new Saludo();
        despedida = new Despedida();
    }

    public void iniciarConversacion(){
        saludo.saludar();
        despedida.despedir();
    }
    
}
