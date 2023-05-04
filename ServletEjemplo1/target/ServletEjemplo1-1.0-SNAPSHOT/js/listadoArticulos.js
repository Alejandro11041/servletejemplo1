consumirServlet("/ServletEjemplo1/ArticulosListServlet").then( (datos) => {
    poblarDatos(datos);
});
id,Nombre,Categoria,Precio,Descripcion
function poblarDatos(datos){
    headers = ["Id","Nombre","Categoria", "Precio","Descripcion"];
    acciones = [{nombre:"Ver",accion : verArticulo}];
    crearDataTable(datos, headers,"tabla-articulos",acciones);
}
function verArticulo(evento){
    fila = obtenerFilaEvento(evento);
    alert("ID: "+fila[0].textContent+" Nombre: "+fila[1].textContent)
    console.log(fila[0].textContent);
}