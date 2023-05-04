consumirServlet("/ServletEjemplo1/EmpleadoListServlet").then( (datos) => {
    poblarDatos(datos);
});

function poblarDatos(datos){
    headers = ["Id","Nombre","Ciudad", "Departamento","Salario"];
    acciones = [{nombre:"Ver",accion : verEmpleado}];
    crearDataTable(datos, headers,"tabla-empleados",acciones);
}
function verEmpleado(evento){
    fila = obtenerFilaEvento(evento);
    alert("ID: "+fila[0].textContent+" Nombre: "+fila[1].textContent)
    console.log(fila[0].textContent);
}