import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

    public class AddressBookTestCSV {
        @Test
        public <Contact, AddressBookCSV> void  ContactEntries() {
            Contact john =  new     Contact("dinesh", "rakesh", "dinesh@gmail.com", "rajasthan", "Address", "415117", "gujarat", "+91-123456789");
            Contact peterson = new  Contact("ramesh", "narendra", "ramesh@gmail.com", "jharkhand",  "456788", "chattisgarh", "+91-34567890");
            Contact  devil = new    Contact("Sameer", "rushikesh", "rushi@gmail.com", "Maharashtra", "Address", "4151510", "Uttarakhand", "+11-567890");
            List<Contact> contacts = Arrays.asList(new Contact[]{john, peterson, devil});
            AddressBookCSV addressBookCSVIOService = new AddressBookCSV ("addressCsvTest.csv");
            addressBookCSVIOService.equals(contacts);
            List<Contact> readContacts = addressBookCSVIOService.equals();
            assertEquals(john.toString(), readContacts.get(0).toString());
            assertEquals(peterson.toString(), readContacts.get(1).toString());
            assertEquals(devil.toString(), readContacts.get(2).toString());
        }
    }






