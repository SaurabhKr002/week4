package queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTriage {
    private Queue<Patient> triageQueue;

    public HospitalTriage() {
        this.triageQueue = new PriorityQueue<>();
    }

    // Adds a patient to the priority queue
    public void addPatient(String name, int severity) {
        triageQueue.offer(new Patient(name, severity));
    }

    // Treats the highest-priority patient
    public String treatPatient() {
        return triageQueue.isEmpty() ? "No patients" : triageQueue.poll().getName();
    }

    // Checks if the queue is empty
    public boolean isEmpty() {
        return triageQueue.isEmpty();
    }

    // Inner class representing a patient
    private static class Patient implements Comparable<Patient> {
        private String name;
        private int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        public String getName() {
            return name;
        }

        // Compares based on severity (higher severity first)
        @Override
        public int compareTo(Patient other) {
            return Integer.compare(other.severity, this.severity);
        }
    }
}
