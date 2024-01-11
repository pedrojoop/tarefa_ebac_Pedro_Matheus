document.addEventListener("DOMContentLoaded", function () {
    document.querySelector("form").addEventListener("submit", function (event) {
        event.preventDefault();

        const modelo = document.getElementById("modelo").value;
        const marca = document.getElementById("marca").value;

        fetch(`/carros/pesquisar?modelo=${modelo}&marca=${marca}`)
            .then(response => response.json())
            .then(data => {
                const tbody = document.querySelector("tbody");
                tbody.innerHTML = "";

                data.forEach(carro => {
                    const tr = document.createElement("tr");
                    const tdModelo = document.createElement("td");
                    tdModelo.textContent = carro.modelo;
                    const tdMarca = document.createElement("td");
                    tdMarca.textContent = carro.marca;

                    tr.appendChild(tdModelo);
                    tr.appendChild(tdMarca);

                    tbody.appendChild(tr);
                });
            })
            .catch(error => {
                console.error("Erro ao realizar a pesquisa:", error);
            });
    });

    function carregarListaCarros() {
        fetch("/carros")
            .then(response => response.json())
            .then(data => {
                const tbody = document.querySelector("tbody");
                tbody.innerHTML = "";

                data.forEach(carro => {
                    const tr = document.createElement("tr");
                    const tdModelo = document.createElement("td");
                    tdModelo.textContent = carro.modelo;
                    const tdMarca = document.createElement("td");
                    tdMarca.textContent = carro.marca;

                    tr.appendChild(tdModelo);
                    tr.appendChild(tdMarca);

                    tbody.appendChild(tr);
                });
            })
            .catch(error => {
                console.error("Erro ao carregar a lista de carros:", error);
            });
    }

    carregarListaCarros();
});
