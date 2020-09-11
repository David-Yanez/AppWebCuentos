function cargarArchivo(elemento){
	
//	alert("hola como estas");
var file = elemento.files[0];
var hidden = document.formu.nombre;
hidden.value = file.name;
//document.formu.target = "nu"
document.formu.action = "RegistroCuento";
//document.formu.submit();

}


