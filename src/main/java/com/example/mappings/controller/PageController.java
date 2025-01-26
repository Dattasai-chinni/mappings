package com.example.mappings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {

	@GetMapping("/")
    public String login() {
        return "login"; // Render login.html
    }

    // Render the chat page
    @GetMapping("/chat")
    public String chat(@RequestParam(value = "username", required = false) String username, Model model) {
        if (username == null || username.isEmpty()) {
            return "redirect:/"; // Redirect to login if no username is provided
        }
        model.addAttribute("username", username); // Pass username to the chat page
        return "index"; // Render index.html (chat page)
    }
}
