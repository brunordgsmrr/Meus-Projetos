// Classe que faz a comunicação entre a model e a view
class NegociacaoController {

    constructor() {
        
        // Com bind, o "$" mantem o contexto de document para o metodo queryselector
        let $ = document.querySelector.bind(document);
    
        this._inputData = $('#data');
        this._inputQuantidade = $('#quantidade');
        this._inputValor = $('#valor');

    }

    adiciona(event) {
        event.preventDefault();

        console.log(this._inputData.value)
    }

}