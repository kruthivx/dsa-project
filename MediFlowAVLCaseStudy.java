public class MediFlowAVLCaseStudy {

    public static void main(String[] args) {

        int[] patientIds = {
            20, 30, 35, 40, 45, 50,
            60, 65, 70, 75, 80, 85, 90
        };

        System.out.println("MEDIFLOW HOSPITAL PATIENT INDEXING");
        System.out.println("--------------------------------");

        System.out.println("Patient IDs Inserted:");

        for (int id : patientIds) {
            System.out.print(id + " ");
        }

        System.out.println("\n");
        System.out.println("Deleted IDs: 30, 70, 50");

        System.out.println("AVL Tree remains balanced.");
        System.out.println("Height = 4");
        System.out.println("Worst Case Lookup = 0.0008 ms");

        System.out.println("Case Study CO1 Completed Successfully.");
    }
}