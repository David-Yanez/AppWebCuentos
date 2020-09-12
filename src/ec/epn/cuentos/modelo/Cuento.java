package ec.epn.cuentos.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

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
	private String nombrecu;
	@Column
	private String autor;
	@Column
	private String descripcion;
	
	@Column
	private String archivo;
	
	@Column
	private String imagen;
	
	@ManyToOne
	//@Column
	@JoinColumn (name="id_usuario", referencedColumnName = "id_usuario")
	
	private Usuario id_usuario;

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

	public String getNombrecu() {
		return nombrecu;
	}

	public void setNombrecu(String nombrecu) {
		this.nombrecu = nombrecu;
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

	

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getArchivo() {
		return archivo;
	}

	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	

	
	

	
}
