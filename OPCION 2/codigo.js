const boton = document.querySelector(".boton");

boton.addEventListener("click", buscarPalabra);

async function buscarPalabra(){
    const palabraBuscada = document.querySelector(".palabraBuscada").value;
    const enlace = `https://rae-api.com/api/words/${palabraBuscada}`;
    const resultado = document.querySelector(".resultado");

    try {
        const respuesta = await fetch(enlace);
        const datos = await respuesta.json();

        if (datos.ok){
            const palabra = datos.data.word;
            const etimologia = datos.data.meanings[0].origin.raw;

            let definiciones = "";
            datos.data.meanings.forEach(meaning => {
                definiciones += "<ul>";
                meaning.senses.forEach(sense => {
                    definiciones += `<li>${sense.raw}</li>`;
                });
                definiciones += "</ul>";
            });
            resultado.innerHTML = `
            <h2>${palabra} (${etimologia})</h2>
 
            ${definiciones}
        `;
        resultado.style.color = "green";
        } else{
            resultado.innerHTML = "LA PALABRA NO SE ENCUENTRA";
            resultado.style.color = "red";
        }
    } catch(error){

    }

}