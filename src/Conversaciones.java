public class Conversaciones {
    private Saludo saludo;
    private Despedida despedida;
    public Conversaciones(){
        saludo = new Saludo();
        despedida = new Despedida();
    }
    public void iniciarConversacion(){
        saludo.saludar();
        despedida.despedir();
    }
}
