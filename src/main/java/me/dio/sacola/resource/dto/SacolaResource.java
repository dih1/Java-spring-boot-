package me.dio.sacola.resource.dto;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.service.SacolaService;
import org.springframework.lang.NonNullApi;
import org.springframework.web.bind.annotation.*;
@Api (value="/ifood-devweek/sacolas")
@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
 private final SacolaService sacolaService;

    @PostMapping
    public Item icluirItemNaSacola(@RequestBody ItemDto itemDto) {
     return sacolaService.incluirItemNaSacola(itemDto);

    }

    @GetMapping("/{id}")
  public Sacola verSacola(@PathVariable Long id){
  return sacolaService.verSacola(id);
  }
  @PatchMapping("/fecharSacola/{sacolaId}")

  public Sacola fecharSacola(@PathVariable Long idSacola,
                             @RequestParam("formaPagamento") int formaPagamento){
        return sacolaService.fecharSacola(idSacola,formaPagamento);
  }
}