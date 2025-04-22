package organizacaoDados;
import java.util.UUID;

public interface Cadastro<TIPO> {
  void salvar(TIPO cliente) throws CpfInvalidoException;
  TIPO buscar(UUID codigo);
  void deletar(UUID codigo);
  void atualizar(TIPO objetoAtualizar);
  void imprimirRegistros();
}
