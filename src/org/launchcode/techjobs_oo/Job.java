package org.launchcode.techjobs_oo;

import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
//        this.id = getId();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

@Override
public String toString(){
        if(id==0){
            return"Data not available";
        } else if(name == null){
            return "Data not available";
        }else if(employer== null){
            return "Data not available";
        } else if(location == null){
            return "Data not available";
        } else if(positionType==null){
            return "Data not available";
        }else if(coreCompetency == null){
            return "Data not available";
        }
        return ("\n"+ "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Employer: " + employer  + "\n" +
                "Location: " + location + "\n" +
                "Position Type: " + positionType + "\n" +
                "Core Competency: " + coreCompetency +  "\n");
    }

//    @Override
//    public String toString() {
//            if (this.name == null || this.name.equals("")) {
//                return "Data not available";
//            } if (this.id == 0) {
//                return "Data not available";
//            } if (this.employer == null || this.employer.equals("")) {
//                return "Data not available";
//            } if (this.location == null || this.location.equals("")) {
//            return "Data not available";
//            } if (this.positionType == null || this.positionType.equals("")) {
//            return "Data not available";
//            } if (this.coreCompetency == null || this.coreCompetency.equals("")) {
//            return "Data not available";
//            }
//            return "\n" + "ID: " + this.id + "\n" +
//                        "Name: " + this.name + "\n" +
//                        "Employer: " + this.employer + "\n" +
//                        "Location: " + this.location + "\n" +
//                        "Position Type: " + this.positionType + "\n" +
//                        "Core Competency: " + this.coreCompetency + "\n";
//            }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

// Add getters for each field EXCEPT nextId.
// Add setters for each field EXCEPT nextID and id.

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer; }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
