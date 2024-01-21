package com.codingtestcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingtestcrud.entiti.Kendaraan;
import com.codingtestcrud.service.ProductService;

@Controller
@RequestMapping("")
public class HomeController {
@Autowired
private ProductService productService;

    @GetMapping
    public String welcome(Model model){
        String message = "Aplikasi Data Kendaraan";
        model.addAttribute("msg", message);
        model.addAttribute("kendaraan", productService.fineAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("kendaraan" ,new Kendaraan());
        return "add";
    }

    @PostMapping("/save")
    public String save(Kendaraan kendaraan,Model model){
        productService.addKendaraan(kendaraan);
        return "redirect:/";
    }
@GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        productService.deleteById(id);
      return "redirect:/";
    }

    @GetMapping("/edit")
    public String edit(@PathVariable("id") Long id ,Model model){
        model.addAttribute("kendaraan" , productService.fineById(id));
      return "edit";
    }

    @PostMapping("/update")
    public String update(Kendaraan kendaraan,Model model){
        productService.update(kendaraan);
        return "redirect:/";
    }
}
