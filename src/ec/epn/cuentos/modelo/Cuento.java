package ec.epn.cuentos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.JFileChooser;

@Entity
public class Cuento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cuentos;
	@Column
	private String tipo;
	@Column
	private String genero;
	@Column
	private String nombreCU;
	@Column
	private String autor;
	@Column
	private String descripcion;
	@Column
	private byte[] archivo ; 
	@Column
	private Integer id_usuario;
	

	

	
	
	public Integer getId_cuentos() {
		return id_cuentos;
	}
	public void setId_cuentos(Integer id_cuentos) {
		this.id_cuentos = id_cuentos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNombreCU() {
		return nombreCU;
	}
	public void setNombreCU(String nombreCU) {
		this.nombreCU = nombreCU;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public byte[] getArchivo() {
		return archivo;
	}
	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	
	
	
	
}
