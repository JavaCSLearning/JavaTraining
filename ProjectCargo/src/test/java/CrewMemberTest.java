import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrewMemberTest {

    private CargoShip cargoShip;

    private CrewMember crewMember;

    @Before
    public void setup() {
        cargoShip = new CargoShip();
        crewMember = new CrewMember("aaa111", 22, "John", "Seaman");
        
    }

    @Test
    public void checkNameAfterAddingNewCrewMember() {
        cargoShip.addCrewMember(crewMember);

        assertEquals("John", crewMember.getName() ) ;
    }

    @Test
    public void checkAgeOfAddedCrewMEmber() {
        cargoShip.addCrewMember(crewMember);

        Assert.assertEquals(22, crewMember.getAge());

    }

    @Test
    public void checkJobDescription() {
        cargoShip.addCrewMember(crewMember);

        Assert.assertEquals("Seaman", crewMember.getJobDescription());

    }

    @Test
    public void checkID() {
        cargoShip.addCrewMember();

        Assert.assertEquals("aaa111", crewMember.getId());

    }
}