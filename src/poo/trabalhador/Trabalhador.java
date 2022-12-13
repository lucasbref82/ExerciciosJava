package poo.trabalhador;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivelTrabalhador;
	private Double salarioBase;
	private Departamento departamento;
	private List<Contrato> contratos;
	
	public Trabalhador() {
		this.contratos = new ArrayList<>();
	}
	
	public Trabalhador(String nome, NivelTrabalhador nivelTrabalhador, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivelTrabalhador = nivelTrabalhador;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
		this.contratos = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NivelTrabalhador getNivelTrabalhador() {
		return nivelTrabalhador;
	}
	public void setNivelTrabalhador(NivelTrabalhador nivelTrabalhador) {
		this.nivelTrabalhador = nivelTrabalhador;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public void adicionaContrato(Contrato contrato) {
		contratos.add(contrato);
	}
	
	public void removeContrato(Contrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double valorTotal(Integer mes, Integer ano) {
		Double valorTotal = salarioBase;
		for (Contrato contrato : contratos) {
			if(contrato.getDataContrato().getMonthValue() == mes && contrato.getDataContrato().getYear() == ano) {
				valorTotal += contrato.valorTotal();
			}
		}
		return valorTotal;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: ").append(this.nome).append("\n");
		builder.append("Departamento: ").append(this.getDepartamento().getNome()).append("\n");
		return builder.toString();
		
	}
	
	
}
