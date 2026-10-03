import java.util.Objects;
public class Patient {
    private String firstName;
    private String lastName;
    private int healthCardnumber ;

    public Patient(){
        this("unknown","unknown", -1);     
    }

    public Patient(String firstName, String lastName, int healthCardnumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthCardnumber = healthCardnumber;
    }

    @Override 
    public int hashCode(){
        return Objects.hash(this.firstName, this.lastName,this.healthCardnumber);
    } 

@Override
public boolean equals(Object obj) {

    if (this == obj) {
        return true;
    }

    if (obj == null) {
        return false;
    }

    if (!(obj instanceof Patient)) {
        return false;
    }

    Patient that = (Patient) obj;

    return this.healthCardnumber == that.healthCardnumber
        && this.firstName.equals(that.firstName)
        && this.lastName.equals(that.lastName);
} }