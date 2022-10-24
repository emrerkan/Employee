
    public class Employee
    {
    String name;
    float salary;
    int workHours;
    int dateYear;

    public Employee(String _name,float _salary,int _workHours,int _dateYears)
    {
        name = _name;
        salary = _salary;
        workHours = _workHours;
        dateYear = _dateYears;
    }
    private float Tax()
    {
        if(salary< 1000) return 0f;
        float vergi = 0.03f;
        return (salary * vergi);
        

    }
    private float Bonus()
    {
        if (workHours < 40) return 0;
        float bonus = (workHours - 40) * 30;
        return bonus;
        
    }
    private float RaiseSalary()
    {
        int workOnYears = 2021 - dateYear;
        float bonus = 0f;
        if(workOnYears > 19)
        {
            bonus = .15f;
        }
        else if(9 < workOnYears && workOnYears < 19)
        {
            bonus = .1f;
        }
        else
        {
            
            bonus = .05f;
        }
        
        
        return (salary * bonus);
        
    }
    private void TaxAndBonus(){
        float taxAndBonus = salary + Bonus() - Tax();
        System.out.print("\nVergi ve bonusla birlikte maaş :" + taxAndBonus);

    }
    private void ToplamMaas()
    {
        float toplamMaas = salary + Bonus() + RaiseSalary() - Tax();
        System.out.print("\nToplam Maas : " + toplamMaas);
    }
    
    private void ToString(){
        System.out.print("\nAdı :" + name);
        System.out.print("\nMaaşı :" + salary);
        System.out.print("\nÇalışma Saati :" + workHours);
        System.out.print("\nBaşlangıç yılı :" + dateYear);
        System.out.print("\nVergi : " + Tax());
        System.out.print("\nBonus :" + Bonus());
        System.out.print("\nMaaş Artışı: "+ RaiseSalary());
        TaxAndBonus();
        ToplamMaas();

    }
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee("Kemal",2000,45,1985);
        employee1.ToString();
    }
    }