import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HolaMundo {

  @RequestMapping("/saluda")
  @ResponseBody
  String saluda(){
    "Hola mundo ${new Date()}"
  }
}
