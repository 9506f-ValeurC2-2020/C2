package glg203.jsonDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import glg203.jsonDemo.model.Contact;
import glg203.jsonDemo.model.Telephone;
import glg203.jsonDemo.model.TypeInfo;

/**
 * ContactService
 */
@Service
public class ContactService {

    public Contact getContactParId(Long id) {
        Contact c = null;
        if (id == 3) {
            List<Telephone> telephones = new ArrayList<>();
            telephones.add(new Telephone(TypeInfo.BUREAU, "0193378"));
            telephones.add(new Telephone(TypeInfo.MAISON, "06766854"));
            c = new Contact(id, "nom" + id, "adresse" + id, telephones);
        } else {
            List<Telephone> telephones = new ArrayList<>();
            c = new Contact(id, "nom" + id, "adresse" + id, telephones);
        }
        return c;
    }
}