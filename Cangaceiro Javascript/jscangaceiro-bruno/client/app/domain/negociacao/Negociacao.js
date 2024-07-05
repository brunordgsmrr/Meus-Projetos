// Clase são estruturas para um conjunto de dados
// neste caso é a estrutura de uma negociação

class Negociacao {
    // Uma classe possui atributos, métodos e construtor

    // Construtor é uma função utilizada para instanciar um objeto de uma classe
    // ou seja, a função que vai criar um objeto como base na estrutura da negociação
    constructor(_data, _quantidade, _valor) {

        // Object.assign recebe o objeto de destino e incrementa os objetos de origem
        Object.assign(this, { _quantidade, _valor });
        this._data = new Date(_data.getTime());

        // Congela a instancia da classe, assim não será possivel alterar os valores do objeto
        Object.freeze(this);
    }

    // Metodos, são comportamentos de uma classe, aqui por exemplo ela nos entrega
    // o volume da negociação apartir da multiplicação dos seus valores.
    get volume() {
        return this._quantidade * this._valor;
    }

    get data() {
        return this._data;
    }

    get quantidade() {
        return this._quantidade;
    }

    get valor() {
        return this._valor;
    }
}
