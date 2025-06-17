package com.superendividamento.controller;

import com.superendividamento.model.PanoramaResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Arrays;

@RestController
@RequestMapping("/api/panorama")
@CrossOrigin(origins = "*")
public class PanoramaController {
    private static final Logger logger = LoggerFactory.getLogger(PanoramaController.class);

    @GetMapping
    public ResponseEntity<?> getPanorama() {
        try {
            // TODO: Implementar lógica para calcular panorama
            PanoramaResponse response = new PanoramaResponse();
            response.setTotalOriginal(new BigDecimal("10000.00"));
            response.setTotalCorrigido(new BigDecimal("12000.00"));
            response.setMediaParcelas(new BigDecimal("500.00"));
            response.setMaiorParcela(new BigDecimal("550.00"));
            response.setMenorParcela(new BigDecimal("450.00"));
            response.setComprometimentoMaximo(new BigDecimal("30.00"));
            response.setEvolucaoMensal(Arrays.asList(
                new BigDecimal("1000.00"),
                new BigDecimal("950.00"),
                new BigDecimal("900.00")
            ));
            response.setPercentualCorrecao(new BigDecimal("20.00"));
            response.setPrazoTotal(24);

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            logger.error("Erro ao gerar panorama: ", e);
            return ResponseEntity.internalServerError().body("Erro ao gerar panorama: " + e.getMessage());
        }
    }
} 