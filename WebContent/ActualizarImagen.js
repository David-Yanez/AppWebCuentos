/**
 * 
 */
function editarImagen(elemento){

	
var file2 = elemento.files[0];
var hidden2 = document.formu2.nombre2;
hidden2.value = file2.name;
//document.formu.target = "nu"
document.formu2.action = "ActualizarCuento";
	alert("Actualizar imagen"+hidden2.value);
	
}