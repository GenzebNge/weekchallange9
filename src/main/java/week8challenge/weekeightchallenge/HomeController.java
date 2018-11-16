package week8challenge.weekeightchallenge;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

     @Autowired
    UserRepository userRepository;

    @Autowired
    MyMessageRepository myMessageRepository;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("messages" , myMessageRepository.findAll());
        return "homepage";
    }


}
