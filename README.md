# Task 
1. Написать программу, которая считает файл в формате JSON и десериализует его в Java объект.
   В случае отсутствия в JSON поля Market Capitalization, присваивать ему значение "no data"
```json
{
  "InsuranceCompanies": {
    "InsuranceCompany": [
      {
        "No": "1",
        "Name": "Berkshire Hathaway ( BRK.A)",
        "Market Capitalization": "$507.04 billion"
      },
      {
        "No": "2",
        "Name": "LFC"
      }
    ]
  }
}
```
2. Написать программу, которая сериализует Java объект класса Employee в JSON и сохраняет его в файл.
   Поле skills в итоговом JSON должно отображаться, как 'competencies'
```class
public class Employee {
    private int id;
    private String name;
    private List skills;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List getSkills() {
        return skills;
    }
    public void setSkills(List skills) {
        this.skills = skills;
    }
}
```
