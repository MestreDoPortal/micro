package com.reservasala.reserva_sala.controller;

import com.reservasala.reserva_sala.model.Reserva;
import com.reservasala.reserva_sala.model.Sala;
import com.reservasala.reserva_sala.service.ReservaService;
import com.reservasala.reserva_sala.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/reservas")
public class ReservasController {
    @Autowired
    private ReservaService reservaService;
    @Autowired
    private SalaService salaService;


    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", reservaService.listar());
        model.addAttribute("salas", salaService.listar());
        return "reservas";
    }


}