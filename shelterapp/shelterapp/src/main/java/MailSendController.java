//import com.dmigus.shelterapp.api.EmailSender;
//import com.dmigus.shelterapp.beans.Mail;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class MailSendController {
//    public MailSendController(EmailSender emailSender) {
//        this.emailSender = emailSender;
//    }
//
//    private final EmailSender emailSender;
//
//
//    @RequestMapping("/contact")
//    public String Email(Model model) {
//        model.addAttribute("mail", new Mail());
//        return "contact";
//    }
//
//    @PostMapping("/contact")
//    public String SendEmail(@ModelAttribute Mail mail) {
//String subject=mail.getSubject();
//String sender=mail.getSender();
//String content=mail.getMessage();
//       emailSender.sendEmail("scroniskoswietyspokoj@gmail.com",subject,content,sender);
//
//        return "redirect:index";
//
//    }
//
//
//}


