package organizacaoDados;
import java.util.List;
import java.util.UUID;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import dominio.Cliente;

public class LogicaCadastro implements Cadastro<Cliente> {
   private List<Cliente> lista;
   
   public LogicaCadastro(){
	   this.lista = new ArrayList<>();
   }

@Override
public void salvar(Cliente cliente) throws CpfInvalidoException {
		ValidadorCpf.validarCpf(cliente);
	this.lista.add(cliente);
	
}

@Override
public Cliente buscar(UUID codigo) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deletar(UUID codigo) {
	// TODO Auto-generated method stub
	
}

@Override
public void atualizar(Cliente objetoAtualizar) {
	// TODO Auto-generated method stub
	
}

@Override
public void imprimirRegistros() {
	for(Cliente cliente : this.lista) {
		System.out.print(cliente);
	}
	
}
   
}
