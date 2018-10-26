package io.mygu.iam.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserController {

    @GetMapping("/")
    fun getUser(model: Model): String {
        model["title"] = "User"
        return "user"
    }
}