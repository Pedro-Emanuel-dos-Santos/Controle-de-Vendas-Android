package com.example.controlevendas

class Estoque {

    private val produtos = mutableListOf<Produto>()

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun listarProdutos(): List<Produto> {
        return produtos
    }

    fun buscarProduto(nome: String): Produto? {
        return produtos.find { it.nome == nome }
    }
}