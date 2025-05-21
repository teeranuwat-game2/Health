# Health

 Concept: Health Check Console App
📋 Scenario:
We simulate a health system where there are different types of patients (e.g., ChildPatient, AdultPatient). Each patient has basic info and can get a health check.

Interface: CheckupService → defines performCheckup()

Base class: Patient → name, age (primitive), weight (wrapper Double)

Subclasses: ChildPatient, AdultPatient → inherit from Patient

Output: Print basic patient info and a result of health check