package com.senati.clase02ejer01;

public class Articulo {
	
		private String codigo;
		private String descripcion;
		private String marca;
		private float precio;
		
		public Articulo() {
			this.codigo = "";
			this.descripcion = "";
			this.marca = "";
			this.precio = 0.0f;
		}

		public Articulo(String codigo, String descripcion, String marca, float precio) {
			
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.marca = marca;
			this.precio = precio;
		}
		
		public Articulo(Articulo a) {
			
			this.codigo = a.codigo;
			this.descripcion = a.descripcion;
			this.marca = a.marca;
			this.precio = a.precio;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}

		@Override
		public String toString() {
			return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", marca=" + marca + ", precio="
					+ precio + "]";
		}
		
		
}
