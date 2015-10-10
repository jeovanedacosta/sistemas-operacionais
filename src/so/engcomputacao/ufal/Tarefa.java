package so.engcomputacao.ufal;

//http://blog.caelum.com.br/ordenando-colecoes-com-comparable-e-comparator/

public class Tarefa implements Comparable<Tarefa> {
	
	private int tempChegada;
	private int prioridade;
	private int duracao;
	private int tempSaida;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTempChegada() {
		return tempChegada;
	}
	public void setTempChegada(int tempChegada) {
		this.tempChegada = tempChegada;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getTempSaida(){
		return tempChegada+duracao;
	}
	
	@Override
	public int compareTo(Tarefa outro) {
		
		if (this.tempChegada < outro.getTempChegada()) {
	            return -1;
	    }
	    if (this.tempChegada > outro.getTempChegada()) {
	           return 1;
	    }
	    if(this.tempChegada == outro.getTempChegada()){
	    	if(this.prioridade > outro.getPrioridade()){
	    		return -1;
	    	}else{
	    		return 1;
	    	} 	
	    }
	    return 0;
	}
	
	

}