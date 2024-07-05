let controller = new NegociacaoController();

// Bind fazer o metodo executar no seu contexto e criação
// e não no contexto onde foi chamado
document.querySelector('.form').addEventListener('submit', controller.adiciona.bind(controller))