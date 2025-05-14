package br.universidade.loja.controller;

import br.universidade.loja.model.Produto;
import br.universidade.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {
    @Autowired
    ProdutoRepository pr;

    @GetMapping("/saudacao")
    public String saudacao() {
        return "Olá, seja bem-vindo à loja!";
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return pr.findAll();
    }

    @PostMapping("/produtos")
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return pr.save(produto);
    }
}
