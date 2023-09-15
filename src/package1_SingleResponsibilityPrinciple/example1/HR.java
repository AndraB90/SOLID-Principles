package package1_SingleResponsibilityPrinciple.example1;

public class HR {
    private int budget;
    private EmailService emailService;
    private RegisterService registerService;

    public HR(int budget) {
        this.budget = budget;
        this.emailService= new EmailService();
        this.registerService = new RegisterService();
    }

    public void hire(Person person) {
        if (budget >= person.getDesiredSalary()){
            System.out.println("The person "+person.getName()+" is hired");
            registerService.register(person);
            emailService.eMailManager(person);
        }else{
            System.out.println("Sorry we will call you later. Wish you the best for the future!");
        }
    }


    @Override
    public String toString() {
        return "HR{" +
                "budget=" + budget +
                '}';
    }
}
