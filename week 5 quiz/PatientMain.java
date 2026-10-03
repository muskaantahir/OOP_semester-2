import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PatientMain {
    public static void main(String[] args) {
    Patient p1 = new Patient();
    Patient p2 = new Patient();
    Patient p3 = new Patient("orime", "minister", 123);

    System.out.println("xxxxxxxxxx");
    System.out.println(p1.equals(p1));
    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));

    Patient s1 = new Patient("sara", "khan", 403);
    Patient s2 = new Patient("sara", "khan", 403);

    System.out.println("xxxxxxxxxx");
    System.out.println("s1==s2 : " + (s1 == s2));
    System.out.println("s1.equals(s2)" +s1.equals(s2));

    System.out.println("s1.hashCode()" +s1.hashCode());
    System.out.println("s2.hashCode()" +s2.hashCode());

    Set <Patient> patients = new HashSet<>();
    patients.add(s1);
    patients.add(s2);
    System.out.println("Hashet Size : " +patients.size());
    Patient searchPatient = new Patient("sara", "khan", 403);
    System.out.println("Patient found :" +patients.contains(searchPatient));
}
}