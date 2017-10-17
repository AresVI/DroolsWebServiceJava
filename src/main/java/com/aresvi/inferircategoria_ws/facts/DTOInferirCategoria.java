package com.aresvi.inferircategoria_ws.facts;

public class DTOInferirCategoria {
	private double porcentajeNoRequerido;
	private double porcentajeNivel5;
	private double porcentajeNivel4;
	private double porcentajeNivel3;
	private double porcentajeNivel2;
	private double porcentajeNivel1;
	private int nivelInformatizacion;
	
	public int getNivelInformatizacion() {
		return nivelInformatizacion;
	}

	public void setNivelInformatizacion(int nivelInformatizacion) {
		this.nivelInformatizacion = nivelInformatizacion;
	}

	public DTOInferirCategoria(double porcentajeNoRequerido, double porcentajeNivel5, double porcentajeNivel4,
			double porcentajeNivel3, double porcentajeNivel2, double porcentajeNivel1, int nivelInformatizacion) {
		super();
		this.porcentajeNoRequerido = porcentajeNoRequerido;
		this.porcentajeNivel5 = porcentajeNivel5;
		this.porcentajeNivel4 = porcentajeNivel4;
		this.porcentajeNivel3 = porcentajeNivel3;
		this.porcentajeNivel2 = porcentajeNivel2;
		this.porcentajeNivel1 = porcentajeNivel1;
		this.nivelInformatizacion = nivelInformatizacion;
	}

	public DTOInferirCategoria(double porcentajeNoRequerido, double porcentajeNivel5, double porcentajeNivel4,
			double porcentajeNivel3, double porcentajeNivel2, double porcentajeNivel1) {
		super();
		this.porcentajeNoRequerido = porcentajeNoRequerido;
		this.porcentajeNivel5 = porcentajeNivel5;
		this.porcentajeNivel4 = porcentajeNivel4;
		this.porcentajeNivel3 = porcentajeNivel3;
		this.porcentajeNivel2 = porcentajeNivel2;
		this.porcentajeNivel1 = porcentajeNivel1;
	}

	public double getPorcentajeNoRequerido() {
		return porcentajeNoRequerido;
	}

	public void setPorcentajeNoRequerido(double porcentajeNoRequerido) {
		this.porcentajeNoRequerido = porcentajeNoRequerido;
	}

	public double getPorcentajeNivel5() {
		return porcentajeNivel5;
	}

	public void setPorcentajeNivel5(double porcentajeNivel5) {
		this.porcentajeNivel5 = porcentajeNivel5;
	}

	public double getPorcentajeNivel4() {
		return porcentajeNivel4;
	}

	public void setPorcentajeNivel4(double porcentajeNivel4) {
		this.porcentajeNivel4 = porcentajeNivel4;
	}

	public double getPorcentajeNivel3() {
		return porcentajeNivel3;
	}

	public void setPorcentajeNivel3(double porcentajeNivel3) {
		this.porcentajeNivel3 = porcentajeNivel3;
	}

	public double getPorcentajeNivel2() {
		return porcentajeNivel2;
	}

	public void setPorcentajeNivel2(double porcentajeNivel2) {
		this.porcentajeNivel2 = porcentajeNivel2;
	}

	public double getPorcentajeNivel1() {
		return porcentajeNivel1;
	}

	public void setPorcentajeNivel1(double porcentajeNivel1) {
		this.porcentajeNivel1 = porcentajeNivel1;
	}

	public DTOInferirCategoria() {
		// TODO Auto-generated constructor stub
	}

	

}
