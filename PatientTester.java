public class PatientTester {
    public static void main(String[] args) {
        PatientManager pm = new PatientManager();
        System.out.print(pm);
        Patient p1 = new Patient(1, 200);
        Patient p2 = new Patient(2, 400);
        Patient p3 = new Patient(3, 600);
        Patient p4 = new Patient(4, 800);
        pm.addPatient(p1);
        pm.addPatient(p2);
        pm.addPatient(p3);
        pm.addPatient(p4);
        System.out.print(pm);
        pm.caffeineAbsorption();
        pm.caffeineAbsorption();
        System.out.print(pm);
        Double maxCaf = 0.0;
        Patient maxCafP = pm.patients.get(0);
        for(int i=0;i<pm.patients.size();i++){
            if(maxCaf<pm.patients.get(i).caffeine){
                maxCaf = pm.patients.get(i).caffeine;
                maxCafP = pm.patients.get(i);
            }
        }
        pm.removPatient(pm.patients.indexOf(maxCafP));
        System.out.print(pm);
    }
}
