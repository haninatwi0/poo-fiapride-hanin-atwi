package br.com.fiap.model;

public class TenisInfantil extends Tenis implements Vendavel{

    private boolean temVelcro;

    public TenisInfantil(String cor, String marca, int numeracao, Dono proprietario, boolean temVelcro) {
        super(cor, marca, numeracao, proprietario);
        this.temVelcro = temVelcro;
    }

    public boolean isTemVelcro() {
        return this.temVelcro;
    }
    
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.15;
    }
    
    @Override
    public void exibirTipo() {
        System.out.println("Tipo: Tênis Infantil");
    }

	@Override
	public void vender(int preco) {
		if (preco < Vendavel.PRECO_MINIMA || preco > Vendavel.PRECO_MAXIMA) {
            System.out.println("Erro: Preco inválido!");
            return;
        }
        
        System.out.println("Tenis de Infantil: " + this.getMarca() + " vender por " + preco + "$");			
	}
}
