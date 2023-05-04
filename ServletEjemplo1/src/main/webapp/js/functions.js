function crearDataTable(data, headers, parentElement,acciones) {
    var mainContainer = document.getElementById(parentElement);
    tbl = document.createElement('table');
    tbl.className = "data-table";
    const tr = tbl.insertRow();
    for (let j = 0; j < headers.length; j++) {
        th = document.createElement('th');
        th.appendChild(document.createTextNode(`${headers[j]}`));
        tr.appendChild(th);
    }
    if(acciones.length>0){
        th = document.createElement('th');
        th.appendChild(document.createTextNode(`Acción`));
        tr.appendChild(th);
    }
    for (let i = 0; i < data.length; i++) {
        const tr = tbl.insertRow();
        for (let j = 0; j < headers.length; j++) {
            let td = tr.insertCell();
            td.appendChild(document.createTextNode(`${data[i][headers[j].toLowerCase()]}`));
        }

        let td = tr.insertCell();
        a = document.createElement('a');
        a.href="#";
        a.textContent="Ver";
        a.onclick=acciones[0]['accion'];
        td.appendChild(a);
    }
    mainContainer.appendChild(tbl);
}

async function consumirServlet(url) {
    const response = await fetch(url);
    return await response.json();
}

function obtenerFilaEvento(evento){
    return evento.target.parentNode.parentNode.childNodes;
}