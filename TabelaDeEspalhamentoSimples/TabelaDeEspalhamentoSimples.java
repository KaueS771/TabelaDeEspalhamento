public class TabelaDeEspalhamentoSimples {
    private int tabela[];
    public TabelaDeEspalhamentoSimples(int capMax){
        tabela = new int[capMax];
    }
    public int fEspalha(int chave){
        return chave-1;
    }
    public void adiciona (int chave, int quantidade){
        int indice = fEspalha(chave);
        if(indice >=0 && indice<tabela.length){
            tabela[indice] = quantidade;
        }
    }
    public int remove(int chave) throws Exception{
         int indice = fEspalha(chave);
          if(indice >=0 && indice<tabela.length){
            int r = tabela[indice];
            tabela[indice] = 0;
            return r;
        }else{
            throw new Exception("Codigo de Produto Invalido");

        }
    }
    public String toString(){
        String s="";
        for (int i=0; i<tabela.length; i++){
            s = s + "\t" + tabela[i];
        }
        return s;
    }

      
}
