package com.javaintro;

public class BugTracker {

	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	int getBugId() {
		return bugId;

	}

	String getapplicationName() {
		return applicationName;
	}

	String getbugTitle() {
		return bugTitle;
	}

	String getseverity() {
		return severity;
	}

	String getpriority() {
		return priority;
	}

	String getstatus() {
		return status;
	}

	String getassignedDeveloper() {
		return assignedDeveloper;
	}

	void assignToDeveloper(int bugid, String developerName) {
		if (bugId == bugid) {
			assignedDeveloper = developerName;
			updateStatus("In Development");

		}

	}

	void updateStatus(String newStatus) {
		status = newStatus;
	}

	void displayBugSummary() {

		System.out.println("BugTrack Information");
		System.out.println("---------------------");
		System.out.println("BugId:" + " " + getBugId());
		System.out.println("ApplicationName:" + " " + getapplicationName());
		System.out.println("BugTitle:" + " " + getbugTitle());
		System.out.println("Severity:" + " " + getseverity());
		System.out.println("Priority:" + " " + getpriority());
		System.out.println("Status:" + " " + getstatus());
		System.out.println("AssignedDeveloper:" + " " + getassignedDeveloper());
	}

	public static void main(String[] args) {

		BugTracker b = new BugTracker();

		b.bugId = 101;
		b.applicationName = "Banking Application";
		b.bugTitle = "Login button not working";
		b.severity = "High";
		b.priority = "High";
		b.status = "open";
		b.assignedDeveloper = "Not Assigned";

		b.assignToDeveloper(101, "varsha");

		b.displayBugSummary();

	}

}
