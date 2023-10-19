public class TesteTES {
    public  static void main (String [] args){
        TabelaDeEspalhamentoSimples t = new TabelaDeEspalhamentoSimples(100);
        try{
        t.adiciona(100, 11);
        t.adiciona(1, 22);
        t.adiciona(2,23);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Estado da Tabela de Espalhamento\n" + t.toString());
    }
    
}
