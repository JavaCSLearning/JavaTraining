import java.util.ArrayList;
import java.util.List;

public class CargoShip {

    private List<CrewMember> crewMemberList = new ArrayList<>();

    private final int capacity = 20;

    public int getAvailableSeats() {
        return capacity - crewMemberList.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<CrewMember> getCrewMemberList() {
        return crewMemberList;
    }

    public boolean addCrewMember(CrewMember crewMember) {
        if (getAvailableSeats() == 0)
            throw new IllegalArgumentException("No availble seats");

        if (crewMemberList.contains(crewMember))	return false;

        crewMemberList.add(crewMember);

        return true;
    }
}
