package streamApiPracticePackage;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIOnlinePracticeQuestions1 {

	//https://medium.com/@bhaskarsharan/practice-java-streams-questions-8a76cbfee1be
	
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

		EmployeeFactory employeeFactory = new EmployeeFactory();
		employeeList = employeeFactory.getAllEmployee();

		// TODO
		// QnA
		
		//1. List all distinct project in non-ascending order.
		System.out.println("Answer 1 : ");
		employeeList.stream()
		.map(x -> x.getProjects())
		.flatMap(x -> x.stream())
		.distinct()
		.sorted(Comparator.comparing(Project::getName).reversed())
		.forEach(x -> System.out.println(x.getName()));
		System.out.println("\n\n");
		
		
		//2. Print full name of any employee whose firstName starts with ‘A’.
		System.out.println("Answer 2 : ");
		employeeList.stream()
		.filter(emp -> emp.getFirstName().startsWith("A"))
		.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
		System.out.println("\n");
		
		
		//3. List of all employee who joined in year 2023 (year to be extracted 
		//from employee id i.e., 1st 4 characters)
		System.out.println("Answer 3 : ");
		employeeList.stream()
		.filter(emp -> emp.getId().startsWith("2023"))
		.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
		System.out.println("\n");
		
		
		//4. Sort employees based on firstName, for same firstName sort by salary.
		System.out.println("Answer 4 : ");
		employeeList.stream()
		.sorted(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getSalary))
		.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary()));
		System.out.println("\n");
		
		
		//5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
		System.out.println("Answer 5 : ");
		int nthHighest = 3;
		employeeList.stream()
		.map(emp -> emp.getSalary())
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(nthHighest - 1)
		.limit(1)
		.flatMap((targetSalary) -> employeeList.stream().filter(emp -> emp.getSalary() == targetSalary))
		.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary()));
		System.out.println("\n");
		
		
//		//5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
//		System.out.println("Answer 5 : ");
//		int nthHighest = 3;
//		
//		TreeMap<Integer, List<Employee>> empTreeMap = new TreeMap<>();
//		empTreeMap.putAll(
//				employeeList.stream()
//				.collect(Collectors.groupingBy(Employee::getSalary))
//			);
//		
//		empTreeMap.entrySet().stream()
//		.skip(nthHighest - 1)
//		.limit(1)
//		.forEach((mapset) -> mapset.getValue().stream().forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName())));
		
		//6. Print min salary.
		System.out.println("Answer 6 : ");
		int minSalary = employeeList.stream()
		.map(emp -> emp.getSalary())
		.min(Comparator.comparing(Integer::valueOf))
//		.min(Comparator.naturalOrder())
		.get();
		System.out.println(minSalary);
		System.out.println("\n");
		
		
		//7. Print all employees with min salary.
		System.out.println("Answer 7 : ");
		employeeList.stream()
		.map(emp -> emp.getSalary())
		.distinct()
		.sorted()
		.limit(1)
		.flatMap(minSal -> employeeList.stream()
							.filter(emp -> emp.getSalary() == minSal))
		.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary()));
		System.out.println("\n");
		
		
		//13. Create a map based on this data, they key should be the year of joining, and value should be
		//list of all the employees who joined the particular year.
		System.out.println("Answer 13 : ");
		Map<String, List<String>> yearEmpMap = employeeList.stream()
		.collect(Collectors.groupingBy(emp -> emp.getId().substring(0, 4), Collectors.mapping(Employee::getFirstName, Collectors.toList())));
//		System.out.println(yearEmpMap);
		yearEmpMap.forEach((year, empList) -> System.out.println(year + " " + empList));
		System.out.println("\n");
		
		
		//14. Create a map based on this data, the key should be year of joining and value should be the 
		//count of people joined in that particular year.
		System.out.println("Answer 14 : ");
		Map<String, List<String>> yearEmpMap2 = employeeList.stream()
		.collect(Collectors.groupingBy(emp -> emp.getId().substring(0, 4), Collectors.mapping(Employee::getFirstName, Collectors.toList())));
		yearEmpMap2.forEach((year, empList) -> System.out.println(year + " " + empList.size()));
		System.out.println("\n");
		
    }
	
}

class Project {

    private String name;
    private String team;
    private String projectManager;

    Project(){
    }

    public Project(String name, String team, String projectManager) {
        this.name = name;
        this.team = team;
        this.projectManager = projectManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }
}

class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private int salary;
    private int totalLaptopsAssigned;
    // OneToMany
    private List<Project> projects;

    Employee(){
    }

    public Employee(String id, String firstName, String lastName, int salary, int totalLaptopsAssigned,
            List<Project> projects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.totalLaptopsAssigned = totalLaptopsAssigned;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", projects="
                + projects + "]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public List<Project> getProjects() {
        return projects;
    }
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    public int getTotalLaptopsAssigned() {
        return totalLaptopsAssigned;
    }
    public void setTotalLaptopsAssigned(int totalLaptopsAssigned) {
        this.totalLaptopsAssigned = totalLaptopsAssigned;
    }
}

class EmployeeFactory extends Employee{

    ArrayList<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployee(){

        Project Delta = new Project("Delta Model", "Login", "Robert Downey Jr");
        Project Beta = new Project("Beta Enhancement", "Authentication", "Chris");
        Project TwoFactorAuth = new Project("Two Factor Authentication", "Authentication", "MSD");
        Project CommonUI = new Project("Common UI", "UI", "Robert Downey Jr");
        Project Pegasus = new Project("Pegasus Model", "Data", "Vikram");
        Project CustomerOnboarding = new Project("Customer Onboarding", "Ads", "Vedha");
        Project Verification = new Project("Source Verification", "Data", "Pablo");
        Project RemoveUsers = new Project("Remove Invalid User", "Proxy", "Jeetu");
        Project SiteReliability = new Project("Site Reliability", "Admin", "Zaheer Khan");
        Project DataTransition = new Project("Data Transition", "Data", "Atif Aslam");
        Project TwoPhaseDeployment =new Project("Two Phase Deployment", "Deployment", "Shaktiman");

        employees.add(new Employee("2020Emp0234", "Bhaskar", "Sharan", 900000, 1, Arrays.asList(Delta, Beta)));
        employees.add(new Employee("2012Emp1923", "Dev", "Sharma", 3500000, 3, Arrays.asList(Pegasus, CustomerOnboarding, Beta, SiteReliability)));
        employees.add(new Employee("2017Emp0721", "Priti", "Kabir", 1800000, 3, Arrays.asList(TwoFactorAuth, Beta, CommonUI)));
        employees.add(new Employee("2017Emp00031", "Chris", "Martin", 2200000, 2, Arrays.asList(Delta, TwoFactorAuth)));
        employees.add(new Employee("2013Emp0872", "Sanjay", "Singhania", 2200000, 3, Arrays.asList(Pegasus, Delta, RemoveUsers, DataTransition)));
        employees.add(new Employee("2022Emp0087", "Babu", "Rao", 900000, 1, Arrays.asList(TwoFactorAuth)));
        employees.add(new Employee("2019Emp0050", "Dev", "Anand", 1300000, 1, Arrays.asList(RemoveUsers, CommonUI)));
        employees.add(new Employee("2023Emp0934", "Shruti", "Sen", 1100000, 1, Arrays.asList(Pegasus)));
        employees.add(new Employee("2023Emp1033", "Akshay", "Kumar", 1200000, 0, Arrays.asList(Delta)));
        employees.add(new Employee("2015Emp0009", "Babu", "Dutt", 2600000, 2, Arrays.asList(Verification, RemoveUsers, TwoPhaseDeployment)));

        return employees;
    }
}


