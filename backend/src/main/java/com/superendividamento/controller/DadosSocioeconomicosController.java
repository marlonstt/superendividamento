package com.superendividamento.controller;

import com.superendividamento.model.DadosSocioeconomicosRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/dados-socioeconomicos")
@CrossOrigin(origins = "*")
public class DadosSocioeconomicosController {
    private static final Logger logger = LoggerFactory.getLogger(DadosSocioeconomicosController.class);

    @PostMapping
    public ResponseEntity<?> salvarDados(@RequestBody DadosSocioeconomicosRequest request) {
        try {
            logger.info("Recebendo dados socioeconômicos: {}", request);
            // TODO: Implementar persistência dos dados
            return ResponseEntity.ok("Dados salvos com sucesso");
        } catch (Exception e) {
            logger.error("Erro ao salvar dados socioeconômicos: ", e);
            return ResponseEntity.internalServerError().body("Erro ao salvar dados: " + e.getMessage());
        }
    }
} 