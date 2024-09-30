package healthcare_appointment_system;

import java.util.ArrayList;
import java.util.Scanner;

class Appointment {
    private String doctorName;
    private String patientName;
    private String date;
    private String time;

    public Appointment(String doctorName, String patientName, String date, String time) {
        this.doctorName = doctorName;
        this.patientName = patientName;
        this.date = date;
        this.time = time;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Appointment [Doctor: " + doctorName + ", Patient: " + patientName + ", Date: " + date + ", Time: " + time + "]";
    }
}

class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    //new appointment
    public void scheduleAppointment(String doctorName, String patientName, String date, String time) {
        Appointment newAppointment = new Appointment(doctorName, patientName, date, time);
        appointments.add(newAppointment);
        System.out.println("appointment scheduled successfully.");
    }

    //view all appointments
    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("no appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    //cancel an appointment
    public void cancelAppointment(String patientName, String date, String time) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.getPatientName().equalsIgnoreCase(patientName) && appointment.getDate().equals(date) && appointment.getTime().equals(time)) {
                appointments.remove(i);
                found = true;
                System.out.println("appointment canceled successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("no matching appointment found.");
        }
    }
}

