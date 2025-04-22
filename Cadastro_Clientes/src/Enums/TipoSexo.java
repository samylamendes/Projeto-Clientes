package Enums;

public enum TipoSexo {
	M("Masculino"),
	F("Feminino"),
	O("Outros");
 
	private final String constantes;
	
	TipoSexo(String constantes){
		this.constantes = constantes;
	}
	
	public String getConstante() {
		return constantes;
	}
	
	@Override 
	public String toString() {
		return constantes;
	}
}