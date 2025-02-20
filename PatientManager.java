import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patients;

    public PatientManager(){
        patients = new ArrayList<Patient>();
    }

    public int addPatient(Patient p){
        patients.add(p);
        return patients.indexOf(p);
    }

    public Patient removPatient(int p){
        Patient patient = patients.get(p);
        patients.remove(p);
        return patient;
    }

    public void caffeineAbsorption(){
        for(int i=0;i<patients.size();i++){
            patients.get(i).caffeine -= 160;
            if(patients.get(i).caffeine <= 0){
                patients.remove(i);
            }
        }
    }

    public String toString(){
        String output = "";
        if(patients.get(0)!=null){
            for(int i=0;i<patients.size();i++){
                Patient p = patients.get(i);
                if(p!=null){
                    output += p.id + " " + p.caffeine + "\n";
                }
            }
        } else {
            output += "Empty";
        }
        return output;
    }
}
