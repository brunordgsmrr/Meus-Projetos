// Array com os campos do formulario
let campos = [
    document.querySelector("#data"),
    document.querySelector("#valor"),
    document.querySelector("#quantidade"),
];
console.log(campos);

// Precisamos de tbody, pois ele receberá a tr que vamos construir
let tbody = document.querySelector("table tbody");

// Adiciona um listener ao submit do form
document.querySelector(".form").addEventListener("submit", function (event) {

    event.preventDefault();

    // Cria um elemento <tr> 
    let tr = document.createElement('tr');

    // Itera sobre o array campos, onde cada item é um campo do formulario tratado como OBJETO
    campos.forEach(function(campo){

        let td = document.createElement('td'); // Cria um elemento <td> sendo tratado como objeto no js

        td.textContent = campo.value; // Adiciona conteudo de texto ao campo td

        tr.appendChild(td);  // Insere o elemento <td> ao <tr>
    })

    let tdVolume = document.createElement('td');  // Cria um novo elemento <td> para volume

    tdVolume.textContent = campos[1].value * campos[2].value;  // Insere o resultado da multiplicação ao elemento <td>

    tr.appendChild(tdVolume);  // Adiciona o elemento filho <td> ao elemento pai <tr>

    tbody.appendChild(tr); // Adiciona o elemento filho <tr> ao elemento pai <tbody>


    // Limpar o campos
    campos[0].value = '';
    campos[1].value = '1';
    campos[2].value = '0';
    campos[0].focus();
});
