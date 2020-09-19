/**
 * 
 */
function editarArchivo(elemento){
	
	
var file = elemento.files[0];
var hidden = document.formu2.nombre;
hidden.value = file.name;
//document.formu.target = "nu"
document.formu2.action = "ActualizarCuento";
alert("Actualizar Archivo"+hidden.value);
}