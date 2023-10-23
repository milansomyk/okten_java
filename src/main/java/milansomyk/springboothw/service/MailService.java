package milansomyk.springboothw.service;

import lombok.RequiredArgsConstructor;
import milansomyk.springboothw.dto.CarDto;
import org.apache.logging.log4j.message.SimpleMessage;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MailService {
    private final MailSender mailSender;
    public void notifyCreatedCar(CarDto createdCar){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(System.getProperty("spring.mail.username"));
        simpleMailMessage.setTo("milansomyk@gmail.com");
        simpleMailMessage.setSubject("New car");
        simpleMailMessage.setText("New car was created, id: %d, model: %s, producer: %s, power: %d".formatted(createdCar.getId(), createdCar.getModel(), createdCar .getProducer(), createdCar.getPower()));
        mailSender.send(simpleMailMessage);
    }
    public void notifyDeletedCar(int id){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(System.getProperty("spring.mail.username"));
        simpleMailMessage.setTo("milansomyk@gmail.com");
        simpleMailMessage.setSubject("Deleted car");
        simpleMailMessage.setText("Car with id: %d was deleted".formatted(id));
        mailSender.send(simpleMailMessage);
    }
}
