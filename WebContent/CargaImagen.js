function cargarImagen(elemento){
	

var file2 = elemento.files[0];
var hidden2 = document.formu.nombre2;
hidden2.value = file2.name;
//document.formu.target = "nu"
document.formu.action = "RegistroCuento";


}
