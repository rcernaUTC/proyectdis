function main() {
	document.getElementById("btnIngresar").onclick = abrirFormulario;

}

function abrirFormulario() {
	document.getElementById("principal").style.display = "block";
	document.getElementById("inicio").style.display = "none";
}
window.onload = main;
