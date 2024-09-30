package healthcare_appointment_system;

import java.util.Scanner;

public class HealthcareAppointmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentManager manager = new AppointmentManager();
        int choice;

        do {
            System.out.println("\n--- Healthcare Appointment System ---");
            System.out.println("1.schedule an appointment");
            System.out.println("2.view all appointments");
            System.out.println("3.cancel an appointment");
            System.out.println("4.exit");
            System.out.print("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Schedule appointment
                    System.out.print("enter doctor's name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("enter patient's name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("enter date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("enter time (HH:MM): ");
                    String time = scanner.nextLine();
                    manager.scheduleAppointment(doctorName, patientName, date, time);
                    break;
                
                case 2:
                    //view all appointments
                    manager.viewAppointments();
                    break;
                
                case 3:
                    //cancel appointment
                    System.out.print("rnter patient's name: ");
                    String cancelPatientName = scanner.nextLine();
                    System.out.print("Enter Date (YYYY-MM-DD): ");
                    String cancelDate = scanner.nextLine();
                    System.out.print("enter time (HH:MM): ");
                    String cancelTime = scanner.nextLine();
                    manager.cancelAppointment(cancelPatientName, cancelDate, cancelTime);
                    break;
                
                case 4:
                    
                    System.out.println("exiting");
                    break;
                
                default:
                    System.out.println("please try again");
            }
        } while (choice != 4);

        scanner.close();
    }
}
