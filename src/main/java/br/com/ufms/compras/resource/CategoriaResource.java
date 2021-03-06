package br.com.ufms.compras.resource;

import br.com.ufms.compras.entity.Categoria;
import br.com.ufms.compras.exception.StandartError;
import br.com.ufms.compras.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
@CrossOrigin("http://localhost:8080")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> buscarCategoriaPorId(@PathVariable("id") Long id) {
        Categoria categoria = categoriaService.buscarCategoriaPorId(id);
        return ResponseEntity.ok().body(categoria);
    }
}
