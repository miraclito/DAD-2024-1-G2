package com.example.mspedido.feign;

import com.example.mspedido.dto.ClienteDto;
import com.example.mspedido.dto.ProductoDto;
import com.example.mspedido.entity.Pedido;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-clientes-service",path = "/clientes")
public interface ClienteFeign {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "clienteListarPorIdCB", fallbackMethod = "fallBackclienteListarPorIdCB")
    ResponseEntity<ClienteDto> listarPorId(@PathVariable(required = true) Integer id);
    default ResponseEntity<ClienteDto> fallBackclienteListarPorIdCB(Integer id, Exception e) {
        ClienteDto clienteDto =new ClienteDto();

        return ResponseEntity.ok(clienteDto);
    }
}
