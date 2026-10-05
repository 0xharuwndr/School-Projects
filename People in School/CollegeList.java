import java.util.Scanner;

public class CollegeList {
    public static void main(String[] args) {
        Scanner rvn = new Scanner(System.in);
        System.out.println("Press E for Employee, F for Faculty, S for Student:");
        
        char select = rvn.next().charAt(0);
        
        switch(select) {
            case 'E':
            case 'e':
                System.out.println("Type employee's name, contact number, salary, and department");
                System.out.println("Press Enter every input.");
                
                Employee emp = new Employee();
                rvn.nextLine();
                emp.setName(rvn.nextLine());
                emp.setContactNum(rvn.nextLine());
                emp.setSalary(rvn.nextInt());
                rvn.nextLine();
                emp.setDepartment(rvn.nextLine());
                
                System.out.println("----------------------");
                System.out.println("Name: " + emp.getName());
                System.out.println("Contact Number: " + emp.getContactNum());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Department: " + emp.getDepartment());
                System.out.println("----------------------");
                
                break;
            case 'F':
            case 'f':
                System.out.println("Type employee's name, contact number, salary, department, and is Active");
                System.out.println("Press Enter every input.");
                
                Faculty fac = new Faculty();
                rvn.nextLine();
                fac.setName(rvn.nextLine());
                fac.setContactNum(rvn.nextLine());
                fac.setSalary(rvn.nextInt());
                rvn.nextLine();
                fac.setDepartment(rvn.nextLine());
                String statusInput = rvn.nextLine().trim().toUpperCase();
                fac.setStatus(statusInput.equals("Y"));
                
                
                System.out.println("----------------------");
                System.out.println("Name: " + fac.getName());
                System.out.println("Contact Number: " + fac.getContactNum());
                System.out.println("Salary: " + fac.getSalary());
                System.out.println("Department: " + fac.getDepartment());
                System.out.println("Status: " + (fac.getStatus() ? "Regular" : "Not Regular"));
                
                
                System.out.println("----------------------");
                
                break;
            case 'S':
            case 's':
                System.out.println("Type student's name, contact number, program, and year level");
                System.out.println("Press Enter every input.");
                
                Student stu = new Student();
                rvn.nextLine();
                stu.setName(rvn.nextLine());
                stu.setContactNum(rvn.nextLine());
                stu.setProgram(rvn.nextLine());
                stu.setyearLevel(rvn.nextInt());

                
                System.out.println("----------------------");
                System.out.println("Name: " + stu.getName());
                System.out.println("Contact Number: " + stu.getContactNum());
                System.out.println("Program: " + stu.getProgram());
                System.out.println("Year Level: " + stu.getyearLevel());
                System.out.println("----------------------");

                break;
            default:
                System.out.println("Invalid Input");
        }
        rvn.close();
    }
}
